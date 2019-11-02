package com.glyk.heos.dal.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class 水生多样性足类 {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生多样性足类.ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生多样性足类.编号
     *
     * @mbg.generated
     */
    private String 编号;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生多样性足类.采样点位
     *
     * @mbg.generated
     */
    private String 采样点位;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生多样性足类.日期
     *
     * @mbg.generated
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM",timezone = "GMT+8")
    private Date 日期;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生多样性足类.汤匙华哲水蚤
     *
     * @mbg.generated
     */
    private String 汤匙华哲水蚤;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生多样性足类.中华窄腹水蚤
     *
     * @mbg.generated
     */
    private String 中华窄腹水蚤;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生多样性足类.跨立小剑水蚤
     *
     * @mbg.generated
     */
    private String 跨立小剑水蚤;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生多样性足类.广布中剑水蚤
     *
     * @mbg.generated
     */
    private String 广布中剑水蚤;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生多样性足类.台湾温剑水蚤
     *
     * @mbg.generated
     */
    private String 台湾温剑水蚤;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生多样性足类.球状许水蚤
     *
     * @mbg.generated
     */
    private String 球状许水蚤;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生多样性足类.指状许水蚤
     *
     * @mbg.generated
     */
    private String 指状许水蚤;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生多样性足类.剑水蚤桡足幼体
     *
     * @mbg.generated
     */
    private String 剑水蚤桡足幼体;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生多样性足类.哲水蚤桡足幼体
     *
     * @mbg.generated
     */
    private String 哲水蚤桡足幼体;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生多样性足类.无节幼体
     *
     * @mbg.generated
     */
    private String 无节幼体;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生多样性足类.英勇剑水蚤
     *
     * @mbg.generated
     */
    private String 英勇剑水蚤;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column 水生多样性足类.透明温剑水蚤
     *
     * @mbg.generated
     */
    private String 透明温剑水蚤;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生多样性足类.ID
     *
     * @return the value of 水生多样性足类.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生多样性足类.ID
     *
     * @param id the value for 水生多样性足类.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生多样性足类.编号
     *
     * @return the value of 水生多样性足类.编号
     *
     * @mbg.generated
     */
    public String get编号() {
        return 编号;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生多样性足类.编号
     *
     * @param 编号 the value for 水生多样性足类.编号
     *
     * @mbg.generated
     */
    public void set编号(String 编号) {
        this.编号 = 编号 == null ? null : 编号.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生多样性足类.采样点位
     *
     * @return the value of 水生多样性足类.采样点位
     *
     * @mbg.generated
     */
    public String get采样点位() {
        return 采样点位;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生多样性足类.采样点位
     *
     * @param 采样点位 the value for 水生多样性足类.采样点位
     *
     * @mbg.generated
     */
    public void set采样点位(String 采样点位) {
        this.采样点位 = 采样点位 == null ? null : 采样点位.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生多样性足类.日期
     *
     * @return the value of 水生多样性足类.日期
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
     * This method sets the value of the database column 水生多样性足类.日期
     *
     * @param 日期 the value for 水生多样性足类.日期
     *
     * @mbg.generated
     */
    public void set日期(Date 日期) {
        this.日期 = 日期;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生多样性足类.汤匙华哲水蚤
     *
     * @return the value of 水生多样性足类.汤匙华哲水蚤
     *
     * @mbg.generated
     */
    public String get汤匙华哲水蚤() {
        return 汤匙华哲水蚤;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生多样性足类.汤匙华哲水蚤
     *
     * @param 汤匙华哲水蚤 the value for 水生多样性足类.汤匙华哲水蚤
     *
     * @mbg.generated
     */
    public void set汤匙华哲水蚤(String 汤匙华哲水蚤) {
        this.汤匙华哲水蚤 = 汤匙华哲水蚤 == null ? null : 汤匙华哲水蚤.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生多样性足类.中华窄腹水蚤
     *
     * @return the value of 水生多样性足类.中华窄腹水蚤
     *
     * @mbg.generated
     */
    public String get中华窄腹水蚤() {
        return 中华窄腹水蚤;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生多样性足类.中华窄腹水蚤
     *
     * @param 中华窄腹水蚤 the value for 水生多样性足类.中华窄腹水蚤
     *
     * @mbg.generated
     */
    public void set中华窄腹水蚤(String 中华窄腹水蚤) {
        this.中华窄腹水蚤 = 中华窄腹水蚤 == null ? null : 中华窄腹水蚤.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生多样性足类.跨立小剑水蚤
     *
     * @return the value of 水生多样性足类.跨立小剑水蚤
     *
     * @mbg.generated
     */
    public String get跨立小剑水蚤() {
        return 跨立小剑水蚤;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生多样性足类.跨立小剑水蚤
     *
     * @param 跨立小剑水蚤 the value for 水生多样性足类.跨立小剑水蚤
     *
     * @mbg.generated
     */
    public void set跨立小剑水蚤(String 跨立小剑水蚤) {
        this.跨立小剑水蚤 = 跨立小剑水蚤 == null ? null : 跨立小剑水蚤.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生多样性足类.广布中剑水蚤
     *
     * @return the value of 水生多样性足类.广布中剑水蚤
     *
     * @mbg.generated
     */
    public String get广布中剑水蚤() {
        return 广布中剑水蚤;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生多样性足类.广布中剑水蚤
     *
     * @param 广布中剑水蚤 the value for 水生多样性足类.广布中剑水蚤
     *
     * @mbg.generated
     */
    public void set广布中剑水蚤(String 广布中剑水蚤) {
        this.广布中剑水蚤 = 广布中剑水蚤 == null ? null : 广布中剑水蚤.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生多样性足类.台湾温剑水蚤
     *
     * @return the value of 水生多样性足类.台湾温剑水蚤
     *
     * @mbg.generated
     */
    public String get台湾温剑水蚤() {
        return 台湾温剑水蚤;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生多样性足类.台湾温剑水蚤
     *
     * @param 台湾温剑水蚤 the value for 水生多样性足类.台湾温剑水蚤
     *
     * @mbg.generated
     */
    public void set台湾温剑水蚤(String 台湾温剑水蚤) {
        this.台湾温剑水蚤 = 台湾温剑水蚤 == null ? null : 台湾温剑水蚤.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生多样性足类.球状许水蚤
     *
     * @return the value of 水生多样性足类.球状许水蚤
     *
     * @mbg.generated
     */
    public String get球状许水蚤() {
        return 球状许水蚤;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生多样性足类.球状许水蚤
     *
     * @param 球状许水蚤 the value for 水生多样性足类.球状许水蚤
     *
     * @mbg.generated
     */
    public void set球状许水蚤(String 球状许水蚤) {
        this.球状许水蚤 = 球状许水蚤 == null ? null : 球状许水蚤.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生多样性足类.指状许水蚤
     *
     * @return the value of 水生多样性足类.指状许水蚤
     *
     * @mbg.generated
     */
    public String get指状许水蚤() {
        return 指状许水蚤;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生多样性足类.指状许水蚤
     *
     * @param 指状许水蚤 the value for 水生多样性足类.指状许水蚤
     *
     * @mbg.generated
     */
    public void set指状许水蚤(String 指状许水蚤) {
        this.指状许水蚤 = 指状许水蚤 == null ? null : 指状许水蚤.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生多样性足类.剑水蚤桡足幼体
     *
     * @return the value of 水生多样性足类.剑水蚤桡足幼体
     *
     * @mbg.generated
     */
    public String get剑水蚤桡足幼体() {
        return 剑水蚤桡足幼体;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生多样性足类.剑水蚤桡足幼体
     *
     * @param 剑水蚤桡足幼体 the value for 水生多样性足类.剑水蚤桡足幼体
     *
     * @mbg.generated
     */
    public void set剑水蚤桡足幼体(String 剑水蚤桡足幼体) {
        this.剑水蚤桡足幼体 = 剑水蚤桡足幼体 == null ? null : 剑水蚤桡足幼体.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生多样性足类.哲水蚤桡足幼体
     *
     * @return the value of 水生多样性足类.哲水蚤桡足幼体
     *
     * @mbg.generated
     */
    public String get哲水蚤桡足幼体() {
        return 哲水蚤桡足幼体;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生多样性足类.哲水蚤桡足幼体
     *
     * @param 哲水蚤桡足幼体 the value for 水生多样性足类.哲水蚤桡足幼体
     *
     * @mbg.generated
     */
    public void set哲水蚤桡足幼体(String 哲水蚤桡足幼体) {
        this.哲水蚤桡足幼体 = 哲水蚤桡足幼体 == null ? null : 哲水蚤桡足幼体.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生多样性足类.无节幼体
     *
     * @return the value of 水生多样性足类.无节幼体
     *
     * @mbg.generated
     */
    public String get无节幼体() {
        return 无节幼体;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生多样性足类.无节幼体
     *
     * @param 无节幼体 the value for 水生多样性足类.无节幼体
     *
     * @mbg.generated
     */
    public void set无节幼体(String 无节幼体) {
        this.无节幼体 = 无节幼体 == null ? null : 无节幼体.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生多样性足类.英勇剑水蚤
     *
     * @return the value of 水生多样性足类.英勇剑水蚤
     *
     * @mbg.generated
     */
    public String get英勇剑水蚤() {
        return 英勇剑水蚤;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生多样性足类.英勇剑水蚤
     *
     * @param 英勇剑水蚤 the value for 水生多样性足类.英勇剑水蚤
     *
     * @mbg.generated
     */
    public void set英勇剑水蚤(String 英勇剑水蚤) {
        this.英勇剑水蚤 = 英勇剑水蚤 == null ? null : 英勇剑水蚤.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column 水生多样性足类.透明温剑水蚤
     *
     * @return the value of 水生多样性足类.透明温剑水蚤
     *
     * @mbg.generated
     */
    public String get透明温剑水蚤() {
        return 透明温剑水蚤;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column 水生多样性足类.透明温剑水蚤
     *
     * @param 透明温剑水蚤 the value for 水生多样性足类.透明温剑水蚤
     *
     * @mbg.generated
     */
    public void set透明温剑水蚤(String 透明温剑水蚤) {
        this.透明温剑水蚤 = 透明温剑水蚤 == null ? null : 透明温剑水蚤.trim();
    }
}