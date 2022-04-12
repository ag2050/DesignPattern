package com.org.test;

import com.org.burger.Burger;
import com.org.burgerImpl.NonVegBurger;
import com.org.decoratorImpl.ChickenDecorator;
import com.org.decoratorImpl.EggDecorator;

public class DecoratorTest {
	public static void main(String[] args) {
		Burger burger = new NonVegBurger();
		burger = new ChickenDecorator(burger);
		burger = new EggDecorator(burger);
		System.out.println(burger.calculatePrice());
	}
}
