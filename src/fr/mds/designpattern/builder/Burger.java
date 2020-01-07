package fr.mds.designpattern.builder;

public abstract class Burger implements Item {
	protected String name;
	protected Packing packing = new Wrapper();
	protected float price;

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public Packing packing() {
		return this.packing;
		
	}

	@Override
	public float price() {
		return this.price;
	}

	@Override
	public String toString() {
		return "Burger --> name: " + name + ", packing: " + packing + ", price: " + price;
	}
	
}
