package club.codedemo.springbootcustomautoconfiguration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DisableAutoConfigurationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void dingService() {
        Assertions.assertThrows(NoSuchBeanDefinitionException.class,
                () -> this.applicationContext.getBean("ding9Service"));
    }
}