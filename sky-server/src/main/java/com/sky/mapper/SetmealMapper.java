package com.sky.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @Author Java小猪
 * @Date 2025/2/20 14:39
 */
public interface SetmealMapper {
    /**
     * 根据分类id查询套餐的数量
     *
     * @param id
     * @return
     */
    @Select("select count(id) from setmeal where category_id = #{categoryId}")
    Integer countByCategoryId(Long id);
}
