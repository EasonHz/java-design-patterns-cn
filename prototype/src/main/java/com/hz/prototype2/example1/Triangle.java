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
public class Triangle extends Shape {

	protected int sideA;
	protected int sideB;
	protected int sideC;
	protected FillStyle fillStyle;

	public Triangle() {
		super();
	}

	// prototype or deep copy constructor
	public Triangle(Triangle triangle) {
		super(triangle);
		System.out.println("Deep Copying Triangle...");
		this.sideA = triangle.sideA;
		this.sideB = triangle.sideB;
		this.sideC = triangle.sideC;
		this.fillStyle = new FillStyle(triangle.fillStyle);
	}

	@Override
	public void draw() {
		System.out.printf("Drawing Triangle (%s, %s).\n", super.toString(), this.toString());
	}

	@Override
	String type() {
		return "Triangle";
	}

}
