package com.chineseivy.service;

import com.chineseivy.bean.Activity;
import com.chineseivy.bean.ActivityPackage;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2018/4/18
 */
@Service("activityService")
public interface ActivityService {
    int deleteByPrimaryKey(Integer activityid);

    int insertActivity(Activity record);

    ActivityPackage selectByPrimaryKey(Integer activityid);

    int updateByPrimaryKeySelective(Activity record);

    List<ActivityPackage> selectAllActivity();

    List<ActivityPackage> selectValidActivity();
}
