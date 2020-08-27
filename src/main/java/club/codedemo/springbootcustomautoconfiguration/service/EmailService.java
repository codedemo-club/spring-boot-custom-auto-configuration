package club.codedemo.springbootcustomautoconfiguration.service;

/**
 * 发送邮件
 */
public interface EmailService {
    /**
     * 发送
     * @param address 地址
     * @param title 标题
     * @param description 邮件正文
     */
    void send(String address, String title, String description);
}
