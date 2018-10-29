package com.fisher.controller;


import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisher.mapper.UserMapper;
import com.fisher.pojo.Image;
import com.fisher.service.ImageService;

@RestController
public class ImageController {
    
    @Autowired
    private ImageService imageService;

    /**
     * 从服务器获取图片的Api控制器
     * @param response
     * @param imagePath:在后台的存储路径:格式为:path/文件名.jpg:默认在resources文件夹下的images子文件夹中
     * @return
     */
    @RequestMapping("/getImage")
    public byte[] getImages(HttpServletResponse response,String path){
    	 System.out.println("路径:"+path);
    	String ext=path.substring(path.lastIndexOf("."));
    	Set<String> allows=new HashSet<String>();
    	allows.add(".jpg");
    	allows.add(".png");
    	allows.add(".gif");
    	allows.add(".jpeg");
    	System.out.println("后缀:"+ext);
    	if(!allows.contains(ext)){
    		return "not allowed".getBytes();
    	}
    	if(path==null||"".equals(path.trim())){
    		//微信小程序页面跳转老是发送2次请求,第一次不带path的路径,第二次会带有path
    		//通过wx:navigation函数他就只发送第一次不带参数的请求,为什么????
    		//先在这里判断后台解决这个问题,以后再想办法在前端解
    		
    		//通过自定义navigation跳转函数他就只发送了一次,我感觉同一个界面他是js与wxml异步加载的
    		//先渲染了页面,然后同步加载js,所以图片请求发送了就发送了2次
    		return null;
    	}
        return imageService.getImage(response, path);
    }
    
    @RequestMapping("test")
    public void test(){
        Image image=imageService.getImage(1);
    }
}
