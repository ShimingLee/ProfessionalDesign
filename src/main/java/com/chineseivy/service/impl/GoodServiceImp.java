package com.chineseivy.service.impl;

import com.chineseivy.bean.Good;
import com.chineseivy.bean.GoodExample;
import com.chineseivy.bean.GoodPackage;
import com.chineseivy.dao.GoodMapper;
import com.chineseivy.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2018/5/10
 */
@Service("goodService")
public class GoodServiceImp implements GoodService {

    private GoodMapper goodMapper;
    /**
     * 查询商品列表
     * @return
     */
    public List<GoodPackage> selectAllGood(){
        List<GoodPackage> goods = goodMapper.selectAllGoods();
        return  goods;
    }

    public GoodPackage selectGoodByPrimaryKey(Integer goodid){
        GoodPackage good = goodMapper.selectByPrimaryKey(goodid);
        return good;
    }

    /**
     * 插入商品
     * @param good 商品例子
     * @return
     */
    public int insertGood(Good good){
        int flag = goodMapper.insertSelective(good);
        return flag;
    }

    /**
     * 更新商品
     * @param good 更新的值
     * @return
     */
    public int updateGood(Good good){
        int flag = goodMapper.updateByPrimaryKeySelective(good);
        return  flag;
    }

    /**
     * 删除商品
     * @param goodId 商品ID
     * @return 是否删除成功
     */
    public int deleteGoodByPrimaryKey(int goodId){
        int flag = goodMapper.deleteByPrimaryKey(goodId);
        return flag;
    }

    /**
    * @Program: GoodServiceImp.java
    * @Method:
    * @Description: 查询所有商品下架状态（用于更新和修改商品信息时使用）
    * @Author: Shiming Lee
    * @Create: 2018/5/25 20:27
    * @params:
    * @returns:
    **/
    public List<GoodPackage> selectGoodByGoodState(int goodState){
        List<GoodPackage> goodList = goodMapper.selectByGoodState(goodState);
        return goodList;
    }



}
