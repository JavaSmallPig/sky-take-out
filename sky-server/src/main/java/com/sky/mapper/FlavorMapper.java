package com.sky.mapper;

import com.sky.entity.DishFlavor;

import java.util.List;

/**
 * @Author Java小猪
 * @Date 2025/2/21 11:04
 */
public interface FlavorMapper {
    /**
     * 批量插入口味数据
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);
}
