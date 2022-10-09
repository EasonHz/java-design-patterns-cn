package com.hz.adapter2;

/**
 * @author haizhou
 * @since 2022/10/9
 */
public class TwoWaysAdapter implements Shape, GeometricShape {


    private ShapeType shapeType;

    public TwoWaysAdapter() {
        this(ShapeType.TRIANGLE);
    }

    public TwoWaysAdapter(ShapeType shapeType) {
        super();
        this.shapeType = shapeType;
    }

    @Override
    public void draw() {
        switch (shapeType) {
            case CIRCLE:
                new Circle().draw();
                break;
            case RECTANGLE:
                new Rectangle().draw();
                break;
            case TRIANGLE:
                new Triangle().drawShape();
                break;
            case RHOMBUS:
                new Rhombus().drawShape();
                break;
            default:
                break;
        }
    }

    @Override
    public void resize() {
        switch (shapeType) {
            case CIRCLE:
                new Circle().resize();
                break;
            case RECTANGLE:
                new Rectangle().resize();
                break;
            case TRIANGLE:
                System.out.println("三角形 不能被调整大小，请使用必须值创建新的");
                break;
            case RHOMBUS:
                System.out.println("菱形 不能被调整大小，请使用必须值创建新的");
                break;
            default:
                break;
        }
    }

    @Override
    public String description() {
        switch (shapeType) {
            case CIRCLE:
                return new Circle().description();
            case RECTANGLE:
                return new Rectangle().description();
            case TRIANGLE:
                return "三角形";
            case RHOMBUS:
                return "菱形";
            default:
                break;
        }
        return "Unknown object";
    }

    @Override
    public boolean isHide() {
        return false;
    }

    @Override
    public double area() {
        switch (shapeType) {
            case CIRCLE:
            case RECTANGLE:
                return 0.0d;
            case TRIANGLE:
                return new Triangle().area();
            case RHOMBUS:
                return new Rhombus().area();
        }
        return 0.0d;
    }

    @Override
    public double perimeter() {
        switch (shapeType) {
            case CIRCLE:
            case RECTANGLE:
                return 0.0d;
            case TRIANGLE:
                return new Triangle().perimeter();
            case RHOMBUS:
                return new Rhombus().perimeter();
        }
        return 0.0d;
    }

    @Override
    public void drawShape() {
        draw();
    }

}
