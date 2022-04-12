package com.org.decoratorImpl;

import com.org.burger.Burger;
import com.org.decorator.BurgerDecorator;

public class EggDecorator implements BurgerDecorator {

	Burger burger;
	
	public EggDecorator(Burger burger) {
		this.burger = burger;
	}

	@Override
	public double calculatePrice() {
		return burger.calculatePrice() + 2;
	}

}
