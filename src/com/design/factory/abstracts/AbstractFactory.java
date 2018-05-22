package com.design.factory.abstracts;

/**
 * 抽象工厂模式
 * @author Administrator
 *
 */
public abstract class AbstractFactory {

	/**
	 * 生产食品
	 * @return
	 */
	public abstract Foods createFoods();
	
	/**
	 * 生产饮料
	 * @return
	 */
	public abstract Drinks createDrinks();
}
