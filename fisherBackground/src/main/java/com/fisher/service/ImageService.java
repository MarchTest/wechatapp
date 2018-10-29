package com.fisher.service;

import javax.servlet.http.HttpServletResponse;

import com.fisher.pojo.Image;

public interface ImageService {
	 public byte [] getImage(HttpServletResponse response,String imagePath);
	 public Image getImage(Integer merchandiseId);
}
