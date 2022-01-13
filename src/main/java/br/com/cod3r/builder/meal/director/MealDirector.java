package br.com.cod3r.builder.meal.director;

import br.com.cod3r.builder.meal.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.meal.model.FastFoodMeal;

public class MealDirector {
	private FastFoodMeal meal;
	private FastFoodMealBuilder builder;
	
	public MealDirector(FastFoodMealBuilder builder) {
		this.builder = builder;
	}

	public void constructCombo() {
		builder.buildDrink();
		builder.buildMain();
		builder.buildSide();
		builder.buildDessert();
		builder.buildGift();
		meal = builder.getMeal();
	}

	public String getCombo() {
		return meal.toString();
	}
	
}
