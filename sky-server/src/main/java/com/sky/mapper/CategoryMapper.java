package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

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

    /**
     * 分类分页查询
     *
     * @param categoryPageQueryDTO
     * @return
     */
    Page<Category> query(CategoryPageQueryDTO categoryPageQueryDTO);

    /**
     * 启用、禁用分类
     *
     * @param category
     */
    void update(Category category);

    /**
     * 根据id删除分类
     *
     * @param id
     */
    @Delete("delete from category where id = #{id}")
    void delById(Long id);

    /**
     * 根据类型查询分类
     *
     * @param type
     * @return
     */
    List<Category> getByType(Integer type);
}
