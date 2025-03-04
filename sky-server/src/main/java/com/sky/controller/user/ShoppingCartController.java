package com.sky.controller.user;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;
import com.sky.result.Result;
import com.sky.service.ShoppingCartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Java小猪
 * @Date 2025/3/4 15:45
 */
@RestController
@RequestMapping("/user/shoppingCart")
@Api(tags = "C端-购物车接口")
public class ShoppingCartController {

    @Resource
    private ShoppingCartService shoppingCartService;

    /**
     * 添加购物车
     * @param shoppingCartDTO
     * @return
     */
    @PostMapping("/add")
    @ApiOperation("添加购物车")
    public Result<String> add(@RequestBody ShoppingCartDTO shoppingCartDTO) {
        shoppingCartService.add(shoppingCartDTO);
        return Result.success();
    }

    /**
     * 查询购物车
     * @return
     */
    @GetMapping("/list")
    @ApiOperation("查询购物车")
    public Result<List<ShoppingCart>> getShoppingCart() {
        List<ShoppingCart> shoppingCarts = shoppingCartService.getShoppingCart();
        return Result.success(shoppingCarts);
    }

    /**
     * 清空购物车
     * @return
     */
    @DeleteMapping("/clean")
    @ApiOperation("清空购物车")
    public Result<String> cleanAll(){
        shoppingCartService.cleanAll();
        return Result.success();
    }

    /**
     * 删除购物车中一个商品
     * @param shoppingCartDTO
     * @return
     */
    @PostMapping("/sub")
    @ApiOperation("删除购物车中一个商品")
    public Result<String> sub(@RequestBody ShoppingCartDTO shoppingCartDTO) {
        shoppingCartService.sub(shoppingCartDTO);
        return Result.success();
    }
}
