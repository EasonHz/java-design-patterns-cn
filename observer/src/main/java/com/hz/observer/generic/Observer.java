package com.hz.observer.generic;

/**
 * 观察者接口
 *
 * @param <S> Observable 被观察对象
 * @param <O> Observer 观察者
 * @param <A> Action 行为，动作
 * @author hz
 */
public interface Observer<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {

    /**
     * 被观察者转态发生变化时，通知观察者
     *
     * @param subject  被观察对象
     * @param argument 行为，动作
     */
    void update(S subject, A argument);
}
