package com.fisher.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisher.pojo.HomeImage;
import com.fisher.pojo.Merchandise;
import com.fisher.pojo.User;
import com.fisher.service.HomeImageService;
import com.fisher.service.MerchandiseService;
import com.fisher.service.UserService;

@RestController
public class LoginController {
    //用户默认密码
    private final String userPassword="123456?";
    

   
	@Autowired
    private UserService userService;
	/**
	 * 
	 * @param openId 微信用户对应的唯一的id
	 * @return
	 */
	@RequestMapping("/login")
	public String Login(String openId,String userNickname){
		User user=userService.selectByOpenid(openId);
		System.out.println(openId+" "+userNickname);
		if(user==null||user.getUserName()==""){
		    //添加新用户,因为user为null
		    user=new User();
		    user.setOpenid(openId);
		    user.setUserName(userNickname);
		    user.setUserPassword(userPassword);
		    userService.insertSelective(user);
		    System.out.println("添加新用户:" +user.toString());
		}
		//读取用户历史信息
		System.out.println("用户信息:"+user.toString());
		return "success";
	}

	
}
