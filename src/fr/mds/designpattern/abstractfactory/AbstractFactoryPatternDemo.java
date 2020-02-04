package fr.mds.designpattern.abstractfactory;

import fr.mds.designpattern.abstractfactory.color.Blue;
import fr.mds.designpattern.abstractfactory.color.Color;
import fr.mds.designpattern.abstractfactory.color.Green;
import fr.mds.designpattern.abstractfactory.color.Red;
import fr.mds.designpattern.abstractfactory.item.Item;
import fr.mds.designpattern.abstractfactory.shape.Circle;
import fr.mds.designpattern.abstractfactory.shape.Rectangle;
import fr.mds.designpattern.abstractfactory.shape.Shape;
import fr.mds.designpattern.abstractfactory.shape.Square;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		
		try {	
			System.out.println("--------- Ex 1 ---------");
			
			AbstractFactory shapeFactory =
				FactoryProducer.getFactory(ShapeFactory.SHAPE);
		
			Shape shape1 = shapeFactory.getShape(Circle.CIRCLE);
			shape1.draw();
			
			Shape shape2 = shapeFactory.getShape(Rectangle.RECTANGLE);
			shape2.draw();
			
			Shape shape3 = shapeFactory.getShape(Square.SQUARE);
			shape3.draw();
			
			AbstractFactory colorFactory =
					FactoryProducer.getFactory(ColorFactory.COLOR);
			
			Color color1 = colorFactory.getColor(Red.RED);
			color1.fill();
			
			Color color2 = colorFactory.getColor(Green.GREEN);
			color2.fill();
			
			Color color3 = colorFactory.getColor(Blue.BLUE);
			color3.fill();
			
			Shape myShape =
					FactoryProducer.getFactory(ShapeFactory.SHAPE).getShape(Circle.CIRCLE);
			myShape.draw();
			
			System.out.println("--------- Ex 2 ---------");
			
			Item item = FactoryProducer.getItem(Blue.BLUE);
			System.out.println("this is a " + item.getName());
			item = FactoryProducer.getItem(Green.GREEN);
			System.out.println("this is a " + item.getName());
			item = FactoryProducer.getItem(Red.RED);
			System.out.println("this is a " + item.getName());
			item = FactoryProducer.getItem(Square.SQUARE);
			System.out.println("this is a " + item.getName());
			item = FactoryProducer.getItem(Rectangle.RECTANGLE);
			System.out.println("this is a " + item.getName());
			item = FactoryProducer.getItem(Circle.CIRCLE);
			System.out.println("this is a " + item.getName());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
