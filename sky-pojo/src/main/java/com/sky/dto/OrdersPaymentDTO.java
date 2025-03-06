package com.sky.dto;

import lombok.Data;
import java.io.Serializable;

/**
 * @author Diamond
 */
@Data
public class OrdersPaymentDTO implements Serializable {
    //订单号
    private String orderNumber;

    //付款方式
    private Integer payMethod;

}
