package com.glyk.heos.service;

import com.glyk.heos.dal.dao.水生相关性隐藻门;
import com.glyk.heos.util.Result;

import java.util.Date;

public interface 水生相关性隐藻门Service {

    public Result get水生相关性隐藻门Info(Date startDate, Date endDate, int pageIndex, int pageSize);

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
    public boolean updateRow(水生相关性隐藻门 record);

    /**
     * 增加记录
     * @param record
     * @return
     */
    public boolean insert(水生相关性隐藻门 record);
    public Result get水生相关性隐藻门统计Info(int col,Date startDate, Date endDate);
    /**
     * 获取指标
     * @return
     */
    public Result getIndex();
    public Result get水生相关性隐藻门统计Info2(String place,Date startDate, Date endDate);
    public Result get水生相关性隐藻门Report(String place,int col);
}
