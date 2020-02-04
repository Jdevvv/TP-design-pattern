package fr.mds.designpattern.abstractfactory.color;

import fr.mds.designpattern.abstractfactory.item.Item;

public class Red implements Color, Item {
	@Override
	public void fill() {
		System.out.println("Fill red");
	}

	@Override
	public String getName() {
		return "red color";
	}

}
