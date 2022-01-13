package br.com.cod3r.builder.meal.builder;

import br.com.cod3r.builder.meal.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {	
	protected FastFoodMeal meal;
	
	public FastFoodMealBuilder() {
		meal = new FastFoodMeal();
	}
		
	public FastFoodMeal getMeal() {
		return meal;
	}
	
	public void buildMain() {}
	public void buildSide() {}
	public void buildGift() {}
	public void buildDrink() {}
	public void buildDessert() {}
}
