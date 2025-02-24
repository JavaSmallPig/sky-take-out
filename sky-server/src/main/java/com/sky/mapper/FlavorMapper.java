package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;

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

    /**
     * 根据菜品id删除对应口味数据
     * @param dishId
     */
    @Delete("delete from dish_flavor where dish_id = #{dishId}")
    void deleteByDishId(Long dishId);

    /**
     * 根据菜品id集合批量删除对应口味数据
     * @param dishIds
     */
    void deleteByDishIds(List<Long> dishIds);
}
