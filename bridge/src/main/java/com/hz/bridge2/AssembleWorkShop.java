package com.hz.bridge2;

import java.util.concurrent.TimeUnit;

/**
 * 装配车间
 *
 * @author hz
 * @since 2022/10/11
 */
public class AssembleWorkShop extends WorkShop {

    public AssembleWorkShop() {
        super();
    }

    @Override
    public void work(Vehicle vehicle) {
        System.out.print("装配中... ");
        long timeToTake = 200L * vehicle.minWorkTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake);
        } catch (InterruptedException exp) {
            // nothing to do for now.
        }
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }

}
