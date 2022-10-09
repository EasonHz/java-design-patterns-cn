package com.hz.adapter2;

/**
 * @author haizhou
 * @since 2022/10/8
 */
public class ObjectAdapterMain {

    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());
        drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));
        drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus()));
        System.out.println("开始绘制形状...");
        drawing.draw();
        System.out.println("开始调整大小...");
        drawing.resize();
    }

}
