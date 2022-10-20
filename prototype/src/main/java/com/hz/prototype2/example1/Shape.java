package com.hz.prototype2.example1;

import lombok.Data;
import lombok.ToString;

/**
 * @author hz
 */
@Data
@ToString
public abstract class Shape {

	protected int x;
	protected int y;
	protected ShapeStyle shapeStyle;

	protected Shape() {
		super();
	}

	// prototype or deep copy constructor
	protected Shape(Shape shape) {
		this();
		System.out.println("Deep Copying Shape...");
		this.x = shape.x;
		this.y = shape.y;
		this.shapeStyle = new ShapeStyle(shape.shapeStyle);
	}

	/**
	 * 绘制
	 */
	abstract void draw();

	/**
	 * 几何图形类型
	 * @return 返回几何图形
	 */
	abstract String type();

}
