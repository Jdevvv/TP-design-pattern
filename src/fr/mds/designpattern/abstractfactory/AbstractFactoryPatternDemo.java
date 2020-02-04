package fr.mds.designpattern.abstractfactory;

import fr.mds.designpattern.abstractfactory.color.Color;
import fr.mds.designpattern.abstractfactory.item.CombinedItem;
import fr.mds.designpattern.abstractfactory.item.DrawItem;
import fr.mds.designpattern.abstractfactory.item.Item;
import fr.mds.designpattern.abstractfactory.shape.Shape;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		
		try {	
			System.out.println("--------- Ex 1 ---------");
			
			AbstractFactory shapeFactory =
				FactoryProducer.getFactory(AllObjects.SHAPE);
		
			Shape shape1 = shapeFactory.getShape(AllObjects.CIRCLE);
			shape1.draw();
			
			Shape shape2 = shapeFactory.getShape(AllObjects.RECTANGLE);
			shape2.draw();
			
			Shape shape3 = shapeFactory.getShape(AllObjects.SQUARE);
			shape3.draw();
			
			AbstractFactory colorFactory =
					FactoryProducer.getFactory(AllObjects.COLOR);
			
			Color color1 = colorFactory.getColor(AllObjects.RED);
			color1.fill();
			
			Color color2 = colorFactory.getColor(AllObjects.GREEN);
			color2.fill();
			
			Color color3 = colorFactory.getColor(AllObjects.BLUE);
			color3.fill();
			
			Shape myShape =
					FactoryProducer.getFactory(AllObjects.SHAPE).getShape(AllObjects.CIRCLE);
			myShape.draw();
			
			System.out.println("--------- Ex 2 ---------");
			
			Item item = FactoryProducer.getItem(AllObjects.BLUE);
			System.out.println("this is a " + item.getName());
			item = FactoryProducer.getItem(AllObjects.GREEN);
			System.out.println("this is a " + item.getName());
			item = FactoryProducer.getItem(AllObjects.RED);
			System.out.println("this is a " + item.getName());
			item = FactoryProducer.getItem(AllObjects.SQUARE);
			System.out.println("this is a " + item.getName());
			item = FactoryProducer.getItem(AllObjects.RECTANGLE);
			System.out.println("this is a " + item.getName());
			item = FactoryProducer.getItem(AllObjects.CIRCLE);
			System.out.println("this is a " + item.getName());
			
			System.out.println("--------- Ex 3 ---------");
			
			CombinedItem cItem1 = new CombinedItem();
			cItem1.setColor(colorFactory.getColor(AllObjects.BLUE));
			cItem1.setShape(shapeFactory.getShape(AllObjects.SQUARE));
			
			CombinedItem cItem2 = new CombinedItem();
			cItem2.setColor(colorFactory.getColor(AllObjects.RED));
			cItem2.setShape(shapeFactory.getShape(AllObjects.SQUARE));
			
			CombinedItem cItem3 = new CombinedItem();
			cItem3.setColor(colorFactory.getColor(AllObjects.BLUE));
			cItem3.setShape(shapeFactory.getShape(AllObjects.CIRCLE));
			
			CombinedItem cItem4 = new CombinedItem();
			cItem4.setColor(colorFactory.getColor(AllObjects.GREEN));
			cItem4.setShape(shapeFactory.getShape(AllObjects.RECTANGLE));
			
			DrawItem dItem = new DrawItem();
			dItem.setName("mon dessin");
			dItem.getItems().add(cItem1);
			dItem.getItems().add(cItem2);
			dItem.getItems().add(cItem3);
			dItem.getItems().add(cItem4);
			dItem.print();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
