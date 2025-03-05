package com.sky.mapper;

import com.sky.entity.Orders;

/**
 * @Author Java小猪
 * @Date 2025/3/5 15:29
 */
public interface OrderMapper {
    /**
     * 向订单表插入数据
     * @param orders
     */
    void insert(Orders orders);
}
