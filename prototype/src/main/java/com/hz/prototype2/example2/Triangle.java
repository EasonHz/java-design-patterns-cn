package com.hz.prototype2.example2;

public class Triangle extends Shape {

	protected int sideA;
	protected int sideB;
	protected int sideC;
	protected FillStyle fillStyle;

	public Triangle() {
		super();
	}

	// implemented clone method
	@Override
	public Triangle clone() throws CloneNotSupportedException {
		System.out.println("Cloning Triangle...");
		Triangle triangle = (Triangle) super.clone();
		// call explicit clone for handling cloning of nested objects
		triangle.fillStyle = fillStyle.clone();
		return triangle;
	}

	@Override
	public void draw() {
		System.out.printf("Drawing Triangle (%s, %s).\n", super.toString(), this.toString());
	}

	@Override
	String type() {
		return "Triangle";
	}

	public int getSideA() {
		return sideA;
	}

	public void setSideA(int sideA) {
		this.sideA = sideA;
	}

	public int getSideB() {
		return sideB;
	}

	public void setSideB(int sideB) {
		this.sideB = sideB;
	}

	public int getSideC() {
		return sideC;
	}

	public void setSideC(int sideC) {
		this.sideC = sideC;
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
		builder.append("sideA=").append(sideA).append(", sideB=").append(sideB).append(", sideC=").append(sideC)
				.append(", ").append(fillStyle);
		return builder.toString();
	}

}
