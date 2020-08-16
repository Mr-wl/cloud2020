package com.atguigu.springcloud.alibaba.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Data
@Component
@RefreshScope
public class Scrop {

    @Value("${config.info}")
    private String configInfo;
}
