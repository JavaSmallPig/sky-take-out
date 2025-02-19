package com.sky.mapper;

import com.sky.entity.Category;
import org.apache.ibatis.annotations.Insert;

/**
 * @Author Java小猪
 * @Date 2025/2/19 17:24
 */
public interface CategoryMapper {

    /**
     * 新增分类
     *
     * @param category
     */
    @Insert("insert into category(type, name, sort, status, create_time, update_time, create_user, update_user)" +
            " VALUES" +
            " (#{type}, #{name}, #{sort}, #{status}, #{createTime}, #{updateTime}, #{createUser}, #{updateUser})")
    void saveCategory(Category category);
}
