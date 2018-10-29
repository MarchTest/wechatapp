package com.fisher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisher.mapper.CommentMapper;
import com.fisher.mapper.DescribeMapper;
import com.fisher.mapper.MerchandiseMapper;
import com.fisher.pojo.Comment;
import com.fisher.pojo.Describe;
import com.fisher.pojo.Image;
import com.fisher.pojo.Merchandise;
import com.fisher.service.ImageService;
import com.fisher.service.MerchandiseService;
@Service
public class MerchandiseServiceImpl implements MerchandiseService{

    @Autowired
    private MerchandiseMapper merchandiseMapper;
    @Autowired
    private CommentMapper commentMapper;
    //因为image在service中涉及到path信息的注入,所以在这注入service更合适
    @Autowired
    private ImageService imageService;
    @Autowired
    private DescribeMapper describeMapper;
    
    
    //这里属性的注入考虑用aop编程解决,主要是不了解aop编程的传参问题
    //后面解决
    @Override
    public Merchandise getMerchandise(int merchandiseId) {
        // TODO Auto-generated method stub
        Merchandise merchandise=merchandiseMapper.selectByPrimaryKey(merchandiseId);
        //注入商品的其他属性
        setMerchandiseAttribute(merchandise);
        return merchandise;
    }
    
    //传入需要查询的属性
    @Override
    public List<Merchandise> getMerchandises(Merchandise merchandise) {
        // TODO Auto-generated method stub
        List <Merchandise> merchandises=merchandiseMapper.selectBykeyWords(merchandise);
        setMerchandiseAttribute(merchandises);
        return merchandises;
    }
    
    
    
    /**
     * 设置单个merchandise属性
     * @param merchandise
     */
    public void setMerchandiseAttribute(Merchandise merchandise){
    	if(merchandise!=null){
    		int merchandiseId=merchandise.getMerchandiseId();
    		//注入商品的其他属性
            List<Comment>comments=commentMapper.SelectCommentByMerchandiseKey(merchandiseId);
            if(comments!=null&&comments.size()>0)
            	merchandise.setComment(comments);
            Image image=imageService.getImage(merchandiseId);
            if(image!=null)
            	merchandise.setImage(image);
            Describe describe=describeMapper.selectByMerchandiseKey(merchandiseId);
            if(describe!=null)
            	merchandise.setDescribe(describe);
    	}
    	
    }
    
    /**
     * 设置merchandise集合属性
     * @param merchandises
     */
    public void setMerchandiseAttribute(List<Merchandise> merchandises){
    	if(merchandises!=null&&merchandises.size()>0){
    		for(Merchandise merchandise:merchandises){
    			setMerchandiseAttribute(merchandise);
    		}
    	}
    }

	@Override
	public List<Merchandise> getMerchandisesByPromotion(int promotion) {
		// TODO Auto-generated method stub
		List<Merchandise> merchandises= merchandiseMapper.selectByPromotionKey(promotion);
		setMerchandiseAttribute(merchandises);
		return merchandises;
	}

	@Override
	public List<Merchandise> getMerchandiseByClazz(int clazzId) {
		List<Merchandise> merchandises= merchandiseMapper.selectByClazzId(clazzId);
		setMerchandiseAttribute(merchandises);
		return merchandises;
	}

	@Override
	public List<Merchandise> getByPrice(double low, double high) {
		List<Merchandise> merchandises= merchandiseMapper.selectByPrice(low, high);
		setMerchandiseAttribute(merchandises);
		return merchandises;
	}
}
