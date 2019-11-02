package com.glyk.heos.dal.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class 水生细密细胞密度 {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生细密细胞密度.ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生细密细胞密度.编号
     *
     * @mbg.generated
     */
    private String 编号;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生细密细胞密度.采样点位
     *
     * @mbg.generated
     */
    private String 采样点位;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生细密细胞密度.日期
     *
     * @mbg.generated
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM",timezone = "GMT+8")
    private Date 日期;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生细密细胞密度.硅藻门
     *
     * @mbg.generated
     */
    private String 硅藻门;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生细密细胞密度.甲藻门
     *
     * @mbg.generated
     */
    private String 甲藻门;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生细密细胞密度.金藻门
     *
     * @mbg.generated
     */
    private String 金藻门;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生细密细胞密度.隐藻门
     *
     * @mbg.generated
     */
    private String 隐藻门;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生细密细胞密度.裸藻门
     *
     * @mbg.generated
     */
    private String 裸藻门;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生细密细胞密度.蓝藻门
     *
     * @mbg.generated
     */
    private String 蓝藻门;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生细密细胞密度.绿藻门
     *
     * @mbg.generated
     */
    private String 绿藻门;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生细密细胞密度.ID
     *
     * @return the value of 水生细密细胞密度.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生细密细胞密度.ID
     *
     * @param id the value for 水生细密细胞密度.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生细密细胞密度.编号
     *
     * @return the value of 水生细密细胞密度.编号
     *
     * @mbg.generated
     */
    public String get编号() {
        return 编号;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生细密细胞密度.编号
     *
     * @param 编号 the value for 水生细密细胞密度.编号
     *
     * @mbg.generated
     */
    public void set编号(String 编号) {
        this.编号 = 编号 == null ? null : 编号.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生细密细胞密度.采样点位
     *
     * @return the value of 水生细密细胞密度.采样点位
     *
     * @mbg.generated
     */
    public String get采样点位() {
        return 采样点位;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生细密细胞密度.采样点位
     *
     * @param 采样点位 the value for 水生细密细胞密度.采样点位
     *
     * @mbg.generated
     */
    public void set采样点位(String 采样点位) {
        this.采样点位 = 采样点位 == null ? null : 采样点位.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生细密细胞密度.日期
     *
     * @return the value of 水生细密细胞密度.日期
     *
     * @mbg.generated
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM",timezone = "GMT+8")
    public Date get日期() {
        return 日期;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生细密细胞密度.日期
     *
     * @param 日期 the value for 水生细密细胞密度.日期
     *
     * @mbg.generated
     */
    public void set日期(Date 日期) {
        this.日期 = 日期;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生细密细胞密度.硅藻门
     *
     * @return the value of 水生细密细胞密度.硅藻门
     *
     * @mbg.generated
     */
    public String get硅藻门() {
        return 硅藻门;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生细密细胞密度.硅藻门
     *
     * @param 硅藻门 the value for 水生细密细胞密度.硅藻门
     *
     * @mbg.generated
     */
    public void set硅藻门(String 硅藻门) {
        this.硅藻门 = 硅藻门 == null ? null : 硅藻门.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生细密细胞密度.甲藻门
     *
     * @return the value of 水生细密细胞密度.甲藻门
     *
     * @mbg.generated
     */
    public String get甲藻门() {
        return 甲藻门;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生细密细胞密度.甲藻门
     *
     * @param 甲藻门 the value for 水生细密细胞密度.甲藻门
     *
     * @mbg.generated
     */
    public void set甲藻门(String 甲藻门) {
        this.甲藻门 = 甲藻门 == null ? null : 甲藻门.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生细密细胞密度.金藻门
     *
     * @return the value of 水生细密细胞密度.金藻门
     *
     * @mbg.generated
     */
    public String get金藻门() {
        return 金藻门;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生细密细胞密度.金藻门
     *
     * @param 金藻门 the value for 水生细密细胞密度.金藻门
     *
     * @mbg.generated
     */
    public void set金藻门(String 金藻门) {
        this.金藻门 = 金藻门 == null ? null : 金藻门.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生细密细胞密度.隐藻门
     *
     * @return the value of 水生细密细胞密度.隐藻门
     *
     * @mbg.generated
     */
    public String get隐藻门() {
        return 隐藻门;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生细密细胞密度.隐藻门
     *
     * @param 隐藻门 the value for 水生细密细胞密度.隐藻门
     *
     * @mbg.generated
     */
    public void set隐藻门(String 隐藻门) {
        this.隐藻门 = 隐藻门 == null ? null : 隐藻门.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生细密细胞密度.裸藻门
     *
     * @return the value of 水生细密细胞密度.裸藻门
     *
     * @mbg.generated
     */
    public String get裸藻门() {
        return 裸藻门;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生细密细胞密度.裸藻门
     *
     * @param 裸藻门 the value for 水生细密细胞密度.裸藻门
     *
     * @mbg.generated
     */
    public void set裸藻门(String 裸藻门) {
        this.裸藻门 = 裸藻门 == null ? null : 裸藻门.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生细密细胞密度.蓝藻门
     *
     * @return the value of 水生细密细胞密度.蓝藻门
     *
     * @mbg.generated
     */
    public String get蓝藻门() {
        return 蓝藻门;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生细密细胞密度.蓝藻门
     *
     * @param 蓝藻门 the value for 水生细密细胞密度.蓝藻门
     *
     * @mbg.generated
     */
    public void set蓝藻门(String 蓝藻门) {
        this.蓝藻门 = 蓝藻门 == null ? null : 蓝藻门.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生细密细胞密度.绿藻门
     *
     * @return the value of 水生细密细胞密度.绿藻门
     *
     * @mbg.generated
     */
    public String get绿藻门() {
        return 绿藻门;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生细密细胞密度.绿藻门
     *
     * @param 绿藻门 the value for 水生细密细胞密度.绿藻门
     *
     * @mbg.generated
     */
    public void set绿藻门(String 绿藻门) {
        this.绿藻门 = 绿藻门 == null ? null : 绿藻门.trim();
    }
}