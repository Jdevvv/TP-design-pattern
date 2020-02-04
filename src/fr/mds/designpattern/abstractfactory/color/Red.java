package fr.mds.designpattern.abstractfactory.color;

import fr.mds.designpattern.abstractfactory.item.Item;

public class Red implements Color, Item {

	public static final String RED = "RED";

	@Override
	public void fill() {
		System.out.println("Fill Red");
	}

	@Override
	public String getName() {
		return RED + " color";
	}

}
