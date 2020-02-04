package fr.mds.designpattern.abstractfactory;

import fr.mds.designpattern.abstractfactory.item.Item;
import fr.mds.designpattern.abstractfactory.shape.Circle;
import fr.mds.designpattern.abstractfactory.shape.Rectangle;
import fr.mds.designpattern.abstractfactory.shape.Shape;
import fr.mds.designpattern.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory{
	public static final String SHAPE = "SHAPE";
	Shape s;
	Item i;
	
	public Shape getShape(String shape) {
		switch (shape) {
			case "CIRCLE":
				s = new Circle();
				break;
			case "SQUARE":
				s = new Square();
				break;
			case "RECTANGLE":
				s = new Rectangle();
				break;
			default:
				s = null;
				break;
		}
		return s;
	}
	
	public Item getItem(String item) {
		switch (item) {
		case "CIRCLE":
			i = new Circle();
			break;
		case "SQUARE":
			i = new Square();
			break;
		case "RECTANGLE":
			i = new Rectangle();
			break;
		default:
			i = null;
			break;
		}
		return i;
	}
}
