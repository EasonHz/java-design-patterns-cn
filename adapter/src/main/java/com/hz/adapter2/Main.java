package com.hz.adapter2;

/**
 * @author haizhou
 * @since 2022/10/8
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("开始绘制形状...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());

        drawing.draw();
        drawing.resize();
    }
}
