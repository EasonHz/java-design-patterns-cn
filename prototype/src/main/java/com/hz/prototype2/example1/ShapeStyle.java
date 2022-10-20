package com.hz.prototype2.example1;

import com.hz.prototype2.Color;
import com.hz.prototype2.LinePattern;
import lombok.Data;
import lombok.ToString;

/**
 * @author hz
 */
@Data
@ToString
public class ShapeStyle {

	protected Color lineColor;
	protected LinePattern linePattern;
	protected double lineThickness;

	public ShapeStyle() {
		super();
	}

	// prototype or deep copy constructor
	public ShapeStyle(ShapeStyle shapeStyle) {
		this();
		System.out.println("Deep Copying ShapeStyle...");
		this.lineColor = shapeStyle.lineColor;
		this.linePattern = shapeStyle.linePattern;
		this.lineThickness = shapeStyle.lineThickness;
	}
}
