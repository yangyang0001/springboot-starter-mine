package com.deepblue.config;

import com.deepblue.service.MineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 创建自动配置类
 *  1、将业务ean自动装配
 *  2、从配置文件中读取配置
 */
@Configuration
@ConditionalOnClass(MineService.class)
@EnableConfigurationProperties(MineProperties.class)
public class MineAutoConfiguration {

    @Autowired
    private MineProperties mineProperties;

    @Bean
    @ConditionalOnMissingBean(MineService.class)        // 只有这个类必须出现在 classpath 才能被发现, 防止出现类找不到异常
    public MineService mineService() {

        MineService mineService = new MineService();
        mineService.setName(mineProperties.getName());

        return mineService;
    }


}
