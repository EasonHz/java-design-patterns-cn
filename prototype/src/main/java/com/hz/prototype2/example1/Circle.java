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
public class Circle extends Shape {

	protected int radius;
	protected FillStyle fillStyle;

	public Circle() {
		super();
	}

	// prototype or deep copy constructor
	public Circle(Circle circle) {
		super(circle);
		System.out.println("Deep Copying Circle...");
		this.radius = circle.radius;
		this.fillStyle = new FillStyle(circle.fillStyle);
	}


	@Override
	public void draw() {
		System.out.printf("Drawing Circle (%s, %s).\n", super.toString(), this.toString());
	}

	@Override
	String type() {
		return "Circle";
	}

}
