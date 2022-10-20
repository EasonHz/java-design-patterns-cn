package com.hz.prototype2.example2;


import com.hz.prototype2.Color;
import com.hz.prototype2.FillPattern;

public class FillStyle implements Cloneable {

	protected Color fillColor;
	protected FillPattern fillPattern;

	public FillStyle() {
		super();
	}

	// implemented clone method
	@Override
	public FillStyle clone() throws CloneNotSupportedException {
		return (FillStyle) super.clone();
	}

	public Color getFillColor() {
		return fillColor;
	}

	public void setFillColor(Color fillColor) {
		this.fillColor = fillColor;
	}

	public FillPattern getFillPattern() {
		return fillPattern;
	}

	public void setFillPattern(FillPattern fillPattern) {
		this.fillPattern = fillPattern;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("fillColor=").append(fillColor).append(", fillPattern=").append(fillPattern);
		return builder.toString();
	}

}
