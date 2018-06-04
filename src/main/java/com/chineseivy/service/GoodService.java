package com.chineseivy.service;

import com.chineseivy.bean.Good;
import com.chineseivy.bean.GoodExample;
import com.chineseivy.bean.GoodPackage;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2018/4/18
 */
@Service("goodService")
public interface GoodService {
    /**
     * @Description 查询商品列表
     * @return
     */
    List<GoodPackage> selectAllGood();
    /**
     * @Description 插入商品
     * @param good 条件值
     * @return
     */
    int insertGood(Good good);

    /**
     * @Description 删除商品
     * @param goodId 商品ID
     * @return 是否删除成功
     */
    int deleteGoodByPrimaryKey(int goodId);

    /**
     * @Description 查询商品通过主键
     * @param goodid
     * @return
     */
    GoodPackage selectGoodByPrimaryKey(Integer goodid);

    /**
    * @Program: GoodService.java
    * @Method:
    * @Description: 更新商品信息
    * @Author: Shiming Lee
    * @Create: 2018/5/25 20:33
    * @params:
    * @returns:
    **/
    int updateGood(Good good);

    /**
    * @Program: GoodService.java
    * @Method:
    * @Description: 选择商品根据商品状态
    * @Author: Shiming Lee
    * @Create: 2018/5/25 20:34
    * @params:
    * @returns:
    **/
    List<GoodPackage> selectGoodByGoodState(int goodState);
}
