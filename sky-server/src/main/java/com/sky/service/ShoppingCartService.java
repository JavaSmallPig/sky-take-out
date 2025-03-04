package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

/**
 * @Author Java小猪
 * @Date 2025/3/4 15:49
 */
public interface ShoppingCartService {
    /**
     * 添加购物车
     */
    void add(ShoppingCartDTO shoppingCartDTO);

    /**
     * 查询购物车
     */
    List<ShoppingCart> getShoppingCart();
}
