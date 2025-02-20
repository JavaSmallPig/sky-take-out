package com.sky.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @Author Java小猪
 * @Date 2025/2/20 14:39
 */
public interface DishMapper {
    /**
     * 根据分类id查询菜品数量
     * @param id
     * @return
     */
    @Select("select count(id) from dish where category_id = #{categoryId}")
    Integer countByCategoryId(Long id);
}
