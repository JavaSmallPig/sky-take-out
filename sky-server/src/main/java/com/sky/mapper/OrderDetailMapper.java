package com.sky.mapper;

import com.sky.entity.OrderDetail;

import java.util.List;

/**
 * @Author Java小猪
 * @Date 2025/3/5 15:30
 */
public interface OrderDetailMapper {
    /**
     * 批量插入订单明细数据
     * @param list
     */
    void insertBatch(List<OrderDetail> list);
}
