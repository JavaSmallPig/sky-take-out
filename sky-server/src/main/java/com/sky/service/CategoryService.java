package com.sky.service;

import com.sky.dto.CategoryDTO;

/**
 * @Author Java小猪
 * @Date 2025/2/19 17:24
 */
public interface CategoryService {

    /**
     * 新增分类
     * @param categoryDTO
     */
    void saveCategory(CategoryDTO categoryDTO);
}
