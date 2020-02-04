package fr.mds.designpattern.abstractfactory;

import fr.mds.designpattern.abstractfactory.item.Item;

public class FactoryProducer {
	public static AbstractFactory getFactory(String type) {
		AbstractFactory af;
		
		switch (type) {
		case AllObjects.SHAPE:
			af = new ShapeFactory();
			break;
		case AllObjects.COLOR:
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
		case AllObjects.BLUE:
		case AllObjects.RED:
		case AllObjects.GREEN:
			i = new ColorFactory().getItem(type);
			break;
		case AllObjects.CIRCLE:
		case AllObjects.RECTANGLE:
		case AllObjects.SQUARE:
			i = new ShapeFactory().getItem(type);
			break;
		default:
			i = null;
			break;
		}
		return i;
	}
}
