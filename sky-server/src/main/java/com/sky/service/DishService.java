package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * @Author Java小猪
 * @Date 2025/2/21 10:46
 */
public interface DishService {
    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     */
    void saveWithFlavor(DishDTO dishDTO);
}
