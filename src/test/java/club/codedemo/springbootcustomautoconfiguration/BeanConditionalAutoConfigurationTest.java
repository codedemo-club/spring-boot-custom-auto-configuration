package club.codedemo.springbootcustomautoconfiguration;

import club.codedemo.springbootcustomautoconfiguration.service.EmailService;
import club.codedemo.springbootcustomautoconfiguration.service.EmailServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BeanConditionalAutoConfigurationTest {

    @Autowired
    EmailService emailService;

    @Test
    void emailService() {
        Assertions.assertTrue(this.emailService instanceof EmailServiceImpl);
    }
}