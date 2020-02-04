package fr.mds.designpattern.abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String type) {
		if (type == "SHAPE") {
			return new ShapeFactory();
		}
			
		if (type == "COLOR") {
			return new ColorFactory();
		}
		return null;
	}
}
