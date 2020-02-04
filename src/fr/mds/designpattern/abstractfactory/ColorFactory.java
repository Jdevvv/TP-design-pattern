package fr.mds.designpattern.abstractfactory;

import fr.mds.designpattern.abstractfactory.color.Blue;
import fr.mds.designpattern.abstractfactory.color.Color;
import fr.mds.designpattern.abstractfactory.color.Green;
import fr.mds.designpattern.abstractfactory.color.Red;
import fr.mds.designpattern.abstractfactory.item.Item;

public class ColorFactory extends AbstractFactory{
	
	public static final String COLOR = "COLOR";
	Color c;
	Item i;
	
	public Color getColor(String color) {
		switch (color) {
			case "RED":
				c = new Red();
				break;
			case "GREEN":
				c = new Green();
				break;
			case "BLUE":
				c = new Blue();
				break;
			default:
				c = null;
				break;
		}
		return c;
	}
	
	public Item getItem(String item) {
		switch (item) {
		case "RED":
			i = new Red();
			break;
		case "GREEN":
			i = new Green();
			break;
		case "BLUE":
			i = new Blue();
			break;
		default:
			i = null;
			break;
		}
		return i;
	}
}
