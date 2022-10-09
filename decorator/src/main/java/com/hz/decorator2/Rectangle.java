package com.hz.decorator2;

/**
 * @author hz
 * @since 2022/10/8
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("画个长方形");
    }

    @Override
    public void resize() {
        System.out.println("调整长方形大小");
    }

    @Override
    public String description() {
        return "长方形";
    }

    @Override
    public boolean isHide() {
        return false;
    }

}
