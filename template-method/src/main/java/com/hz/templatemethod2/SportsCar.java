package com.hz.templatemethod2;

/**
 * @author hz
 * @since 2022/10/10
 */
public class SportsCar extends CarTemplate {

    public SportsCar() {
        super();
    }

    @Override
    public void fixChassis() {
        System.out.println("装配运动车型底盘");
        this.chassis = "Sporty Chassis";
    }

    @Override
    public void fixBody() {
        System.out.println("装配运动车型车体");
        this.body = "Sporty Body";
    }

    @Override
    public void paint() {
        System.out.println("给运动车型喷上红色油漆");
        this.paint = "Sporty Torch Red Paint";
    }

    @Override
    public void fixInterior() {
        System.out.println("安装运动车型内饰");
        this.interior = "Sporty interior";
    }
}
