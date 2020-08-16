package com.atgugui.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.atgugu.springcloud.alibaba.dao")
public class MyBatisConfig {
}
