package club.codedemo.springbootcustomautoconfiguration.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 配置了com.mengyunzhi.core.service.YunzhiService时，启用该Bean
 * 调用发送短信方法时将输出一条日志信息
 */
public class SmsServiceMyzImpl implements SmsService {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void sendMessage(String phone, String message) {
        logger.info("发送手机号为：" + phone + "发送内容：" + message);
    }
}
