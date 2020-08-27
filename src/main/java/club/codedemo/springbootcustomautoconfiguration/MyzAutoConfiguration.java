package club.codedemo.springbootcustomautoconfiguration;

import club.codedemo.springbootcustomautoconfiguration.service.SmsService;
import club.codedemo.springbootcustomautoconfiguration.service.SmsServiceMyzImpl;
import com.mengyunzhi.core.service.YunzhiService;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * 当classPath中存在com.mengyunzhi.core.service.YunzhiService时，此配置生效。
 * <p>
 * 适应环境：将本项目打包为第三方的JAR包被其它的项目引用时,
 *  * 如果引用该包的项目中存在com.mengyunzhi.core.service.YunzhiService，则此配置生效。
 *  * 本例中并没有演示打包为JAR并被其它的项目引用的情景。
 *  * 所以本类在本项目中将一直生效
 * </p>
 */
@Configuration
@ConditionalOnClass(YunzhiService.class)
@AutoConfigureOrder(Ordered.HIGHEST_PRECEDENCE)
public class MyzAutoConfiguration {

    @Bean
    SmsService smsService() {
        return new SmsServiceMyzImpl();
    }
}
