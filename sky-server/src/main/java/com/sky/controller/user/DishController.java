package com.sky.controller.user;

import com.sky.constant.StatusConstant;
import com.sky.entity.Dish;
import com.sky.result.Result;
import com.sky.service.DishService;
import com.sky.vo.DishVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Java小猪
 * @Date 2025/3/3 16:47
 */
@RestController("userDishController")
@RequestMapping("/user/dish")
@Api(tags = "C端-菜品浏览接口")
public class DishController {

    @Resource
    private DishService dishService;
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    public static final String REDIS_KEY_PREFIX = "dish_";

    /**
     * 根据分类id查询菜品
     *
     * @param categoryId
     * @return
     */
    @GetMapping("/list")
    @ApiOperation("根据分类id查询菜品")
    public Result<List<DishVO>> list(Long categoryId) {
        // 构造key
        String key = REDIS_KEY_PREFIX + categoryId;
        // 查询redis
        List<DishVO> list = (List<DishVO>) redisTemplate.opsForValue().get(key);
        // redis命中直接返回结果
        if (list != null && !list.isEmpty()) {
            return Result.success(list);
        }
        // redis未命中，查询数据库
        Dish dish = new Dish();
        dish.setCategoryId(categoryId);
        //查询起售中的菜品
        dish.setStatus(StatusConstant.ENABLE);
        list = dishService.listWithFlavor(dish);
        // 将数据写入redis
        redisTemplate.opsForValue().set(key, list);
        return Result.success(list);
    }
}
