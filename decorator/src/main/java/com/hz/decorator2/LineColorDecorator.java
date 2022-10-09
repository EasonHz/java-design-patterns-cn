package com.hz.decorator2;

/**
 * @author hz
 * @since 2022/10/9
 */
public class LineColorDecorator extends ShapeDecorator {

    protected Color color;

    public LineColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("线条颜色是: " + color);
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
        return decoratedShape.description() + " drawn with " + color + " color.";
    }

    /**
     * 功能无变化
     */
    @Override
    public boolean isHide() {
        return decoratedShape.isHide();
    }

}
