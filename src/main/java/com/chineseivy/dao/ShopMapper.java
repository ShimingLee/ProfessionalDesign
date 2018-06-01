package com.chineseivy.dao;

import com.chineseivy.bean.Shop;
import com.chineseivy.bean.ShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface ShopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer shopid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    int insertSelective(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    Shop selectByPrimaryKey(Integer shopId);
    /**
    * @Program: ShopMapper.java
    * @Method:
    * @Description: 根据商品星级选择商品信息
    * @Author: Shiming Lee
    * @Create: 2018/5/25 19:12
    * @params:
    * @returns:
    **/
    List<Shop> selectShopByShopStar(Integer shopStar);
    /**
    * @Program: ShopMapper.java
    * @Method:
    * @Description: 查找所有
    * @Author: Shiming Lee
    * @Create: 2018/5/25 19:16
    * @params:
    * @returns:
    **/
    List<Shop> selectAllShop();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shop
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Shop record);

}