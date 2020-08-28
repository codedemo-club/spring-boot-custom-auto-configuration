package club.codedemo.springbootcustomautoconfiguration;

import club.codedemo.springbootcustomautoconfiguration.service.DingService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebApplicationConditional {

    @Bean("ding6Service")
    @ConditionalOnWebApplication
    DingService ding6Service() {
        return message -> {};
    }

    @Bean("ding7Service")
    @ConditionalOnNotWebApplication
    DingService ding7Service() {
        return message -> {};
    }
}
