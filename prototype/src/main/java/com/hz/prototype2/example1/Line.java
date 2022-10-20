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
public class Line extends Shape {

	protected int x1;
	protected int y1;

	public Line() {
		super();
	}

	// prototype or deep copy constructor
	public Line(Line line) {
		super(line);
		System.out.println("Deep Copying Line...");
		this.x1 = line.x1;
		this.y1 = line.y1;
	}

	@Override
	public void draw() {
		System.out.printf("Drawing Line (%s, %s).\n", super.toString(), this.toString());
	}

	@Override
	String type() {
		return "Line";
	}

	@Override
	public void setY(int y1) {
		this.y1 = y1;
	}

}
