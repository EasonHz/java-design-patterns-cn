package com.hz.observer.generic;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 抽象出来的，当被观察者状态发生变化时的行为
 *
 * @param <S> Subject 被观察对象
 * @param <O> Observer 观察者
 * @param <A> Argument type 参数类型
 * @author hz
 */
public abstract class Observable<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {

    protected final List<O> observers;

    public Observable() {
        this.observers = new CopyOnWriteArrayList<>();
    }

    public void addObserver(O observer) {
        this.observers.add(observer);
    }

    public void removeObserver(O observer) {
        this.observers.remove(observer);
    }

    /**
     * Notify observers.
     */
    @SuppressWarnings("unchecked")
    public void notifyObservers(A argument) {
        for (var observer : observers) {
            observer.update((S) this, argument);
        }
    }
}
