package com.glyk.heos.dal.dao;

import com.glyk.heos.dal.dao.浮游植物细密地址;
import com.glyk.heos.dal.dao.浮游植物细密地址Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface 浮游植物细密地址Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 浮游植物细密地址
     *
     * @mbg.generated
     */
    long countByExample(浮游植物细密地址Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 浮游植物细密地址
     *
     * @mbg.generated
     */
    int deleteByExample(浮游植物细密地址Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 浮游植物细密地址
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 浮游植物细密地址
     *
     * @mbg.generated
     */
    int insert(浮游植物细密地址 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 浮游植物细密地址
     *
     * @mbg.generated
     */
    int insertSelective(浮游植物细密地址 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 浮游植物细密地址
     *
     * @mbg.generated
     */
    List<浮游植物细密地址> selectByExample(浮游植物细密地址Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 浮游植物细密地址
     *
     * @mbg.generated
     */
    浮游植物细密地址 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 浮游植物细密地址
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") 浮游植物细密地址 record, @Param("example") 浮游植物细密地址Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 浮游植物细密地址
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") 浮游植物细密地址 record, @Param("example") 浮游植物细密地址Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 浮游植物细密地址
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(浮游植物细密地址 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 浮游植物细密地址
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(浮游植物细密地址 record);
}