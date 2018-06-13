package com.chineseivy.controller;

import com.chineseivy.bean.Activity;
import com.chineseivy.bean.ActivityPackage;
import com.chineseivy.bean.GoodPackage;
import com.chineseivy.service.ActivityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by admin on 2018/6/9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc-config.xml","classpath:spring-mybatis.xml"})
public class ActivityControllerTest {

    @Autowired
    private ActivityService activityService;
    @Test
    public void selectAllActivity() {
        List<ActivityPackage> activitys = activityService.selectAllActivity();
        for (ActivityPackage activity:activitys) {
            System.out.println("+++++++++"+activity.getFormatactivityendtime());
            List<GoodPackage> goods = activity.getGoods();
            for (GoodPackage goodPackage:goods) {
                System.out.println("goodname:"+goodPackage.getGoodname());
                System.out.println("price:"+goodPackage.getPrice());
            }
        }
    }

    @Test
    public void selectByPrimaryKey() {
        ActivityPackage activity = activityService.selectByPrimaryKey(1);
        System.out.println(activity.getActivitytheme());
        System.out.println(activity.getFormatactivityendtime());
        System.out.println(activity.getGoods().get(1).getGoodname());
    }

    @Test
    public void deleteByPrimaryKey(){
        int flag = activityService.deleteByPrimaryKey(2);
        System.out.println("删除目录："+flag);
    }

    @Test
    public void selectValidActivity(){
        List<ActivityPackage> activityList = activityService.selectValidActivity();
        for (ActivityPackage activity:activityList) {
            System.out.println(activity.getActivityendtime());
        }
    }

    @Test
    public void updateActivity(){
        Activity activity = new Activity();
        activity.setActivityid(6);
        activity.setActivitytheme("2018-8-8");
        activity.setActivitytext("fewsjmaeiogreredc");
        int flag = activityService.updateByPrimaryKeySelective(activity);
        System.out.println(flag);
    }
}