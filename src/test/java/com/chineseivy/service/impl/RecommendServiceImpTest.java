package com.chineseivy.service.impl;

import com.chineseivy.bean.Recommend;
import com.chineseivy.bean.RecommendPackage;
import com.chineseivy.dao.RecommendMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by admin on 2018/5/29
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc-config.xml","classpath:spring-mybatis.xml"})
public class RecommendServiceImpTest {

    @Autowired
    private RecommendMapper recommendMapper;

    @Test
    public void insertRecommend() {
        Recommend recommend = new Recommend();
        recommend.setRecommendimg("fsdfseee");
        recommend.setRecommendendtime(new Date());
        int flag = recommendMapper.insertSelective(recommend);
        System.out.println("影响的行数：" + flag);
    }

    @Test
    public void selectByRecommendKey() {
        RecommendPackage recommendPackage = recommendMapper.selectByPrimaryKey(1);
        System.out.println(recommendPackage.getRecommendtheme());
    }

    @Test
    public void updateByRecommendId() {
        Recommend recommend = new Recommend();
        recommend.setRecommendimg("43333");
        recommend.setRecommendid(1);
        int flag = recommendMapper.updateByPrimaryKeySelective(recommend);
      System.out.println("影响的行数"+flag);
    }
}