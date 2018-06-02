package com.chineseivy.controller;

import com.chineseivy.bean.Activity;
import com.chineseivy.bean.ActivityPackage;
import com.chineseivy.service.ActivityService;
import com.chineseivy.util.OBeanBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by admin on 2018/4/18
 */
@Controller
@RequestMapping(value = "/activity")
public class ActivityController {

    @Autowired
    @Qualifier(value = "activityService")
    private ActivityService activityService;
    private OBeanBase activityMessage = new OBeanBase();

    @RequestMapping(value = "/insertActivity",
            method = RequestMethod.POST)
    public OBeanBase insertActivity(Activity activity){
        int flag = activityService.insertActivity(activity);
        activityMessage.setDatamessage(flag);
        return activityMessage;
    }

    @RequestMapping(value = "/selectActivity",
            method = RequestMethod.GET)
    public OBeanBase selectAllActivity(){
        List<ActivityPackage> activityList = activityService.selectAllActivity();
        activityMessage.setDatamessage(activityList);
        return activityMessage;
    }

    @RequestMapping(value = "/selectByPrimaryKey",
            method = RequestMethod.GET)
    public OBeanBase selectByPrimaryKey(Integer activityId){
        ActivityPackage activity = activityService.selectByPrimaryKey(activityId);
        activityMessage.setDatamessage(activity);
        return activityMessage;
    }

    @RequestMapping(value = "/updateByPrimaryKey",
            method = RequestMethod.PUT)
    public OBeanBase updateByPrimaryKey(Activity activity){
        int flag = activityService.updateByPrimaryKeySelective(activity);
        activityMessage.setDatamessage(flag);
        return activityMessage;
    }

    @RequestMapping(value = "/deleteByPrimaryKey",
            method = RequestMethod.DELETE)
    public OBeanBase deleteByPrimaryKey(Integer activityId){
        int flag = activityService.deleteByPrimaryKey(activityId);
        activityMessage.setDatamessage(flag);
        return activityMessage;
    }
}
