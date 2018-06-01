package com.chineseivy.service;

import com.chineseivy.bean.GoodClass;
import com.chineseivy.bean.GoodClassPackage;

import java.util.List;

/**
 * Created by admin on 2018/5/25
 */
public interface GoodClazzService {
    GoodClassPackage selectGoodClazzByPrimaryKey(Integer goodId);

    int deleteByPrimaryKey(Integer goodclassid);

    int insertSelective(GoodClass record);

    int updateByPrimaryKeySelective(GoodClass record);

    List<GoodClassPackage> selectAllGoodClass();
}
