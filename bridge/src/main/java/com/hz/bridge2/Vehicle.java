package com.hz.bridge2;

import java.util.ArrayList;
import java.util.List;

/**
 * 交通工具类
 *
 * @author hz
 * @since 2022/10/11
 */
public abstract class Vehicle {

    /**
     * 车间的装配线
     */
    protected List<WorkShop> workshops = new ArrayList<>();

    protected Vehicle() {
        super();
    }

    /**
     * 添加车间
     *
     * @param workshop 车间
     * @return 是否添加成功
     */
    public boolean joinWorkshop(WorkShop workshop) {
        return workshops.add(workshop);
    }

    /**
     * 制造交通工具
     */
    public abstract void manufacture();

    /**
     * 制造花费的时间
     *
     * @return 时间
     */
    public abstract int minWorkTime();

}
