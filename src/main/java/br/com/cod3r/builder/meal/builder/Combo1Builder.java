package br.com.cod3r.builder.meal.builder;

public class Combo1Builder extends FastFoodMealBuilder{
	public void buildMain() {
		meal.setMain("Burgão top");
	}
	
	public void buildDrink() {
		meal.setDrink("Coquinha");
	}
}
