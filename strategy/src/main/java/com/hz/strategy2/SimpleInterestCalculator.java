package com.hz.strategy2;

/**
 * 简单利息计算方法
 *
 * @author hz
 * @since 2022/10/11
 */
public class SimpleInterestCalculator implements InterestCalculationStrategy {

    @Override
    public double calculateInterest(final double principal, final double rate, final int term) {
        return ((principal * term * rate) / 100);
    }

    @Override
    public String toString() {
        return "简单利息计算";
    }

}
