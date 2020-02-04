package fr.mds.designpattern.abstractfactory.color;

public class Blue implements Color{

	public static final String BLUE = "BLUE";

	@Override
	public void fill() {
		System.out.println("Fill Blue");
	}

}
