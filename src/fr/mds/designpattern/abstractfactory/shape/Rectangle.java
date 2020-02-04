package fr.mds.designpattern.abstractfactory.shape;

import fr.mds.designpattern.abstractfactory.item.Item;

public class Rectangle implements Shape, Item{
	@Override
	public void draw() {
		System.out.println("Draw rectangle");
	}

	@Override
	public String getName() {
		return "rectangle shape";
	}
	
}
