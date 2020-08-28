package club.codedemo.springbootcustomautoconfiguration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 8. 根据是否为WEB应用进行配置
 */
@SpringBootTest
class WebApplicationConditionalTest {

    @Autowired
    ApplicationContext context;

    /**
     * 当前应用并没有引入web依赖，被认为是非WEB应用
     * 所以获取ding6Service将发生异常
     */
    @Test
    void ding6Service() {
        Assertions.assertThrows(NoSuchBeanDefinitionException.class,
                () -> this.context.getBean("ding6Service"));
    }

    /**
     * 当前应用并没有引入web依赖，被认为是非WEB应用
     * 所以能够获取到ding7Service
     */
    @Test
    void ding7Service() {
        Assertions.assertNotNull(this.context.getBean("ding7Service"));
    }
}