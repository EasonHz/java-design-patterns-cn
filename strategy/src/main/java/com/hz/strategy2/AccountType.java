package com.hz.strategy2;

/**
 * 账户类型
 *
 * @author hz
 * @since 2022/10/11
 */
public enum AccountType {

    //储蓄账户
    SAVING(2.0d),
    //活期账户
    CURRENT(1.0d);
    /**
     * 利率
     */
    private final double rate;

    AccountType(final double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

}
