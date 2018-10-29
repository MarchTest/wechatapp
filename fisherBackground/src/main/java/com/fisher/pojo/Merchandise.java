package com.fisher.pojo;

import java.util.List;

public class Merchandise {
    private Integer merchandiseId;

    private String merchandiseName;

    private Double merchandisePrice;
    //商品有多个种类的话的哪一种,属性
    private String merchandiseAttribute;
    //商品价格范围
    private String merchandisePricescope;
    //库存
    private Integer merchandiseInventory;
    //添加时间(data类型)
    private String merchandiseTime;
    //类型
    private Integer clazzId;

    //是否促销
    private Integer ispromotion;

    //商品评论,后面注入
    private List<Comment> comment;
    
    private Image image;
    
    private Describe describe;
    
	public Describe getDescribe() {
		return describe;
	}

	public void setDescribe(Describe describe) {
		this.describe = describe;
	}

	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Integer getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(Integer merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public String getMerchandiseName() {
        return merchandiseName;
    }

    public void setMerchandiseName(String merchandiseName) {
        this.merchandiseName = merchandiseName == null ? null : merchandiseName.trim();
    }

    public Double getMerchandisePrice() {
        return merchandisePrice;
    }

    public void setMerchandisePrice(Double merchandisePrice) {
        this.merchandisePrice = merchandisePrice;
    }

    public String getMerchandiseAttribute() {
        return merchandiseAttribute;
    }

    public void setMerchandiseAttribute(String merchandiseAttribute) {
        this.merchandiseAttribute = merchandiseAttribute == null ? null : merchandiseAttribute.trim();
    }

    public String getMerchandisePricescope() {
        return merchandisePricescope;
    }

    public void setMerchandisePricescope(String merchandisePricescope) {
        this.merchandisePricescope = merchandisePricescope == null ? null : merchandisePricescope.trim();
    }

    public Integer getMerchandiseInventory() {
        return merchandiseInventory;
    }

    public void setMerchandiseInventory(Integer merchandiseInventory) {
        this.merchandiseInventory = merchandiseInventory;
    }

    public String getMerchandiseTime() {
        return merchandiseTime;
    }

    public void setMerchandiseTime(String merchandiseTime) {
        this.merchandiseTime = merchandiseTime == null ? null : merchandiseTime.trim();
    }
    
    public Integer getClazzId() {
        return clazzId;
    }

    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }
    

    public Integer getIspromotion() {
        return ispromotion;
    }

    public void setIspromotion(Integer ispromotion) {
        this.ispromotion = ispromotion;
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "商品id: "+merchandiseId+" 商品名称: "+merchandiseName;
	}

	
}