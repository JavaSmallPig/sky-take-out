package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.time.LocalDateTime;

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

    /**
     * 根据订单号查询订单
     * @param orderNumber
     */
    @Select("select * from orders where number = #{orderNumber}")
    Orders getByNumber(String orderNumber);

    /**
     * 修改订单信息
     * @param orders
     */
    void update(Orders orders);

    @Update("update orders set status = #{orderStatus}, checkout_time = #{checkoutTime},pay_status = #{orderPaidStatus} where id = #{orderId}")
    void updateStatus(Integer orderStatus, LocalDateTime checkoutTime, Integer orderPaidStatus, Long orderId);


    /**

     * 用于替换微信支付更新数据库状态的问题

     * @param orderStatus

     * @param orderPaidStatus

     */
    /*@Update("update orders set pay_status = #{orderPaidStatus} ,status = #{orderStatus}, ,checkout_time = #{check_out_time} where id = #{orderId}")
    void updateStatus(Integer orderPaidStatus, Integer orderStatus, LocalDateTime checkOutTime, Long orderId);*/
}
