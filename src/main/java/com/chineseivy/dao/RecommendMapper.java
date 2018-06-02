package com.chineseivy.dao;

import com.chineseivy.bean.Recommend;
import com.chineseivy.bean.RecommendExample;
import java.util.List;

import com.chineseivy.bean.RecommendPackage;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface RecommendMapper {
    int insertSelective(Recommend record);

    RecommendPackage selectByPrimaryKey(Integer recommendid);

    List<RecommendPackage> selectAllRecommend();

    int updateByPrimaryKeySelective(Recommend record);

    int deleteByPrimaryKey(Integer recommendid);
}