package com.hz.adapter2;

/**
 * @author haizhou
 * @since 2022/10/9
 */

public class TwoWaysAdapterMain {

    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.addShape(new TwoWaysAdapter(ShapeType.RECTANGLE));
        drawing.addShape(new TwoWaysAdapter(ShapeType.CIRCLE));
        drawing.addShape(new TwoWaysAdapter(ShapeType.TRIANGLE));
        drawing.addShape(new TwoWaysAdapter(ShapeType.RHOMBUS));

        System.out.println("开始绘制形状...");
        drawing.draw();
        System.out.println("开始调整大小...");
        drawing.resize();
    }

}