package com.glyk.heos.vo;

import java.util.Date;

public class BrandVo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.STATUS
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.CREATED_BY
     *
     * @mbg.generated
     */
    private Long createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.CREATION_DATE
     *
     * @mbg.generated
     */
    private Date creationDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.LAST_UPDATED_BY
     *
     * @mbg.generated
     */
    private Long lastUpdatedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.LAST_UPDATE_DATE
     *
     * @mbg.generated
     */
    private Date lastUpdateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.BRAND_NAME
     *
     * @mbg.generated
     */
    private String brandName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.REMARK
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.ID
     *
     * @return the value of brand.ID
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.ID
     *
     * @param id the value for brand.ID
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.STATUS
     *
     * @return the value of brand.STATUS
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.STATUS
     *
     * @param status the value for brand.STATUS
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.CREATED_BY
     *
     * @return the value of brand.CREATED_BY
     * @mbg.generated
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.CREATED_BY
     *
     * @param createdBy the value for brand.CREATED_BY
     * @mbg.generated
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.CREATION_DATE
     *
     * @return the value of brand.CREATION_DATE
     * @mbg.generated
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.CREATION_DATE
     *
     * @param creationDate the value for brand.CREATION_DATE
     * @mbg.generated
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.LAST_UPDATED_BY
     *
     * @return the value of brand.LAST_UPDATED_BY
     * @mbg.generated
     */
    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.LAST_UPDATED_BY
     *
     * @param lastUpdatedBy the value for brand.LAST_UPDATED_BY
     * @mbg.generated
     */
    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.LAST_UPDATE_DATE
     *
     * @return the value of brand.LAST_UPDATE_DATE
     * @mbg.generated
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.LAST_UPDATE_DATE
     *
     * @param lastUpdateDate the value for brand.LAST_UPDATE_DATE
     * @mbg.generated
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.BRAND_NAME
     *
     * @return the value of brand.BRAND_NAME
     * @mbg.generated
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.BRAND_NAME
     *
     * @param brandName the value for brand.BRAND_NAME
     * @mbg.generated
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.REMARK
     *
     * @return the value of brand.REMARK
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.REMARK
     *
     * @param remark the value for brand.REMARK
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
