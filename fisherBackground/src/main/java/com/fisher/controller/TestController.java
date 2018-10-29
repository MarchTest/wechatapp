package com.fisher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fisher.pojo.Merchandise;
import com.fisher.service.MerchandiseService;

/**
 * 这是一个测试controller
 * @author 57231
 *
 */
@RequestMapping("/test")
@RestController
public class TestController {
	
	
	@Autowired
	private MerchandiseService merchandiseService;
	
	
	@RequestMapping("/testMerchandise")
	//@ResponseBody
	public Object testMerchandiseService(){
		System.out.println("test");
		Merchandise merchandise=new Merchandise();
		merchandise.setIspromotion(1);
		List<Merchandise> merchandises=merchandiseService.getByPrice(7.0, 30.0); 
		for(Merchandise mer:merchandises){
			System.out.print("dddd");
		}
		
		
		System.out.print("dddd");
		return merchandise;
	}
	
	
	
}
