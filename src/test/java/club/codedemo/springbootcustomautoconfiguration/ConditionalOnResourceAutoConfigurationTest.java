package club.codedemo.springbootcustomautoconfiguration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConditionalOnResourceAutoConfigurationTest {

    @Autowired
    ApplicationContext context;

    /**
     * 存在codedemo.properties文件
     * 所以自动装配了ding2Service
     * 获取成功
     */
    @Test
    void dingService() {
        Assertions.assertNotNull(this.context.getBean("ding2Service"));
    }
}