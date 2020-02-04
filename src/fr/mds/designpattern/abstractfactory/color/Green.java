package fr.mds.designpattern.abstractfactory.color;

import fr.mds.designpattern.abstractfactory.item.Item;

public class Green implements Color, Item {

	public static final String GREEN = "GREEN";

	@Override
	public void fill() {
		System.out.println("Fill Green");
	}

	@Override
	public String getName() {
		return GREEN + " color";
	}

}
