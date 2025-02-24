package com.sky.mapper;

import com.sky.entity.SetmealDish;

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

    /**
     * 批量保存套餐和菜品的关联关系
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);
}
