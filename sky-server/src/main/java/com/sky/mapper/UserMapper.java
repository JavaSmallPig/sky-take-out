package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * @Author Java小猪
 * @Date 2025/3/3 15:32
 */
public interface UserMapper {

    /**
     * 根据openid查询数据
     * @param openid
     */
    @Select("select *from user where openid = #{openid}")
    User getByOpenid(String openid);

    /**
     * 插入数据
     * @param user
     */
    void insert(User user);
}
