package com.sky.service;

import com.sky.dto.ShoppingCartDTO;

/**
 * @Author Java小猪
 * @Date 2025/3/4 15:49
 */
public interface ShoppingCartService {
    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void add(ShoppingCartDTO shoppingCartDTO);
}
