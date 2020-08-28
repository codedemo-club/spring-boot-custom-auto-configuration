package club.codedemo.springbootcustomautoconfiguration.service;

/**
 * 钉钉服务
 */
public interface DingService {
    /**
     * 发送钉钉消息
     *
     * @param message 消息
     */
    void sendMessage(String message);
}
