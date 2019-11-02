package com.glyk.heos.dal.dao;

import com.glyk.heos.dal.dao.底栖生物地址;
import com.glyk.heos.dal.dao.底栖生物地址Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface 底栖生物地址Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 底栖生物地址
     *
     * @mbg.generated
     */
    long countByExample(底栖生物地址Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 底栖生物地址
     *
     * @mbg.generated
     */
    int deleteByExample(底栖生物地址Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 底栖生物地址
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 底栖生物地址
     *
     * @mbg.generated
     */
    int insert(底栖生物地址 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 底栖生物地址
     *
     * @mbg.generated
     */
    int insertSelective(底栖生物地址 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 底栖生物地址
     *
     * @mbg.generated
     */
    List<底栖生物地址> selectByExample(底栖生物地址Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 底栖生物地址
     *
     * @mbg.generated
     */
    底栖生物地址 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 底栖生物地址
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") 底栖生物地址 record, @Param("example") 底栖生物地址Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 底栖生物地址
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") 底栖生物地址 record, @Param("example") 底栖生物地址Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 底栖生物地址
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(底栖生物地址 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table 底栖生物地址
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(底栖生物地址 record);
}