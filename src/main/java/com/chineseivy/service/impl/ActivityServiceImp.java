package com.chineseivy.service.impl;/**
 * Created by admin on 2018/5/31
 */

import com.chineseivy.bean.Activity;
import com.chineseivy.bean.ActivityPackage;
import com.chineseivy.bean.Good;
import com.chineseivy.bean.GoodPackage;
import com.chineseivy.dao.ActivityMapper;
import com.chineseivy.dao.GoodMapper;
import com.chineseivy.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

/**
 * @program: ProfessionalDesign
 * @description: 活动
 * @author: Shiming Lee
 * @create: 2018-05-31 10:09
 **/
@Service("activityService")
public class ActivityServiceImp implements ActivityService {

    @Autowired
    private ActivityMapper activityMapper;
    @Autowired
    private GoodMapper goodMapper;

    public int deleteByPrimaryKey(Integer activityid) {
        System.out.println(")))))))))))))");
        List<Good> goods = goodMapper.selectGoodByActivityId(activityid);
        System.out.println("(((((((((((((((((((："+goods.size());
        for (Good good:goods) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=---=-=-=-=");
            good.setActivityid(1);
            System.out.println("good.goodid"+good.getGoodid());
            int flag = goodMapper.updateByPrimaryKeySelective(good);
            System.out.println("更新："+flag);
        }
        int flag = activityMapper.deleteByPrimaryKey(activityid);
        return flag;
    }

    public int insertActivity(Activity record) {
        int flag = activityMapper.insertSelective(record);
        return flag;
    }

    public ActivityPackage selectByPrimaryKey(Integer activityid) {
        System.out.println("-------------------------------------------");
        ActivityPackage activity = activityMapper.selectByPrimaryKey(activityid);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        activity.setFormatactivitystarttime(simpleDateFormat.format(activity.getActivitystarttime()));
        activity.setFormatactivityendtime(simpleDateFormat.format(activity.getActivityendtime()));
        System.out.println("================================");
        return activity;
    }

    public int updateByPrimaryKeySelective(Activity record) {
        System.out.println("fjweiljfdiiews");
        System.out.println(record.getActivitystarttime());
        int flag = activityMapper.updateByPrimaryKeySelective(record);
        return flag;
    }

    public List<ActivityPackage> selectAllActivity() {
        System.out.println("--------------------------------selectAllActivity");
        List<ActivityPackage> activityList = activityMapper.selectAllActivity();
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd");
        for (ActivityPackage activity:activityList) {
            activity.setFormatactivitystarttime(simpleFormatter.format(activity.getActivitystarttime()));
            activity.setFormatactivityendtime(simpleFormatter.format(activity.getActivityendtime()));
        }
        return activityList;
    }

    public List<ActivityPackage> selectValidActivity() {
        Date date = new Date();
        List<ActivityPackage> activityList = activityMapper.selectValidActivity(date);
        return activityList;
    }
}

