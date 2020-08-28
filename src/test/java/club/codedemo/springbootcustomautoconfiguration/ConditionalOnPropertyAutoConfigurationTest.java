package club.codedemo.springbootcustomautoconfiguration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConditionalOnPropertyAutoConfigurationTest {

    @Autowired
    ApplicationContext applicationContext;

    /**
     * 由于ding.properties文件中的url值不等于alibaba
     * 则dingService未注入
     *
     * 所以在获取dingService将得到一个NoSuchBeanDefinitionException
     */
    @Test
    void dingService() {
        Assertions.assertThrows(NoSuchBeanDefinitionException.class, () -> applicationContext.getBean("dingService"));
    }

    /**
     * 由于ding.properties文件中的url值等于codedemo
     * 则ding1Service注入
     *
     * 所以可以获取到ding1Service
     */
    @Test
    void dingService1() {
        Assertions.assertNotNull(applicationContext.getBean("ding1Service"));
    }
}