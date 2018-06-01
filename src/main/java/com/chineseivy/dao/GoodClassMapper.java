package com.chineseivy.dao;

import com.chineseivy.bean.GoodClass;
import com.chineseivy.bean.GoodClassExample;
import java.util.List;

import com.chineseivy.bean.GoodClassPackage;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface GoodClassMapper {

    int deleteByPrimaryKey(Integer goodclassid);

    int insertSelective(GoodClass record);

    GoodClassPackage selectByPrimaryKey(Integer goodclassid);

    int updateByPrimaryKeySelective(GoodClass record);

    List<GoodClassPackage> selectAllGoodClass();
}