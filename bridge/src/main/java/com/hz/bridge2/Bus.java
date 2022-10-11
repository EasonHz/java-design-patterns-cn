package com.hz.bridge2;

/**
 * @author hz
 * @since 2022/10/11
 */
public class Bus extends Vehicle {

    @Override
    public void manufacture() {
        System.out.println("制造巴士");
        workshops.stream().forEach(workshop -> workshop.work(this));
        System.out.println("制造完成");
        System.out.println();
    }

    @Override
    public int minWorkTime() {
        return 20;
    }

}