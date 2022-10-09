package com.hz.adapter2;

/**
 * @author haizhou
 * @since 2022/10/8
 */
public class GeometricShapeObjectAdapter implements Shape {

    private GeometricShape adaptee;

    public GeometricShapeObjectAdapter(GeometricShape adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void draw() {
        adaptee.drawShape();
    }

    @Override
    public void resize() {
        System.out.println(description() + " 不能被调整大小，请使用必须值创建新的");
    }

    @Override
    public String description() {
        if (adaptee instanceof Triangle) {
            return "三角形";
        } else if (adaptee instanceof Rhombus) {
            return "菱形";
        } else {
            return "不知道的类型";
        }
    }

    @Override
    public boolean isHide() {
        return false;
    }

}
