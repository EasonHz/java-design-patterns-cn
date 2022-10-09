package com.hz.adapter2;

/**
 * 圆形
 *
 * @author hz
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("画个圈圈");
    }

    @Override
    public void resize() {
        System.out.println("调整圆圈的大小");
    }

    @Override
    public String description() {
        return "圆形";
    }

    @Override
    public boolean isHide() {
        return false;
    }

}
