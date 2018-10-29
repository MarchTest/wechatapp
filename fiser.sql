/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.17-log : Database - fisher
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`fisher` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `fisher`;

/*Table structure for table `cart` */

DROP TABLE IF EXISTS `cart`;

CREATE TABLE `cart` (
  `cart_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`cart_id`),
  KEY `FK_Reference_7` (`user_id`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cart` */

/*Table structure for table `cartmessage` */

DROP TABLE IF EXISTS `cartmessage`;

CREATE TABLE `cartmessage` (
  `merchandise_id` int(11) DEFAULT NULL,
  `cart_id` int(11) DEFAULT NULL,
  `merchandise_nums` int(11) DEFAULT NULL,
  `putTime` varchar(20) DEFAULT NULL,
  KEY `cartMerchandise_index` (`merchandise_id`),
  KEY `cartId_index` (`cart_id`),
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`merchandise_id`) REFERENCES `merchandise` (`merchandise_id`),
  CONSTRAINT `FK_Reference_9` FOREIGN KEY (`cart_id`) REFERENCES `cart` (`cart_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cartmessage` */

/*Table structure for table `clazz` */

DROP TABLE IF EXISTS `clazz`;

CREATE TABLE `clazz` (
  `clazz_id` int(11) NOT NULL AUTO_INCREMENT,
  `clazz_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`clazz_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

/*Data for the table `clazz` */

insert  into `clazz`(`clazz_id`,`clazz_name`) values (1,'主食'),(2,'蔬菜'),(3,'水果'),(4,'零食'),(5,'坚果');

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `merchandise_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `comment_level` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`comment_id`),
  KEY `FK_Reference_3` (`merchandise_id`),
  KEY `FK_Reference_5` (`user_id`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`merchandise_id`) REFERENCES `merchandise` (`merchandise_id`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

/*Table structure for table `homeimage` */

DROP TABLE IF EXISTS `homeimage`;

CREATE TABLE `homeimage` (
  `merchandise_id` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `imagePath` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_12` (`merchandise_id`),
  CONSTRAINT `FK_Reference_12` FOREIGN KEY (`merchandise_id`) REFERENCES `merchandise` (`merchandise_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `homeimage` */

insert  into `homeimage`(`merchandise_id`,`id`,`imagePath`) values (2,1,'b1.jpg'),(3,2,'b2.jpg'),(4,3,'b3.jpg');

/*Table structure for table `image` */

DROP TABLE IF EXISTS `image`;

CREATE TABLE `image` (
  `image_id` int(11) NOT NULL AUTO_INCREMENT,
  `merchandise_id` int(11) DEFAULT NULL,
  `image_path` varchar(50) DEFAULT NULL,
  `image_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`image_id`),
  KEY `FK_Reference_10` (`merchandise_id`),
  CONSTRAINT `FK_Reference_10` FOREIGN KEY (`merchandise_id`) REFERENCES `merchandise` (`merchandise_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `image` */

insert  into `image`(`image_id`,`merchandise_id`,`image_path`,`image_name`) values (2,2,'2/瓜子.png','瓜子'),(3,3,'3/素米.png','素米'),(4,4,'4/芹菜.png','芹菜'),(5,5,'5/猕猴桃.png','猕猴桃'),(6,6,'6/猕猴桃.png','猕猴桃'),(7,7,'7/糖水梨.png','糖水梨');

/*Table structure for table `merchandise` */

DROP TABLE IF EXISTS `merchandise`;

CREATE TABLE `merchandise` (
  `merchandise_id` int(11) NOT NULL AUTO_INCREMENT,
  `merchandise_name` varchar(20) DEFAULT NULL,
  `merchandise_price` double DEFAULT NULL,
  `merchandise_attribute` varchar(20) DEFAULT NULL,
  `merchandise_priceScope` varchar(20) DEFAULT NULL,
  `merchandise_inventory` int(11) DEFAULT NULL,
  `merchandise_time` varchar(20) DEFAULT NULL,
  `clazz_id` int(11) DEFAULT NULL,
  `isPromotion` int(11) DEFAULT NULL,
  PRIMARY KEY (`merchandise_id`),
  KEY `merchandisName` (`merchandise_name`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `merchandise` */

insert  into `merchandise`(`merchandise_id`,`merchandise_name`,`merchandise_price`,`merchandise_attribute`,`merchandise_priceScope`,`merchandise_inventory`,`merchandise_time`,`clazz_id`,`isPromotion`) values (2,'瓜子',5.9,'100g','5.9元',100,'2018-9-8',5,1),(3,'素米',5.9,'1000g','5.9元',100,'2018-9-8',1,1),(4,'芹菜',5.9,'200g','5.9元',100,'2018-9-8',2,1),(5,'猕猴桃',30,'绿心500g','30-50',1000,'2018-9-8',3,1),(6,'猕猴桃',50,'红心500g','30-50',1000,'2018-9-8',3,1),(7,'糖水梨',20,'500g','20-50',1000,'2018-9-8',4,1);

/*Table structure for table `path` */

DROP TABLE IF EXISTS `path`;

CREATE TABLE `path` (
  `path_id` int(11) NOT NULL AUTO_INCREMENT,
  `image_id` int(11) DEFAULT NULL,
  `path_value` varchar(30) DEFAULT NULL,
  `path_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`path_id`),
  KEY `FK_Reference_6` (`image_id`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`image_id`) REFERENCES `image` (`image_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `path` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) DEFAULT NULL,
  `user_password` varchar(30) DEFAULT NULL,
  `openid` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `openidIndex` (`openid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

/*Data for the table `user` */

insert  into `user`(`user_id`,`user_name`,`user_password`,`openid`) values (1,'����  ���� ���� ����','user_password','openid'),(4,'?  ? ? ?','123456?','oVzZt1UECUmD_TnONg059CrdyO-8');

/*Table structure for table `user_describe` */

DROP TABLE IF EXISTS `user_describe`;

CREATE TABLE `user_describe` (
  `describe_id` int(11) NOT NULL AUTO_INCREMENT,
  `merchandise_id` int(11) DEFAULT NULL,
  `describe_text` text,
  PRIMARY KEY (`describe_id`),
  KEY `FK_Reference_11` (`merchandise_id`),
  CONSTRAINT `FK_Reference_11` FOREIGN KEY (`merchandise_id`) REFERENCES `merchandise` (`merchandise_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_describe` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
