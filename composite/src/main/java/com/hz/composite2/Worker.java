package com.hz.composite2;

/**
 * @author hz
 */
public interface Worker {

    /**
     * 分配工作
     *
     * @param manager 经理
     * @param work    工作
     */
    void assignWork(Employee manager, Work work);

    /**
     * 执行工作
     */
    void performWork();
}
