package club.codedemo.springbootcustomautoconfiguration;

import club.codedemo.springbootcustomautoconfiguration.service.DingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConditionAutoConfiguration {

    @Bean("ding4Service")
    @Conditional(CustomerConditionTrue.class)
    DingService ding4Service() {
        return message -> {

        };
    }

    @Bean("ding5Service")
    @Conditional(CustomerConditionFalse.class)
    DingService ding5Service() {
        return message -> {

        };
    }
}
