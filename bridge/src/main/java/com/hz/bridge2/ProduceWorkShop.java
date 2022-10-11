package com.hz.bridge2;

import java.util.concurrent.TimeUnit;

/**
 * 生产车间
 *
 * @author hz
 * @since 2022/10/11
 */
public class ProduceWorkShop extends WorkShop {

    public ProduceWorkShop() {
        super();
    }

    @Override
    public void work(Vehicle vehicle) {
        System.out.print("生产中... ");
        long timeToTake = 300L * vehicle.minWorkTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake);
        } catch (InterruptedException exp) {
            // nothing to do for now.
        }
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }

}
