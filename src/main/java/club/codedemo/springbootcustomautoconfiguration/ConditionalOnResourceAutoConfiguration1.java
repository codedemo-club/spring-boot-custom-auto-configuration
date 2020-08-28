package club.codedemo.springbootcustomautoconfiguration;

import club.codedemo.springbootcustomautoconfiguration.service.DingService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 6 按配置文件存在与否自动配置
 * @author panjie
 */
@Configuration
@ConditionalOnResource(resources = "classpath:alibaba.properties")
public class ConditionalOnResourceAutoConfiguration1 {
    @Bean("ding3Service")
    DingService dingService() {
        return (message) -> {

        };
    }
}
