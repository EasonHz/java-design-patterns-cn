package com.hz.templatemethod2;

/**
 * @author hz
 * @since 2022/10/10
 */
public class ModernCar extends CarTemplate {

    public ModernCar() {
        super();
    }

    @Override

    public void fixChassis() {
        System.out.println("装配现代车型底盘");
        this.chassis = "Modern Chassis";
    }

    @Override
    public void fixBody() {
        System.out.println("装配现代车型车体");
        this.body = "Modern Body";
    }

    @Override
    public void paint() {
        System.out.println("喷上黑色油漆");
        this.paint = "Modern Black Paint";
    }

    @Override
    public void fixInterior() {
        System.out.println("安装现代车型内饰");
        this.interior = "Modern interior";
    }
}

