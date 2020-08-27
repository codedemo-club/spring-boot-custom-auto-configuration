package club.codedemo.springbootcustomautoconfiguration;

import club.codedemo.springbootcustomautoconfiguration.service.SmsService;
import club.codedemo.springbootcustomautoconfiguration.service.SmsServiceMyzImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyzAutoConfigurationTest {

    @Autowired
    SmsService smsService;

    /**
     * 当前项目拥有YunzhiService
     * MyzAutoConfiguration生效
     * 注入SmsServiceMyzImpl
     */
    @Test
    void test() {
        Assertions.assertTrue(this.smsService instanceof SmsServiceMyzImpl);
    }
}