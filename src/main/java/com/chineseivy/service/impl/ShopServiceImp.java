package com.chineseivy.service.impl;

import com.chineseivy.bean.Shop;
import com.chineseivy.dao.ShopMapper;
import com.chineseivy.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: ProfessionalDesign
 * @description: 商品
 * @author: Shiming Lee
 * @create: 2018-05-25 21:48
 **/
@Service("shopService")
public class ShopServiceImp implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    public Shop selectShopByPrimaryKey(Integer shopId) {
        Shop shop = shopMapper.selectByPrimaryKey(shopId);
        return shop;
    }
}


