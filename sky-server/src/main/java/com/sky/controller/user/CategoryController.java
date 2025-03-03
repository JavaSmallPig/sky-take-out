package com.sky.controller.user;

import com.sky.entity.Category;
import com.sky.result.Result;
import com.sky.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Java小猪
 * @Date 2025/3/3 16:31
 */
@RestController("userCategoryController")
@RequestMapping("/user/category")
@Api(tags = "分类接口")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    /**
     * 用户端根据类型查询分类
     *
     * @return
     */
    @GetMapping("/list")
    @ApiOperation("用户端根据类型查询分类")
    public Result<List<Category>> getCategory(Integer type) {
        List<Category> categoryList = categoryService.getByType(type);
        return Result.success(categoryList);
    }
}
