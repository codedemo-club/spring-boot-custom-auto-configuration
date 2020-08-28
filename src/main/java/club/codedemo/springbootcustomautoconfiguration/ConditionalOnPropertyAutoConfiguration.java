package club.codedemo.springbootcustomautoconfiguration;

import club.codedemo.springbootcustomautoconfiguration.service.DingService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 5.按配置项自动配置
 */
@PropertySource("classpath:ding.properties")
@Configuration
public class ConditionalOnPropertyAutoConfiguration {

    /**
     * 当url 值为alibaba 时，装配此bean
     * bean名起为dingService
     * @return
     */
    @Bean(name = "dingService")
    @ConditionalOnProperty(
            name = "url",
            havingValue = "alibaba")
    DingService dingService() {
        return message -> {
            // 处理钉钉消息
        };
    }

    /**
     * 当URL值为codedemo时，装配此bean
     * bean名称为ding1Service
     * @return
     */
    @Bean(name = "ding1Service")
    @ConditionalOnProperty(
            name = "url",
            havingValue = "codedemo")
    DingService dingService1() {
        return message -> {
            // 处理钉钉消息
        };
    }
}
