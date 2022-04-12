package com.org.burgerImpl;

import com.org.burger.Burger;

public class NonVegBurger implements Burger{

	@Override
	public double calculatePrice() {
		
		return 5;
	}

}
