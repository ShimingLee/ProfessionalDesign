package com.chineseivy.service.impl;

import com.chineseivy.bean.Recommend;
import com.chineseivy.bean.RecommendExample;
import com.chineseivy.bean.RecommendPackage;
import com.chineseivy.dao.RecommendMapper;
import com.chineseivy.service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2018/5/12
 */
@Service("recommendService")
public class RecommendServiceImp implements RecommendService {

    private RecommendMapper recommendMapper;

    /**
    * @Program: RecommendServiceImp.java
    * @Method:
    * @Description: 插入商品推荐主题
    * @Author: Shiming Lee
    * @Create: 2018/5/27 20:33
    * @params:
    * @returns:
    **/
    public int insertRecommend(Recommend recommend) {
        int flag = recommendMapper.insertSelective(recommend);
        return flag;
    }

    /**
    * @Program: RecommendServiceImp.java
    * @Method: 
    * @Description: 根据ID选择推荐信息
    * @Author: Shiming Lee
    * @Create: 2018/6/2 16:54
    * @params: 
    * @returns: 
    **/
    public RecommendPackage selectByRecommendKey(int recommendId) {
        RecommendPackage recommend = recommendMapper.selectByPrimaryKey(recommendId);
        return recommend;
    }

    public List<RecommendPackage> selectAllRecommendMessages() {
        List<RecommendPackage> recommendList = recommendMapper.selectAllRecommend();
        return  recommendList;
    }


    public int updateByRecommendId(Recommend recommend) {
        int flag = recommendMapper.updateByPrimaryKeySelective(recommend);
        return flag;
    }

    public int deleteByRecommendId(int recommendId) {
        int flag = recommendMapper.deleteByPrimaryKey(recommendId);
        return flag;
    }
}
