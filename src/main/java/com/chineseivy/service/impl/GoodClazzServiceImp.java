package com.chineseivy.service.impl;/**
 * Created by admin on 2018/5/25
 */

import com.chineseivy.bean.GoodClass;
import com.chineseivy.bean.GoodClassPackage;
import com.chineseivy.dao.GoodClassMapper;
import com.chineseivy.service.GoodClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ProfessionalDesign
 * @description: 商品分类
 * @author: Shiming Lee
 * @create: 2018-05-25 22:15
 **/
@Service("goodClazzService")
public class GoodClazzServiceImp implements GoodClazzService {

    private GoodClassMapper goodClassMapper;

    public GoodClassPackage selectGoodClazzByPrimaryKey(Integer goodId) {
        GoodClassPackage goodClassPackage = goodClassMapper.selectByPrimaryKey(goodId);
        return goodClassPackage;
    }

    public int deleteByPrimaryKey(Integer goodclassid) {
        int flag = goodClassMapper.deleteByPrimaryKey(goodclassid);
        return flag;
    }

    public int insertSelective(GoodClass record) {
        int flag = goodClassMapper.insertSelective(record);
        return flag;
    }

    public int updateByPrimaryKeySelective(GoodClass record) {
        int flag = goodClassMapper.updateByPrimaryKeySelective(record);
        return flag;
    }

    public List<GoodClassPackage> selectAllGoodClass() {
        List<GoodClassPackage> goodClassList = goodClassMapper.selectAllGoodClass();
        return goodClassList;
    }

}

