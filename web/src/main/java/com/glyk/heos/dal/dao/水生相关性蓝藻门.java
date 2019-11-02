package com.glyk.heos.dal.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class 水生相关性蓝藻门 {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生相关性蓝藻门.ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生相关性蓝藻门.编号
     *
     * @mbg.generated
     */
    private String 编号;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生相关性蓝藻门.采样点位
     *
     * @mbg.generated
     */
    private String 采样点位;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生相关性蓝藻门.日期
     *
     * @mbg.generated
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM",timezone = "GMT+8")
    private Date 日期;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生相关性蓝藻门.铜绿微囊藻
     *
     * @mbg.generated
     */
    private String 铜绿微囊藻;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生相关性蓝藻门.色球藻
     *
     * @mbg.generated
     */
    private String 色球藻;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生相关性蓝藻门.假鱼腥藻
     *
     * @mbg.generated
     */
    private String 假鱼腥藻;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生相关性蓝藻门.水华鱼腥藻
     *
     * @mbg.generated
     */
    private String 水华鱼腥藻;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生相关性蓝藻门.鱼腥藻
     *
     * @mbg.generated
     */
    private String 鱼腥藻;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生相关性蓝藻门.小席藻
     *
     * @mbg.generated
     */
    private String 小席藻;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生相关性蓝藻门.ID
     *
     * @return the value of 水生相关性蓝藻门.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生相关性蓝藻门.ID
     *
     * @param id the value for 水生相关性蓝藻门.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生相关性蓝藻门.编号
     *
     * @return the value of 水生相关性蓝藻门.编号
     *
     * @mbg.generated
     */
    public String get编号() {
        return 编号;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生相关性蓝藻门.编号
     *
     * @param 编号 the value for 水生相关性蓝藻门.编号
     *
     * @mbg.generated
     */
    public void set编号(String 编号) {
        this.编号 = 编号 == null ? null : 编号.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生相关性蓝藻门.采样点位
     *
     * @return the value of 水生相关性蓝藻门.采样点位
     *
     * @mbg.generated
     */
    public String get采样点位() {
        return 采样点位;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生相关性蓝藻门.采样点位
     *
     * @param 采样点位 the value for 水生相关性蓝藻门.采样点位
     *
     * @mbg.generated
     */
    public void set采样点位(String 采样点位) {
        this.采样点位 = 采样点位 == null ? null : 采样点位.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生相关性蓝藻门.日期
     *
     * @return the value of 水生相关性蓝藻门.日期
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
     * This method sets the value of the database column 水生相关性蓝藻门.日期
     *
     * @param 日期 the value for 水生相关性蓝藻门.日期
     *
     * @mbg.generated
     */
    public void set日期(Date 日期) {
        this.日期 = 日期;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生相关性蓝藻门.铜绿微囊藻
     *
     * @return the value of 水生相关性蓝藻门.铜绿微囊藻
     *
     * @mbg.generated
     */
    public String get铜绿微囊藻() {
        return 铜绿微囊藻;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生相关性蓝藻门.铜绿微囊藻
     *
     * @param 铜绿微囊藻 the value for 水生相关性蓝藻门.铜绿微囊藻
     *
     * @mbg.generated
     */
    public void set铜绿微囊藻(String 铜绿微囊藻) {
        this.铜绿微囊藻 = 铜绿微囊藻 == null ? null : 铜绿微囊藻.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生相关性蓝藻门.色球藻
     *
     * @return the value of 水生相关性蓝藻门.色球藻
     *
     * @mbg.generated
     */
    public String get色球藻() {
        return 色球藻;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生相关性蓝藻门.色球藻
     *
     * @param 色球藻 the value for 水生相关性蓝藻门.色球藻
     *
     * @mbg.generated
     */
    public void set色球藻(String 色球藻) {
        this.色球藻 = 色球藻 == null ? null : 色球藻.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生相关性蓝藻门.假鱼腥藻
     *
     * @return the value of 水生相关性蓝藻门.假鱼腥藻
     *
     * @mbg.generated
     */
    public String get假鱼腥藻() {
        return 假鱼腥藻;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生相关性蓝藻门.假鱼腥藻
     *
     * @param 假鱼腥藻 the value for 水生相关性蓝藻门.假鱼腥藻
     *
     * @mbg.generated
     */
    public void set假鱼腥藻(String 假鱼腥藻) {
        this.假鱼腥藻 = 假鱼腥藻 == null ? null : 假鱼腥藻.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生相关性蓝藻门.水华鱼腥藻
     *
     * @return the value of 水生相关性蓝藻门.水华鱼腥藻
     *
     * @mbg.generated
     */
    public String get水华鱼腥藻() {
        return 水华鱼腥藻;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生相关性蓝藻门.水华鱼腥藻
     *
     * @param 水华鱼腥藻 the value for 水生相关性蓝藻门.水华鱼腥藻
     *
     * @mbg.generated
     */
    public void set水华鱼腥藻(String 水华鱼腥藻) {
        this.水华鱼腥藻 = 水华鱼腥藻 == null ? null : 水华鱼腥藻.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生相关性蓝藻门.鱼腥藻
     *
     * @return the value of 水生相关性蓝藻门.鱼腥藻
     *
     * @mbg.generated
     */
    public String get鱼腥藻() {
        return 鱼腥藻;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生相关性蓝藻门.鱼腥藻
     *
     * @param 鱼腥藻 the value for 水生相关性蓝藻门.鱼腥藻
     *
     * @mbg.generated
     */
    public void set鱼腥藻(String 鱼腥藻) {
        this.鱼腥藻 = 鱼腥藻 == null ? null : 鱼腥藻.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生相关性蓝藻门.小席藻
     *
     * @return the value of 水生相关性蓝藻门.小席藻
     *
     * @mbg.generated
     */
    public String get小席藻() {
        return 小席藻;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生相关性蓝藻门.小席藻
     *
     * @param 小席藻 the value for 水生相关性蓝藻门.小席藻
     *
     * @mbg.generated
     */
    public void set小席藻(String 小席藻) {
        this.小席藻 = 小席藻 == null ? null : 小席藻.trim();
    }
}