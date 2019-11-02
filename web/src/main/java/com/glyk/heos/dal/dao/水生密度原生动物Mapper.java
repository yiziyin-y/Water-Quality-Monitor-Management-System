package com.glyk.heos.dal.dao;

import com.glyk.heos.dal.dao.水生密度原生动物;
import com.glyk.heos.dal.dao.水生密度原生动物Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface 水生密度原生动物Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生密度原生动物
     *
     * @mbg.generated
     */
    long countByExample(水生密度原生动物Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生密度原生动物
     *
     * @mbg.generated
     */
    int deleteByExample(水生密度原生动物Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生密度原生动物
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生密度原生动物
     *
     * @mbg.generated
     */
    int insert(水生密度原生动物 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生密度原生动物
     *
     * @mbg.generated
     */
    int insertSelective(水生密度原生动物 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生密度原生动物
     *
     * @mbg.generated
     */
    List<水生密度原生动物> selectByExample(水生密度原生动物Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生密度原生动物
     *
     * @mbg.generated
     */
    水生密度原生动物 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生密度原生动物
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") 水生密度原生动物 record, @Param("example") 水生密度原生动物Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生密度原生动物
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") 水生密度原生动物 record, @Param("example") 水生密度原生动物Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生密度原生动物
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(水生密度原生动物 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 水生密度原生动物
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(水生密度原生动物 record);
}