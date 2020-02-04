package fr.mds.designpattern.abstractfactory;

import fr.mds.designpattern.abstractfactory.color.Blue;
import fr.mds.designpattern.abstractfactory.color.Color;
import fr.mds.designpattern.abstractfactory.color.Green;
import fr.mds.designpattern.abstractfactory.color.Red;
import fr.mds.designpattern.abstractfactory.shape.Circle;
import fr.mds.designpattern.abstractfactory.shape.Rectange;
import fr.mds.designpattern.abstractfactory.shape.Shape;
import fr.mds.designpattern.abstractfactory.shape.Square;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		
		try {	
			AbstractFactory shapeFactory =
				FactoryProducer.getFactory(ShapeFactory.SHAPE);
		
			Shape shape1 = shapeFactory.getShape(Circle.CIRCLE);
			shape1.draw();
			
			Shape shape2 = shapeFactory.getShape(Rectange.RECTANGLE);
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
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
