package club.codedemo.springbootcustomautoconfiguration.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailServiceImpl implements EmailService {
    private final Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);

    @Override
    public void send(String address, String title, String description) {
        this.logger.info("发送邮件");
    }
}
