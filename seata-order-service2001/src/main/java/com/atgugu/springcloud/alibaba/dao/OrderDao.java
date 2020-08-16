package com.atgugu.springcloud.alibaba.dao;

import com.atgugu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrderDao {

    //新建订单
    void create(Order order);

    //修改订单状态 从0 改为 1
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
