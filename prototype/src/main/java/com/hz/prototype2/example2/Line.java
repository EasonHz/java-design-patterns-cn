package com.hz.prototype2.example2;

public class Line extends Shape {

	protected int x1;
	protected int y1;

	public Line() {
		super();
	}

	// implemented clone method
	@Override
	public Line clone() throws CloneNotSupportedException {
		System.out.println("Cloning Rectangle...");
		return (Line) super.clone();
	}

	@Override
	public void draw() {
		System.out.printf("Drawing Line (%s, %s).\n", super.toString(), this.toString());
	}

	@Override
	String type() {
		return "Line";
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y;
	}

	public void setY(int y1) {
		this.y1 = y1;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("x1=").append(x1).append(", y1=").append(y1);
		return builder.toString();
	}

}
