package fr.mds.designpattern.abstractfactory.shape;

import fr.mds.designpattern.abstractfactory.item.Item;

public class Circle implements Shape, Item {

	public static final String CIRCLE = "CIRCLE";

	@Override
	public void draw() {
		System.out.println("Draw circle");
	}

	@Override
	public String getName() {
		return CIRCLE + " shape";
	}
	
}
