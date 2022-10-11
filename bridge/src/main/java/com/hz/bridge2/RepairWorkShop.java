package com.hz.bridge2;

import java.util.concurrent.TimeUnit;

/**
 * 维修车间
 *
 * @author hz
 * @since 2022/10/11
 */
public class RepairWorkShop extends WorkShop {

    public RepairWorkShop() {
        super();
    }

    @Override
    public void work(Vehicle vehicle) {
        System.out.print("维修中... ");
        long timeToTake = 150L * vehicle.minWorkTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake);
        } catch (InterruptedException exp) {
            // nothing to do for now.
        }
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }

}