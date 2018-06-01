package com.chineseivy.service;

import com.chineseivy.bean.Shop;

/**
 * Created by admin on 2018/4/18
 */
public interface ShopService {
    /**
    * @Program: ShopService.java
    * @Method:
    * @Description: 更新商品信息
    * @Author: Shiming Lee
    * @Create: 2018/5/25 21:30
    * @params:
    * @returns:
    **/
    Shop selectShopByPrimaryKey(Integer shopId);
}
