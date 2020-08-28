package club.codedemo.springbootcustomautoconfiguration;

import club.codedemo.springbootcustomautoconfiguration.service.DingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author panjie
 */
@Configuration
public class DisableAutoConfiguration {

    @Bean("ding9Service")
    DingService dingService() {
        return message -> {};
    }
}
