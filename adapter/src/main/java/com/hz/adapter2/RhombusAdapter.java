package com.hz.adapter2;

/**
 * @author haizhou
 * @since 2022/10/8
 */
public class RhombusAdapter extends Rhombus implements Shape {

    public RhombusAdapter() {
        super();
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("菱形不能被调整大小，请使用必须值创建新的");
    }

    @Override
    public String description() {
        return "菱形";
    }

    @Override
    public boolean isHide() {
        return false;
    }

}