package com.hz.prototype2.example2;

public class Circle extends Shape {

	protected int radius;
	protected FillStyle fillStyle;

	public Circle() {
		super();
	}

	// implemented clone method
	@Override
	public Circle clone() throws CloneNotSupportedException {
		System.out.println("Cloning Circle...");
		Circle circle = (Circle) super.clone();
		// call explicit clone for handling cloning of nested objects
		circle.fillStyle = fillStyle.clone();
		return circle;
	}

	@Override
	public void draw() {
		System.out.printf("Drawing Circle (%s, %s).\n", super.toString(), this.toString());
	}

	@Override
	String type() {
		return "Circle";
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public FillStyle getFillStyle() {
		return fillStyle;
	}

	public void setFillStyle(FillStyle fillStyle) {
		this.fillStyle = fillStyle;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("radius=").append(radius).append(", ").append(fillStyle);
		return builder.toString();
	}

}
