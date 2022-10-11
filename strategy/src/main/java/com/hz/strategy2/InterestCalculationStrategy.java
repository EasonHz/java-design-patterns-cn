package com.hz.strategy2;

/**
 * 利息计算策略类
 *
 * @author hz
 * @since 2022/10/11
 */
public interface InterestCalculationStrategy {
    /**
     * 计算利息
     *
     * @param principal 本金
     * @param rate      利率
     * @param term      期数
     * @return 利息
     */
    double calculateInterest(double principal, double rate, int term);
}
