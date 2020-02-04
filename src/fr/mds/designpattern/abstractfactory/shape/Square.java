package fr.mds.designpattern.abstractfactory.shape;

import fr.mds.designpattern.abstractfactory.item.Item;

public class Square implements Shape, Item {
	@Override
	public void draw() {
		System.out.println("Draw square");
	}

	@Override
	public String getName() {
		return "square shape";
	}

}
