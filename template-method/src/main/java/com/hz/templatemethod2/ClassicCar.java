package com.hz.templatemethod2;

/**
 * @author hz
 * @since 2022/10/10
 */
public class ClassicCar extends CarTemplate {

    public ClassicCar() {
        super();
    }

    @Override

    public void fixChassis() {
        System.out.println("装配经典车型的底盘");
        this.chassis = "Classic Chassis";
    }

    @Override
    public void fixBody() {
        System.out.println("装配经典车型的车体");
        this.body = "Classic Body";
    }

    @Override
    public void paint() {
        System.out.println("喷上白色车漆...");
        this.paint = "Classic White Paint";
    }

    @Override
    public void fixInterior() {
        System.out.println("安装经典车型的内饰...");
        this.interior = "Classic interior";
    }

}
