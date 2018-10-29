package com.fisher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisher.mapper.ClazzMapper;
import com.fisher.pojo.Clazz;
import com.fisher.service.ClazzService;

@Service
public class ClazzServiceImpl implements ClazzService{
	@Autowired
	private ClazzMapper clazzMapper;
	
	
	@Override
	public List<Clazz> getAllClazz() {
		
		return clazzMapper.getAllClazz();
	}
	
	

}
