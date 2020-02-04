package fr.mds.designpattern.abstractfactory.item;

import fr.mds.designpattern.abstractfactory.color.Color;
import fr.mds.designpattern.abstractfactory.shape.Shape;

public class CombinedItem {
	private Shape shape;
	private Color color;
	
	public Shape getShape() {
		return shape;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
}
