package com.org.decoratorImpl;

import com.org.burger.Burger;
import com.org.decorator.BurgerDecorator;

public class ChickenDecorator implements BurgerDecorator {

	Burger burger;

	public ChickenDecorator(Burger burger) {
		this.burger = burger;
	}

	@Override
	public double calculatePrice() {

		return burger.calculatePrice() + 10;
	}

}
