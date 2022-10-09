package com.hz.decorator2;

/**
 * @author hz
 * @since 2022/10/9
 */
public class LineStyleDecorator extends ShapeDecorator {

    protected LineStyle style;

    public LineStyleDecorator(Shape decoratedShape, LineStyle style) {
        super(decoratedShape);
        this.style = style;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("线条样式是: " + style);
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
        return decoratedShape.description() + " drawn with " + style + " lines.";
    }

    /**
     * 功能无变化
     */
    @Override
    public boolean isHide() {
        return decoratedShape.isHide();
    }

}
