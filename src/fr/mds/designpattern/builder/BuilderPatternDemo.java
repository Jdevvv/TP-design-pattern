package fr.mds.designpattern.builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		final MealBuilder mealBuilder = new MealBuilder();
				
		// MENU VEGE //
		Meal vegMeal = mealBuilder.prepareVegMeal().build();
		System.out.println("Veg meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
		// MENU NON VEGE //
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal().build();
		System.out.println("\nNon veg meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
		
		// MENU CUSTOM //
		Meal customMeal = mealBuilder
						.prepareNonVegMeal()
						.addItem(new ChickenBurger())
						.addItem(new VegBurger())
						.build();
		System.out.println("\nCustom meal");
		customMeal.showItems();
		System.out.println("Total Cost: "+ customMeal.getCost());
		
		// MENU ENFANT //
		Meal childMeal = mealBuilder.prepareChildMenu().build();
		System.out.println("\n Child meal");
		childMeal.showItems();
		System.out.println("Total Colst: " + childMeal.getCost());
	}
}
