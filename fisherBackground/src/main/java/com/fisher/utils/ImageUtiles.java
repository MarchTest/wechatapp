package com.fisher.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.util.ResourceUtils;

public class ImageUtiles {
    @SuppressWarnings("resource")
    public static byte [] getImages(String path){
     
        try { 
            File file=ResourceUtils.getFile("classpath:images/"+path);
            FileInputStream image=new FileInputStream(file);
            if(image!=null){
                //获取图片大小
                int size=image.available();
                byte [] data=new byte[size];
                //读取数据
                image.read(data);
                image.close();
                return data;
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
