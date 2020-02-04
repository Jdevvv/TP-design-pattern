package fr.mds.designpattern.abstractfactory.color;

public class Green implements Color {

	public static final String GREEN = "GREEN";

	@Override
	public void fill() {
		System.out.println("Fill Green");
	}

}
