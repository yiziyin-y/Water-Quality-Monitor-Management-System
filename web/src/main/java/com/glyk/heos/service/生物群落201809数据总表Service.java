package com.glyk.heos.service;

import com.glyk.heos.dal.dao.生物群落201809数据总表;
import com.glyk.heos.util.Result;

import java.util.Date;

public interface 生物群落201809数据总表Service {


    public Result get生物群落201809数据总表Info(Date startDate, Date endDate, int pageIndex, int pageSize);

    /**
     * 删除记录
     * @param rowId
     * @return
     */
    public boolean deleteRow(int rowId);

    /**
     * 修改记录
     * @param record
     * @return
     */
    public boolean updateRow(生物群落201809数据总表 record);

    /**
     * 增加记录
     * @param record
     * @return
     */
    public boolean insert(生物群落201809数据总表 record);
    /**
     * 获取指标
     * @return
     */
    public Result getIndex();
    public Result get生物群落201809数据总表统计Info(int col,Date startDate, Date endDate);
    public Result get生物群落201809数据总表Report(String place,int col);
    public Result get生物群落201809数据总表统计Info2(String place,Date startDate, Date endDate);

}
