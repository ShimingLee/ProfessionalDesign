package com.chineseivy.controller;

import com.chineseivy.bean.Good;
import com.chineseivy.bean.Recommend;
import com.chineseivy.bean.RecommendExample;
import com.chineseivy.bean.RecommendPackage;
import com.chineseivy.service.RecommendService;
import com.chineseivy.util.OBeanBase;
import com.wordnik.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by admin on 2018/4/18
 */

@Controller
@RequestMapping(value = "/reommend")
public class RecommendController {
    @Autowired
    @Qualifier("recommendService")
    private RecommendService recommendService;
    private OBeanBase recommendMessage = new OBeanBase();

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

    @RequestMapping(value = "/findRecommendByRecommendId",
            method = RequestMethod.GET)
    @ResponseBody
    /**
    * @Program: RecommendController.java
    * @Method: findRecommendByRecommendId
    * @Description: 查找推荐商品信息根据Id
    * @Author: Shiming Lee
    * @Create: 2018/5/24 11:48
    * @params: [recommendId]
    * @returns: com.chineseivy.util.OBeanBase
    **/
    public OBeanBase findRecommendByRecommendId(@RequestParam(value = "recommendId")int recommendId){
        RecommendPackage recommend = recommendService.selectByRecommendKey(recommendId);
        if (recommend.getRecommendtheme()!=null) {
            recommendMessage.setDatamessage(recommend);
            recommendMessage.setMessage("查找成功");
            recommendMessage.setClassName(this.getClass());
        }else {
            recommendMessage.setMessage("查找失败");
            recommendMessage.setClassName(this.getClass());
        }
        return recommendMessage;
    }

    @RequestMapping(value = "/findAllRecommend",
            method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public OBeanBase findAllRecommend(){
        List<RecommendPackage> recommendList = recommendService.selectAllRecommendMessages();
        recommendMessage.setDatamessage(recommendList);
        return recommendMessage;
    }

    @RequestMapping(value = "/insertRecommend",
            method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    /**
    * @Program: RecommendController.java
    * @Method: insertRecommend
    * @Description: 插入推荐商品
    * @Author: Shiming Lee
    * @Create: 2018/5/24 12:45
    * @params: [recommend]
    * @returns: com.chineseivy.util.OBeanBase
    **/
    public OBeanBase insertRecommend(@RequestBody Recommend recommend){
        int flag = recommendService.insertRecommend(recommend);
        recommendMessage.setDatamessage(flag);
        recommendMessage.setMessage("添加成功");
        return  recommendMessage;
    }

    @RequestMapping(value = "/updateRecommend",
            method = RequestMethod.PUT,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    /**
    * @Program: RecommendController.java
    * @Method: updateRecommend
    * @Description: 更新推荐信息
    * @Author: Shiming Lee
    * @Create: 2018/6/2 17:20
    * @params: [recommend]
    * @returns: com.chineseivy.util.OBeanBase
    **/
    public OBeanBase updateRecommend(@RequestBody Recommend recommend){
        int flag = recommendService.updateByRecommendId(recommend);
        recommendMessage.setDatamessage(flag);
        recommendMessage.setMessage("更新成功");
        return recommendMessage;
    }

    @RequestMapping(value = "/deleteRecommend",
            method = RequestMethod.DELETE)
    @ResponseBody
    /**
    * @Program: RecommendController.java
    * @Method: deleteRecommend
    * @Description: 删除推荐信息
    * @Author: Shiming Lee
    * @Create: 2018/6/2 17:20
    * @params: [recommendId]
    * @returns: com.chineseivy.util.OBeanBase
    **/
    public OBeanBase deleteRecommend(@RequestParam(value = "recommendId")int recommendId){
        int flag = recommendService.deleteByRecommendId(recommendId);
        recommendMessage.setDatamessage(flag);
        return recommendMessage;
    }
}
