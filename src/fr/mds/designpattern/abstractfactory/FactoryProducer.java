package fr.mds.designpattern.abstractfactory;

import fr.mds.designpattern.abstractfactory.color.Blue;
import fr.mds.designpattern.abstractfactory.color.Green;
import fr.mds.designpattern.abstractfactory.color.Red;
import fr.mds.designpattern.abstractfactory.item.Item;
import fr.mds.designpattern.abstractfactory.shape.Circle;
import fr.mds.designpattern.abstractfactory.shape.Rectangle;
import fr.mds.designpattern.abstractfactory.shape.Square;

public class FactoryProducer {
	public static AbstractFactory getFactory(String type) {
		AbstractFactory af;
		
		switch (type) {
		case ShapeFactory.SHAPE:
			af = new ShapeFactory();
			break;
		case ColorFactory.COLOR:
			af = new ColorFactory();
			break;
		default:
			af = null;
			break;
		}
		return af;	
	}
	
	public static Item getItem(String type) {
		Item i;
		switch (type) {
		case Blue.BLUE:
		case Red.RED:
		case Green.GREEN:
			i = new ColorFactory().getItem(type);
			break;
		case Circle.CIRCLE:
		case Rectangle.RECTANGLE:
		case Square.SQUARE:
			i = new ShapeFactory().getItem(type);
			break;
		default:
			i = null;
			break;
		}
		return i;
	}
}
