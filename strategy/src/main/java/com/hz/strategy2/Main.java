package com.hz.strategy2;

/**
 * @author hz
 * @since 2022/10/11
 */
public class Main {

    public static void main(String[] args) {
        Account acct1 = new Account(12345678L, "张三", AccountType.SAVING);
        acct1.setInterestStrategy(new CompoundInterestCalculator());
        acct1.deposit(10000.0d);
        System.out.println(acct1 + " 利息是: " + acct1.getInterest(5));

        Account acct2 = new Account(12345680L, "李四", AccountType.SAVING);
        acct2.setInterestStrategy(new SimpleInterestCalculator());
        acct2.deposit(10000.0d);
        System.out.println(acct2 + " 利息是: " + acct2.getInterest(5));
    }

}