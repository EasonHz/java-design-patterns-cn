package com.hz.observer2;

/**
 * @author hz
 * @since 2022/10/9
 */
public interface Observer {
    /**
     * 发送消息通知
     *
     * @param handle
     * @param tweet
     */
    void notification(String handle, String tweet);
}