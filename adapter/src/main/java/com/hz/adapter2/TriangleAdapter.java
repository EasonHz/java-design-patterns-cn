package com.hz.adapter2;

/**
 * @author hz
 * @since 2022/10/8
 */
public class TriangleAdapter extends Triangle implements Shape {

    public TriangleAdapter() {
        super();
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("三角形不能被调整大小，请使用必须值创建新的");
    }

    @Override
    public String description() {
        return "三角形";
    }

    @Override
    public boolean isHide() {
        return false;
    }

}
