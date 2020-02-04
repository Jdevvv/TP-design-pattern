package fr.mds.designpattern.abstractfactory.shape;

import fr.mds.designpattern.abstractfactory.item.Item;

public class Square implements Shape, Item {

	public static final String SQUARE = "SQUARE";

	@Override
	public void draw() {
		System.out.println("Draw Square");
	}

	@Override
	public String getName() {
		return SQUARE + " shape";
	}

}
