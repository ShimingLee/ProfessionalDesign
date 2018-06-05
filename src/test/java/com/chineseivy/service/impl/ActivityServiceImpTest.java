package com.chineseivy.service.impl;

import com.chineseivy.bean.Activity;
import com.chineseivy.bean.ActivityPackage;
import com.chineseivy.dao.ActivityMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by admin on 2018/6/4
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc-config.xml","classpath:spring-mybatis.xml"})
public class ActivityServiceImpTest {

    @Autowired
    private ActivityMapper activityMapper;
    @Test
    public void deleteByPrimaryKey() {

    }

    @Test
    public void insertActivity() {
        Activity activity = new Activity();
        activity.setActivitytheme("jfeilsfjewo");
        activityMapper.insertSelective(activity);
    }

    @Test
    public void selectByPrimaryKey() {
        ActivityPackage activity = activityMapper.selectByPrimaryKey(1);
        System.out.println(activity.getActivitytheme());
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void selectAllActivity() {
    }
}