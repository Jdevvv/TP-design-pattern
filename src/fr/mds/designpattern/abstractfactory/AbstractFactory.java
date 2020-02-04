package fr.mds.designpattern.abstractfactory;

import fr.mds.designpattern.abstractfactory.color.Color;
import fr.mds.designpattern.abstractfactory.shape.Shape;

public class AbstractFactory {
	Shape getShape(String shape) {
		return new ShapeFactory().getShape(shape);
	}
	
	Color getColor(String color) {
		return new ColorFactory().getColor(color);
	}
}
