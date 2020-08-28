package club.codedemo.springbootcustomautoconfiguration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerConditionTrueAutoConfigurationTest {

    @Autowired
    ApplicationContext applicationContext;

    /**
     * 使用条件返回为true的注解
     * 则装配该bean
     * 断言获取成功
     */
    @Test
    void ding4Service() {
        Assertions.assertNotNull(this.applicationContext.getBean("ding4Service"));
    }

    /**
     * 使用条件返回为false的注解
     * 则不装配该bean
     * 断言获取时发生异常
     */
    @Test
    void ding5Service() {
        Assertions.assertThrows(NoSuchBeanDefinitionException.class,
                () -> this.applicationContext.getBean("ding5Service"));
    }
}