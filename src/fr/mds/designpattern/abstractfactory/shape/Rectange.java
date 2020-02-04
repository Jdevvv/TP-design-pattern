package fr.mds.designpattern.abstractfactory.shape;

public class Rectange implements Shape{
	
	public static final String RECTANGLE = "RECTANGLE";

	@Override
	public void draw() {
		System.out.println("Draw Rectangle");
	}
	
}
