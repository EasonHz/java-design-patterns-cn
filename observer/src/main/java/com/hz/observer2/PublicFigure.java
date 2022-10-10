package com.hz.observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * 公共人物类
 *
 * @author hz
 * @since 2022/10/9
 */
public class PublicFigure implements Subject {

    protected List<Observer> observers = new ArrayList<>();
    protected String name;
    protected String handle;

    public PublicFigure(String name, String handle) {
        super();
        this.name = name;
        this.handle = "#" + handle;
    }

    public void tweet(String tweet) {
        System.out.printf("\nName: %s, Tweet: %s\n", name, tweet);
        notifySubscribers(tweet);
    }

    @Override
    public synchronized void addSubscriber(Observer observer) {
        observers.add(observer);
    }

    @Override
    public synchronized void removeSubscriber(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers(String tweet) {
        observers.forEach(observer -> observer.notification(handle, tweet));
    }
}
