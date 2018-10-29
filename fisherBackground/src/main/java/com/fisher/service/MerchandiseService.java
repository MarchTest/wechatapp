package com.fisher.service;

import java.util.List;

import com.fisher.pojo.Merchandise;

public interface MerchandiseService {
    Merchandise getMerchandise(int merchandiseId);
    
    List<Merchandise> getMerchandises(Merchandise merchandise);
    
    List<Merchandise> getMerchandisesByPromotion(int promotion);
    
    List<Merchandise> getMerchandiseByClazz(int clazzId);
    
    List<Merchandise> getByPrice(double low,double high);
}
