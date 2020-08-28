package club.codedemo.springbootcustomautoconfiguration;

import club.codedemo.springbootcustomautoconfiguration.service.DingService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 6 按配置文件存在与否自动配置
 */
@Configuration
@ConditionalOnResource(resources = "classpath:codedemo.properties")
public class ConditionalOnResourceAutoConfiguration {
    @Bean("ding2Service")
    DingService dingService() {
        return (message) -> {

        };
    }
}
