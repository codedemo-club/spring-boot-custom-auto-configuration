package club.codedemo.springbootcustomautoconfiguration.service;

/**
 * 当未配置com.mengyunzhi.core.service.YunzhiService时，启用该Bean
 * 调用相应的方法将抛出异常
 */
public class SmsServiceErrorImpl implements SmsService {
    @Override
    public void sendMessage(String phone, String message) {
        throw new RuntimeException("不支持该方法，请配置短信服务商");
    }
}
