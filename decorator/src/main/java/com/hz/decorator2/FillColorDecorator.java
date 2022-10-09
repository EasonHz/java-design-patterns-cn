package com.hz.decorator2;

/**
 * @author hz
 * @since 2022/10/9
 */
public class FillColorDecorator extends ShapeDecorator {

    protected Color color;

    public FillColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("填充的颜色是: " + color);
    }

    /**
     * 功能无变化
     * 如果愿意，我们可以添加功能。没有限制
     * 但需要我们维护Shape API的结构
     */
    @Override
    public void resize() {
        decoratedShape.resize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " filled with " + color + " color.";
    }

    /**
     * 功能无变化
     */
    @Override
    public boolean isHide() {
        return decoratedShape.isHide();
    }

}