package com.hz.templatemethod2;

/**
 * @author hz
 * @since 2022/10/10
 */
public abstract class CarTemplate {

    protected String chassis;
    protected String body;
    protected String paint;
    protected String interior;

    public CarTemplate() {
        super();
    }

    /**
     * 造底盘
     */
    public abstract void fixChassis();

    /**
     * 造车体
     */
    public abstract void fixBody();

    /**
     * 喷油漆
     */
    public abstract void paint();

    /**
     * 装内饰
     */
    public abstract void fixInterior();

    /**
     * 模板方法
     */
    public void manufactureCar() {
        fixChassis();
        fixBody();
        paint();
        fixInterior();
    }

    @Override
    public String toString() {
        return "Car [chassis=" + chassis + ", body=" + body + ", paint=" + paint +
                ", interior=" + interior + "]";
    }

}