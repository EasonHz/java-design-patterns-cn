package com.hz.prototype2.example1;


import com.hz.prototype2.Color;
import com.hz.prototype2.FillPattern;
import lombok.Data;
import lombok.ToString;

/**
 * @author hz
 */
@Data
@ToString
public class FillStyle {

	protected Color fillColor;
	protected FillPattern fillPattern;

	public FillStyle() {
		super();
	}

	// prototype or deep copy constructor
	public FillStyle(FillStyle fillStyle) {
		super();
		System.out.println("Deep Copying FillStyle...");
		this.fillColor = fillStyle.fillColor;
		this.fillPattern = fillStyle.fillPattern;
	}

}
