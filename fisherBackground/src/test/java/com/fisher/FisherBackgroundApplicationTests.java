package com.fisher;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fisher.mapper.PathMapper;
import com.fisher.mapper.UserMapper;
import com.fisher.pojo.Merchandise;
import com.fisher.pojo.User;
import com.fisher.service.ImageService;
import com.fisher.service.MerchandiseService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=FisherBackgroundApplication.class)
public class FisherBackgroundApplicationTests {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ImageService imageService;
	@Autowired
	private PathMapper pathmapper;
	@Autowired
	private MerchandiseService merchandiseService;
	@Test
	public void contextLoads() {
	/*	User test=new User();
		test.setUserName("test");
		test.setOpenid("test1");
		test.setUserPassword("123456");
		userMapper.insert(test);
		*/
		List<Merchandise> merchandise=merchandiseService.getByPrice(7.0, 10.0);
		for(Merchandise m:merchandise){
			System.out.println(m);
		}
	}
	@Test
	public void test(){
		Merchandise merchandise=new Merchandise();
		merchandise.setIspromotion(1);
		List<Merchandise> merchandises=merchandiseService.getMerchandisesByPromotion(1); 
		for(Merchandise mer:merchandises){
			System.out.print(mer);
			System.out.println("图片信息: " +mer.getImage().getImageName());
		}
	}

}
