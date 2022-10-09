package com.hz.adapter2;

/**
 * @author hz
 * @since 2022/10/8
 *
 */
public class Rhombus implements GeometricShape {
    /**
     * 边
     */
    private final double a;
    private final double b;

    public Rhombus() {
        this(1.0d, 1.0d);
    }

    public Rhombus(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }

    @Override
    public void drawShape() {
        System.out.println("绘制菱形的面积: " + area() + " 和周长: " + perimeter());
    }

}