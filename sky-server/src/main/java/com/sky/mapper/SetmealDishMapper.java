package com.sky.mapper;

import java.util.List;

/**
 * @Author Java小猪
 * @Date 2025/2/24 11:22
 */
public interface SetmealDishMapper {
    /**
     * 根据菜品id查询对应的套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
