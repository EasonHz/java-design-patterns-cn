package com.hz.strategy2;

/**
 * 复杂利息计算方法
 *
 * @author hz
 * @since 2022/10/11
 */
public class CompoundInterestCalculator implements InterestCalculationStrategy {

    @Override
    public double calculateInterest(final double principal, final double rate, final int term) {
        return (principal * Math.pow(1.0 + rate / 100.0, term) - principal);
    }

    @Override
    public String toString() {
        return "复杂利息计算";
    }

}
