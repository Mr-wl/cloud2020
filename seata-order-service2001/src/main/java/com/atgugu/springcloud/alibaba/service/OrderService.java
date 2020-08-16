package com.atgugu.springcloud.alibaba.service;

import com.atgugu.springcloud.alibaba.domain.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderService {
    void create(Order order);


}
