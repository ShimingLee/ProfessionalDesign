package com.chineseivy.controller;/**
 * Created by admin on 2018/5/30
 */

import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: ProfessionalDesign
 * @description: 测试
 * @author: Shiming Lee
 * @create: 2018-05-30 11:16
 **/
@Controller

public class userController {
    @RequestMapping(value = "/admin")
    @ResponseBody
    public int print(){
        int flag = 1;
        return flag;
    }
}

