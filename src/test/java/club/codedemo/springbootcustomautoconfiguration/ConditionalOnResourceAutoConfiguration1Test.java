package club.codedemo.springbootcustomautoconfiguration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConditionalOnResourceAutoConfiguration1Test {

    @Autowired
    ApplicationContext context;

    /**
     * 由于并不存在alibaba.properties文件
     * 所以ding3Service不存在，在获取该bean时发生异常
     */
    @Test
    void dingService() {
        Assertions.assertThrows(NoSuchBeanDefinitionException.class,
                () -> this.context.getBean("ding3Service"));
    }
}