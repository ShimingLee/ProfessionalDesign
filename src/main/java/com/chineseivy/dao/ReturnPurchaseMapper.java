package com.chineseivy.dao;

import com.chineseivy.bean.ReturnPurchase;
import com.chineseivy.bean.ReturnPurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReturnPurchaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    long countByExample(ReturnPurchaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    int deleteByExample(ReturnPurchaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer returnid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    int insert(ReturnPurchase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    int insertSelective(ReturnPurchase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    List<ReturnPurchase> selectByExample(ReturnPurchaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    ReturnPurchase selectByPrimaryKey(Integer returnid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ReturnPurchase record, @Param("example") ReturnPurchaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ReturnPurchase record, @Param("example") ReturnPurchaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ReturnPurchase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_returnedPurchase
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ReturnPurchase record);
}