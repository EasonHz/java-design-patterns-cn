package com.hz.bridge2;

import java.util.concurrent.TimeUnit;

/**
 * 质检车间
 *
 * @author hz
 * @since 2022/10/11
 */
public class TestWorkShop extends WorkShop {

    public TestWorkShop() {
        super();
    }

    @Override
    public void work(Vehicle vehicle) {
        System.out.print("质检中... ");
        long timeToTake = 50L * vehicle.minWorkTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake);
        } catch (InterruptedException exp) {
            // nothing to do for now.
        }
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }

}