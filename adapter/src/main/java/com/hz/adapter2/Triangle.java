package com.hz.adapter2;

/**
 * @author hz
 * @since 2022/10/8
 */
public class Triangle implements GeometricShape {
    /**
     * 边长
     */
    private final double a;
    private final double b;
    private final double c;

    public Triangle() {
        this(1.0d, 1.0d, 1.0d);
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        // Heron's formula:
        // Area = SquareRoot(s * (s - a) * (s - b) * (s - c))
        // where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        // P = a + b + c
        return a + b + c;
    }

    @Override
    public void drawShape() {
        System.out.println("绘制三角形的面积: " + area() + " 和周长: " + perimeter());
    }

}
