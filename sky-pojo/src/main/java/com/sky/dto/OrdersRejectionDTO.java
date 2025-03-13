package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Diamond
 */
@Data
public class OrdersRejectionDTO implements Serializable {

    private Long id;

    //订单拒绝原因
    private String rejectionReason;

}
