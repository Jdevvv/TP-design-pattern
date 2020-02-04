package fr.mds.designpattern.abstractfactory.shape;

public class Square implements Shape {

	public static final String SQUARE = "SQUARE";

	@Override
	public void draw() {
		System.out.println("Draw Square");
	}

}
