package fr.mds.designpattern.abstractfactory;

import fr.mds.designpattern.abstractfactory.color.Blue;
import fr.mds.designpattern.abstractfactory.color.Color;
import fr.mds.designpattern.abstractfactory.color.Green;
import fr.mds.designpattern.abstractfactory.color.Red;

public class ColorFactory extends AbstractFactory{
	
	public static final String COLOR = "COLOR";

	public Color getColor(String color) {
		switch (color) {
			case "RED":
				return new Red();
			case "GREEN":
				return new Green();
			case "BLUE":
				return new Blue();
			default:
				return null;
		}
	}
}
