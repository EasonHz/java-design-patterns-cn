package com.hz.observer2;

/**
 * @author hz
 * @since 2022/10/9
 */
public interface Subject {

    /**
     * 添加订阅者
     *
     * @param observer 观察者
     */
    void addSubscriber(Observer observer);

    /**
     * 删除订阅者
     *
     * @param observer 观察者
     */
    void removeSubscriber(Observer observer);

    /**
     * 通知订阅者
     *
     * @param tweet 推特消息
     */
    void notifySubscribers(String tweet);
}
