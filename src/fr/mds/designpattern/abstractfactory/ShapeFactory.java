package fr.mds.designpattern.abstractfactory;

import fr.mds.designpattern.abstractfactory.item.Item;
import fr.mds.designpattern.abstractfactory.shape.Circle;
import fr.mds.designpattern.abstractfactory.shape.Rectangle;
import fr.mds.designpattern.abstractfactory.shape.Shape;
import fr.mds.designpattern.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory{
	Shape s;
	Item i;
	
	public Shape getShape(String shape) {
		switch (shape) {
			case AllObjects.CIRCLE:
				s = new Circle();
				break;
			case AllObjects.SQUARE:
				s = new Square();
				break;
			case AllObjects.RECTANGLE:
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
		case AllObjects.CIRCLE:
			i = new Circle();
			break;
		case AllObjects.SQUARE:
			i = new Square();
			break;
		case AllObjects.RECTANGLE:
			i = new Rectangle();
			break;
		default:
			i = null;
			break;
		}
		return i;
	}
}
