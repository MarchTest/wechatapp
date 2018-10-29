package com.fisher;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@MapperScan("com.fisher.mapper")
public class FisherBackgroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(FisherBackgroundApplication.class, args);
	}
}
