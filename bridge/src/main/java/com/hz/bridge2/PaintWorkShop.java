package com.hz.bridge2;

import java.util.concurrent.TimeUnit;

/**
 * 油漆车间
 *
 * @author hz
 * @since 2022/10/11
 */
public class PaintWorkShop extends WorkShop {

    public PaintWorkShop() {
        super();
    }

    @Override
    public void work(Vehicle vehicle) {
        System.out.print("喷漆中... ");
        long timeToTake = 100 * vehicle.minWorkTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake);
        } catch (InterruptedException exp) {
            // nothing to do for now.
        }
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }

}
