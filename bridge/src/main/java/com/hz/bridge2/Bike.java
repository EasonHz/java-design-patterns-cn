package com.hz.bridge2;

/**
 * @author hz
 * @since 2022/10/11
 */
public class Bike extends Vehicle {

    @Override
    public void manufacture() {
        System.out.println("制造自行车");
        workshops.forEach(workshop -> workshop.work(this));
        System.out.println("制造完成");
        System.out.println();
    }

    @Override
    public int minWorkTime() {
        return 5;
    }

}

