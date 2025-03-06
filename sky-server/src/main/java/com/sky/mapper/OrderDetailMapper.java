package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Select;

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

    /**
     * 根据订单id查询订单明细
     * @param ordersId
     * @return
     */
    @Select("select * from order_detail where order_id = #{ordersId}")
    List<OrderDetail> getByOderId(Long ordersId);
}
