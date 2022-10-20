package com.hz.prototype2.example2;


import com.hz.prototype2.Color;
import com.hz.prototype2.FillPattern;
import com.hz.prototype2.LinePattern;

public class ShapeRegistryMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle();
		circle.setX(10);
		circle.setY(10);
		ShapeStyle circleStyle = new ShapeStyle();
		circleStyle.setLineColor(Color.BLUE);
		circleStyle.setLinePattern(LinePattern.DOT);
		circleStyle.setLineThickness(1.1d);
		FillStyle circleFillStyle = new FillStyle();
		circleFillStyle.setFillColor(Color.YELLOW);
		circleFillStyle.setFillPattern(FillPattern.HEART);
		circle.setStyle(circleStyle);
		circle.setFillStyle(circleFillStyle);

		System.out.println("Drawing original object");
		System.out.println("-------------------------------------------------------------------------");
		circle.draw();
		System.out.println("Making clone of original object");
		// check the registry if its already available at there.
		Circle deepCopyCircle = (Circle) ShapeRagistry.getByType(circle.type());
		if (deepCopyCircle == null) {
			// add it in the registry if its not available
			ShapeRagistry.addShape(circle);
		}
		// get the clone always from the regeistry and use.
		deepCopyCircle = (Circle) ShapeRagistry.getByType(circle.type());
		System.out.println("Drawing clone object");
		System.out.println("-------------------------------------------------------------------------");
		deepCopyCircle.draw();
		System.out.println("Modifying clone object");
		deepCopyCircle.setX(20);
		deepCopyCircle.getStyle().setLineColor(Color.RED);
		deepCopyCircle.getFillStyle().setFillPattern(FillPattern.CHECKS);
		System.out.println("\n\nDrawing original object");
		System.out.println("-------------------------------------------------------------------------");
		circle.draw();
		System.out.println("Drawing clone object");
		System.out.println("-------------------------------------------------------------------------");
		deepCopyCircle.draw();
	}

}
