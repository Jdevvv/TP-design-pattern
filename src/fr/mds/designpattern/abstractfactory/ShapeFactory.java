package fr.mds.designpattern.abstractfactory;

import fr.mds.designpattern.abstractfactory.shape.Circle;
import fr.mds.designpattern.abstractfactory.shape.Rectange;
import fr.mds.designpattern.abstractfactory.shape.Shape;
import fr.mds.designpattern.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory{
	public static final String SHAPE = "SHAPE";
	
	public Shape getShape(String shape) {
		switch (shape) {
			case "CIRCLE":
				return new Circle();
			case "SQUARE":
				return new Square();
			case "RECTANGLE":
				return new Rectange();
			default:
				return null;
		}
	}
}
