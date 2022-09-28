package com.deepblue.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 创建一个配置类; spring.mine.json.name=xxx
 */
@Data
@ConfigurationProperties(prefix = "spring.mine.json")
public class MineProperties {

    public static final String DEFAULT_JSON = "zhangsan";

    private String name = DEFAULT_JSON;

}
