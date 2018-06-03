package com.chineseivy.controller;

import com.chineseivy.bean.Activity;
import com.chineseivy.bean.ActivityPackage;
import com.chineseivy.service.ActivityService;
import com.chineseivy.util.OBeanBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

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

    @RequestMapping(value = "/insertPicture",
            method = RequestMethod.POST)
    @ResponseBody
    public OBeanBase insertPicture(@RequestParam(value = "picture") MultipartFile picture, HttpServletRequest request) {
        OBeanBase fileMessage = new OBeanBase();
        String filePath = "";
        if (picture.isEmpty()) {
            System.out.println("文件未上传");
        }else {
            String originalPictureName = picture.getOriginalFilename();
            String suffix = originalPictureName.substring(originalPictureName.lastIndexOf("."));
            String fileName = request.getSession().getServletContext().getRealPath("/")+ UUID.randomUUID().toString() + suffix;
            filePath = fileName;
            File savePicture = new File(filePath);
            fileMessage.setMessage(filePath);
            try {
                picture.transferTo(savePicture);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return fileMessage;
    }
    
    @RequestMapping(value = "/insertActivity",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    /**
    * @Program: ActivityController.java
    * @Method: insertActivity
    * @Description: 增加活动信息
    * @Author: Shiming Lee
    * @Create: 2018/6/2 17:57
    * @params: [activity]
    * @returns: com.chineseivy.util.OBeanBase
    **/
    public OBeanBase insertActivity(@RequestBody Activity activity){
        int flag = activityService.insertActivity(activity);
        activityMessage.setDatamessage(flag);
        return activityMessage;
    }

    @RequestMapping(value = "/selectAllActivity",
            method = RequestMethod.GET)
    @ResponseBody
    /**
    * @Program: ActivityController.java
    * @Method: selectAllActivity
    * @Description: 选择全部活动信息
    * @Author: Shiming Lee
    * @Create: 2018/6/2 17:58
    * @params: []
    * @returns: com.chineseivy.util.OBeanBase
    **/
    public OBeanBase selectAllActivity(){
        List<ActivityPackage> activityList = activityService.selectAllActivity();
        activityMessage.setDatamessage(activityList);
        return activityMessage;
    }
    
    @RequestMapping(value = "/selectByPrimaryKey",
            method = RequestMethod.GET)
    @ResponseBody
    /**
    * @Program: ActivityController.java
    * @Method: selectByPrimaryKey
    * @Description: 
    * @Author: Shiming Lee
    * @Create: 2018/6/2 18:00
    * @params: [activityId]
    * @returns: com.chineseivy.util.OBeanBase
    **/
    public OBeanBase selectByPrimaryKey(@RequestParam(value = "activityId") Integer activityId){
        ActivityPackage activity = activityService.selectByPrimaryKey(activityId);
        activityMessage.setDatamessage(activity);
        return activityMessage;
    }

    @RequestMapping(value = "/updateByPrimaryKey",
            method = RequestMethod.PUT)
    @ResponseBody
    public OBeanBase updateByPrimaryKey(@RequestBody Activity activity){
        int flag = activityService.updateByPrimaryKeySelective(activity);
        activityMessage.setDatamessage(flag);
        return activityMessage;
    }

    @RequestMapping(value = "/deleteByPrimaryKey",
            method = RequestMethod.DELETE)
    @ResponseBody
    public OBeanBase deleteByPrimaryKey(@RequestParam(value = "activityId") Integer activityId){
        int flag = activityService.deleteByPrimaryKey(activityId);
        activityMessage.setDatamessage(flag);
        return activityMessage;
    }
}
