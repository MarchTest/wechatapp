package com.fisher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisher.mapper.HomeImageMapper;
import com.fisher.pojo.HomeImage;
import com.fisher.service.HomeImageService;

@Service
public class HomeImageServiceImpl implements HomeImageService{
	 
	@Autowired
	private HomeImageMapper homeImageMapper;
	
	@Override
	public List<HomeImage> getAllHomeImage() {
		
		return homeImageMapper.getAllHomeImage();
	}
	
}
