package com.chineseivy.service.impl;/**
 * Created by admin on 2018/5/31
 */

import com.chineseivy.bean.Activity;
import com.chineseivy.bean.ActivityPackage;
import com.chineseivy.dao.ActivityMapper;
import com.chineseivy.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public int deleteByPrimaryKey(Integer activityid) {
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
        System.out.println("================================");
        return activity;
    }

    public int updateByPrimaryKeySelective(Activity record) {
        int flag = activityMapper.updateByPrimaryKeySelective(record);
        return flag;
    }

    public List<ActivityPackage> selectAllActivity() {
        System.out.println("--------------------------------");
        List<ActivityPackage> activityList = activityMapper.selectAllActivity();
        System.out.println("============================================");
        return activityList;
    }
}

