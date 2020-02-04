package fr.mds.designpattern.abstractfactory.color;

public class Red implements Color {

	public static final String RED = "RED";

	@Override
	public void fill() {
		System.out.println("Fill Red");
	}

}
