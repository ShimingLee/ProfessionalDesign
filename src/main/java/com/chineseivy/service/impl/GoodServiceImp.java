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

    @Autowired
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
        System.out.println("9999999999999999999     "+good.getGoodname()+"00000000"+good.getPrice());
        int flag = goodMapper.insertSelective(good);
        System.out.println("-----------"+flag);
        return flag;
    }

    /**
     * 更新商品
     * @param good 更新的值
     * @return
     */
    public int updateGood(Good good){
        System.out.println(good.getGoodname());
        int flag = goodMapper.updateByPrimaryKeySelective(good);
        System.out.println("update:"+flag);
        return  flag;
    }

    public List<GoodPackage> selectGoodByGoodState(int goodState) {
        return null;
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

    public int maxId() {
        int goodId = goodMapper.maxId();
        return goodId;
    }

    public int selectShopId(int goodId) {
        int shopId = goodMapper.selectShopId(goodId);
        return shopId;
    }

    public int updateGoodStateByAdmin(int goodId,int goodState){
        int flag = goodMapper.updateGoodStateByAdmin(goodId,goodState);
        return flag;
    }

}
