package com.fisher.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisher.pojo.Clazz;
import com.fisher.pojo.HomeImage;
import com.fisher.pojo.Merchandise;
import com.fisher.service.ClazzService;
import com.fisher.service.HomeImageService;
import com.fisher.service.MerchandiseService;

@RestController
public class MerchandiseController {
    @Autowired
    private MerchandiseService merchandiseService;
    
    @Autowired
    private HomeImageService homeImageService;
    
    @Autowired
    private ClazzService clazzService;

	/**
	 * 获取商品详情信息
	 * @param merchandiseId
	 * @return
	 */
	@RequestMapping("/getDetails")
	public Map<String,Object> getDetails(String merchandiseId){
		Map<String,Object> info=new HashMap<String,Object>();
		int merchandiseID=Integer.parseInt(merchandiseId);
		Merchandise merchandise=merchandiseService.getMerchandise(merchandiseID);
		info.put("merchandise", merchandise);
		return info;
	}
	
	/**
	 * 获取首页信息
	 * @return
	 */
	@RequestMapping("/index")
	public Map<String,Object> getIndex(){
		Map<String,Object> info=new HashMap<String,Object>();
		//放入促销商品信息
		List<Merchandise> promotionMerchandises=merchandiseService.getMerchandisesByPromotion(1);
		info.put("promotionMerchandises", promotionMerchandises);
		//放入首页轮播图信息
		List<HomeImage> homeImages=homeImageService.getAllHomeImage();
		info.put("homeImages", homeImages);
		return info;
	}
	
	/**
	 * 获取当前商品的分类
	 * @return
	 */
	@RequestMapping("/clazz")
	public Map<String,Object> getClazz(){
		Map<String,Object> info=new HashMap<String,Object>();
		List<Clazz> clazzs=clazzService.getAllClazz();
		//Clazz firstClazz=clazzs.get(0);
		//int clazzId=firstClazz.getClazzId();
		//感觉在前端自动触发第一条记录的查询商品信息比较好//对的
		//List<Merchandise> clazzMerchandise=merchandiseService.getMerchandiseByClazz(clazzId);
		info.put("clazz", clazzs);
		return info;
	}
	
	@RequestMapping("/getClazzMerchandise")
	public Map<String,Object> getClazzMerchandises(String clazzId){
		Map<String,Object> info=new HashMap<String,Object>();
		int clazzID=Integer.parseInt(clazzId);
		List<Merchandise> clazzMerchandises=merchandiseService.getMerchandiseByClazz(clazzID);
		info.put("clazzMerchandise", clazzMerchandises);
		return info;
	}
}	
