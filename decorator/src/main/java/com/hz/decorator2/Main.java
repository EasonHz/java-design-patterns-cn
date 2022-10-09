package com.hz.decorator2;

/**
 * @author hz
 * @since 2022/10/9
 */
public class Main {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        System.out.println("开始绘制图形...");
        rectangle.draw();
        circle.draw();
        System.out.println();

        System.out.println("画一个红色、蓝色虚线、厚度为2的圆型 ...");
        Shape circle1 = new FillColorDecorator(new LineColorDecorator(new LineStyleDecorator(
                new LineThinknessDecorator(new Circle(), 2.0d), LineStyle.DASH), Color.BLUE), Color.RED);
        circle1.draw();
        System.out.println();

        //装饰器的顺序在这里也不太重要，因为它们都是独特的功能。
        //我们还可以在单独的语句中嵌套功能。
        System.out.println("在单独的语句中创建具有类似功能的对象。");
        Circle c = new Circle();
        LineThinknessDecorator lt = new LineThinknessDecorator(c, 2.0d);
        LineStyleDecorator ls = new LineStyleDecorator(lt, LineStyle.DASH);
        LineColorDecorator lc = new LineColorDecorator(ls, Color.BLUE);
        FillColorDecorator fc = new FillColorDecorator(lc, Color.RED);
        Shape circle3 = fc;
        circle3.draw();
        System.out.println();

        System.out.println("画一个绿色、黑色线条装饰的圆型...");
        Shape circle2 = new FillColorDecorator(new LineColorDecorator(new Circle(), Color.BLACK), Color.GREEN);
        circle2.draw();
        System.out.println();

        System.out.println("画一个黄色、红色双划线装饰的矩形...");
        Shape rectangle1 = new FillColorDecorator(new LineColorDecorator(new Rectangle(), Color.RED), Color.YELLOW);
        rectangle1.draw();
        System.out.println();

    }

}
