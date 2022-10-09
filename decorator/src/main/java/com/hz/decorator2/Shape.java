package com.hz.decorator2;

/**
 * @author hz
 * @since 2022/10/8
 */
public interface Shape {
    void draw();
    void resize();
    String description();
    boolean isHide();
}
