package com.hz.prototype2.example2;

public abstract class Shape implements Cloneable {

	protected int x;
	protected int y;
	protected ShapeStyle shapeStyle;

	public Shape() {
		super();
	}

	// implemented clone method
	@Override
	public Shape clone() throws CloneNotSupportedException {
		Shape shape = (Shape) super.clone();
		// call explicit clone for handling cloning of nested objects
		shape.shapeStyle = shapeStyle.clone();
		return shape;
	}

	abstract void draw();

	abstract String type();

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ShapeStyle getStyle() {
		return shapeStyle;
	}

	public void setStyle(ShapeStyle shapeStyle) {
		this.shapeStyle = shapeStyle;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("x=").append(x).append(", y=").append(y).append(", ").append(shapeStyle);
		return builder.toString();
	}

}
