package com.chineseivy.service;

import com.chineseivy.bean.Recommend;
import com.chineseivy.bean.RecommendExample;
import com.chineseivy.bean.RecommendPackage;

import java.util.List;

/**
 * Created by admin on 2018/4/18
 */
public interface RecommendService {
    int insertRecommend(Recommend recommend);
    RecommendPackage selectByRecommendKey(int recommendId);
    int updateByRecommendId(Recommend recommend);

}
