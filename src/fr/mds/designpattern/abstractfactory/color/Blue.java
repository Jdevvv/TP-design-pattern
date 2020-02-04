package fr.mds.designpattern.abstractfactory.color;

import fr.mds.designpattern.abstractfactory.item.Item;

public class Blue implements Color, Item{

	public static final String BLUE = "BLUE";

	@Override
	public void fill() {
		System.out.println("Fill Blue");
	}

	@Override
	public String getName() {
		return BLUE + " color";
	}

}
