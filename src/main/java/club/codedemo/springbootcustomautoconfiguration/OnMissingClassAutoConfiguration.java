package club.codedemo.springbootcustomautoconfiguration;

import club.codedemo.springbootcustomautoconfiguration.service.SmsService;
import club.codedemo.springbootcustomautoconfiguration.service.SmsServiceErrorImpl;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * YunzhiService不存在时启用
 */
@Configuration
@ConditionalOnMissingClass("com.mengyunzhi.core.service.YunzhiService")
@AutoConfigureOrder
public class OnMissingClassAutoConfiguration {
    @Bean
    SmsService smsService() {
        return new SmsServiceErrorImpl();
    }
}
