package com.hz.decorator2;

/**
 * @author hz
 * @since 2022/10/9
 */
public class LineThinknessDecorator extends ShapeDecorator {

    protected double thickness;

    public LineThinknessDecorator(Shape decoratedShape, double thickness) {
        super(decoratedShape);
        this.thickness = thickness;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("线条宽度是: " + thickness);
    }

    /**
     * 功能无变化
     */
    @Override
    public void resize() {
        decoratedShape.resize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " drawn with line thickness " + thickness + ".";
    }

    /**
     * 功能无变化
     */
    @Override
    public boolean isHide() {
        return decoratedShape.isHide();
    }

}
