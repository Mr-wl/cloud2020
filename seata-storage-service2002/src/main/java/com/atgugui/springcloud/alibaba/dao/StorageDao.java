package com.atgugui.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StorageDao {
    void decrease(@Param("productId")Long productId, @Param("count") Integer count);
}
