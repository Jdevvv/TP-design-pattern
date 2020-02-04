package fr.mds.designpattern.abstractfactory.shape;

import fr.mds.designpattern.abstractfactory.item.Item;

public class Rectangle implements Shape, Item{
	
	public static final String RECTANGLE = "RECTANGLE";

	@Override
	public void draw() {
		System.out.println("Draw Rectangle");
	}

	@Override
	public String getName() {
		return RECTANGLE + " shape";
	}
	
}
