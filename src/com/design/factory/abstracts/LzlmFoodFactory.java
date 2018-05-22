package com.design.factory.abstracts;

/**
 * 具体工厂实现类
 * @author Administrator
 *
 */
public class LzlmFoodFactory extends AbstractFactory{

	@Override
	public Foods createFoods() {
		return new Noldes();  // 兰州大酒店 卖拉面
	}

	@Override
	public Drinks createDrinks() {
		return new Water();  //提供免费的水
	}

}
