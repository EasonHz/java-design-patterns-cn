package com.hz.prototype2.example1;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author hz
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class Rectangle extends Shape {

	protected int length;
	protected int width;
	protected FillStyle fillStyle;

	public Rectangle() {
		super();
	}

	// prototype or deep copy constructor
	public Rectangle(Rectangle rectangle) {
		super(rectangle);
		System.out.println("Deep Copying Rectangle...");
		this.length = rectangle.length;
		this.width = rectangle.width;
		this.fillStyle = new FillStyle(rectangle.fillStyle);
	}

	@Override
	public void draw() {
		System.out.printf("Drawing Rectangle (%s, %s).\n", super.toString(), this.toString());
	}

	@Override
	String type() {
		return "Rectangle";
	}

}
