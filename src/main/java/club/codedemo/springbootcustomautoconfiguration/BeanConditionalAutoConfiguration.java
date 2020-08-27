package club.codedemo.springbootcustomautoconfiguration;

import club.codedemo.springbootcustomautoconfiguration.service.EmailService;
import club.codedemo.springbootcustomautoconfiguration.service.EmailServiceImpl;
import club.codedemo.springbootcustomautoconfiguration.service.SmsService;
import com.mengyunzhi.core.service.YunzhiService;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureOrder(1)
public class BeanConditionalAutoConfiguration {

    /**
     * 当前容器中存在SmsService时生效
     * @return 邮件服务
     */
    @Bean
    @ConditionalOnBean(SmsService.class)
    public EmailService emailService() {
        return new EmailServiceImpl();
    }

    /**
     * 当前容器中 不 存在SmsService时生效
     * @return 邮件服务
     */
    @Bean
    @ConditionalOnMissingBean(SmsService.class)
    public EmailService customEmailService() {
        return (address, title, description) -> {
            throw new RuntimeException("未找到默认的emailService实现");
        };
    }
}
