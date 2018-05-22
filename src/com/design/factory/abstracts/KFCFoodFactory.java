package com.design.factory.abstracts;

public class KFCFoodFactory extends AbstractFactory {

	@Override
	public Foods createFoods() {
		return new PaoNodel(); //kfc卖泡面
	}

	@Override
	public Drinks createDrinks() {
		return new Cocok();  //可乐
 	}
}