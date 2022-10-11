package com.hz.strategy2;

import lombok.Data;

/**
 * 账户
 *
 * @author hz
 * @since 2022/10/11
 */
@Data
public class Account {

    private long accountNo;
    private String accountHolderName;
    private AccountType accountType;
    private InterestCalculationStrategy interestStrategy;
    private double amount;

    public Account() {
        super();
    }

    public Account(long accountNo, String accountHolderName, AccountType accountType) {
        this();
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
    }


    public Account(long accountNo, String accountHolderName, AccountType accountType,
                   InterestCalculationStrategy interestStrategy) {
        this(accountNo, accountHolderName, accountType);
        this.interestStrategy = interestStrategy;
    }


    public void deposit(double amount) {
        //检查账户余额
        if (amount > 0.0d) {
            this.amount += amount;
        }
    }

    public void withdraw(double amount) {
        //检查账户余额
        if (amount > 0.0d && amount < this.amount) {
            this.amount -= amount;
        }
    }

    public double getInterest(int term) {
        if (getInterestStrategy() != null && getAccountType() != null) {
            return getInterestStrategy().calculateInterest(getAmount(), getAccountType().getRate(), term);
        }
        return 0.0d;
    }

    @Override
    public String toString() {
        return "账户 [accountNo=" + getAccountNo() +
                ", accountHolderName=" + getAccountHolderName() +
                ", accountType=" + getAccountType() +
                ", rate=" + ((getAccountType() != null) ? getAccountType().getRate() : 0.0d) +
                ", interestStrategy=" + getInterestStrategy() +
                ", amount=" + getAmount() + "]";
    }

}
