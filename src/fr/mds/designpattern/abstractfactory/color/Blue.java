package fr.mds.designpattern.abstractfactory.color;

import fr.mds.designpattern.abstractfactory.item.Item;

public class Blue implements Color, Item{
	@Override
	public void fill() {
		System.out.println("Fill blue");
	}

	@Override
	public String getName() {
		return "blue color";
	}
					
	
}
