package fr.mds.designpattern.abstractfactory.color;

import fr.mds.designpattern.abstractfactory.item.Item;

public class Green implements Color, Item {
	@Override
	public void fill() {
		System.out.println("Fill green");
	}

	@Override
	public String getName() {
		return "green color";
	}

}
