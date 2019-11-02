package com.glyk.heos.dal.dao;

import com.glyk.heos.dal.dao.水生多样性生物量;
import com.glyk.heos.dal.dao.水生多样性生物量Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface 水生多样性生物量Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生多样性生物量
     *
     * @mbg.generated
     */
    long countByExample(水生多样性生物量Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生多样性生物量
     *
     * @mbg.generated
     */
    int deleteByExample(水生多样性生物量Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生多样性生物量
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生多样性生物量
     *
     * @mbg.generated
     */
    int insert(水生多样性生物量 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生多样性生物量
     *
     * @mbg.generated
     */
    int insertSelective(水生多样性生物量 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生多样性生物量
     *
     * @mbg.generated
     */
    List<水生多样性生物量> selectByExample(水生多样性生物量Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生多样性生物量
     *
     * @mbg.generated
     */
    水生多样性生物量 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生多样性生物量
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") 水生多样性生物量 record, @Param("example") 水生多样性生物量Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生多样性生物量
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") 水生多样性生物量 record, @Param("example") 水生多样性生物量Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生多样性生物量
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(水生多样性生物量 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生多样性生物量
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(水生多样性生物量 record);
}