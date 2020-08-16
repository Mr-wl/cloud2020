package com.atgugu.springcloud.alibaba.controller;

import com.atgugu.springcloud.alibaba.domain.CommonResult;
import com.atgugu.springcloud.alibaba.domain.Order;
import com.atgugu.springcloud.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单床架成功");
    }
}
