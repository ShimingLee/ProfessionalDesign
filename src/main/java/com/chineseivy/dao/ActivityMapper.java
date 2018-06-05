package com.chineseivy.dao;

import com.chineseivy.bean.Activity;
import com.chineseivy.bean.ActivityExample;
import java.util.List;

import com.chineseivy.bean.ActivityPackage;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

public interface ActivityMapper {
    int deleteByPrimaryKey(Integer activityid);

    int insertSelective(Activity record);

    ActivityPackage selectByPrimaryKey(Integer activityid);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);

    List<ActivityPackage> selectAllActivity();
}