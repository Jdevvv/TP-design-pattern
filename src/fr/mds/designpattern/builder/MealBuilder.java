package fr.mds.designpattern.builder;

public class MealBuilder {
	private Meal meal = new Meal();
	
	public MealBuilder prepareVegMeal() {
		this.meal.addItem(new VegBurger());
		this.meal.addItem(new Coke());
		
		return this;
	}

	public MealBuilder prepareNonVegMeal() {
		this.meal.addItem(new ChickenBurger());
		this.meal.addItem(new Pepsi());
		
		return this;
	}
	
	public MealBuilder prepareChildMenu() {
		this.meal.addItem(new ChickenBurger());
		this.meal.addItem(new Coke());
		this.meal.addItem(new CarGame());
		
		return this;
	}
	
	public MealBuilder addItem(Item item) {
		this.meal.addItem(item);
		
		return this;
	}
	
	public Meal build() {
		final Meal myMeal = this.meal;
		this.meal = new Meal();
		return myMeal;
	}

	
	
}
