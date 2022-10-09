package com.hz.adapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hz
 * @since 2022/10/8
 */
public class Drawing {

    List<Shape> shapes = new ArrayList<>();

    public Drawing() {
        super();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return new ArrayList<>(shapes);
    }

    public void draw() {
        if (shapes.isEmpty()) {
            System.out.println("没什么可画的!");
        } else {
            shapes.forEach(Shape::draw);
        }
    }

    public void resize() {
        if (shapes.isEmpty()) {
            System.out.println("没有可调整的!");
        } else {
            shapes.forEach(Shape::resize);
        }
    }
}
