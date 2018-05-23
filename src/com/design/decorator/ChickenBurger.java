package com.design.decorator;

/**
 * 鸡腿堡， 被装饰者初始状态，有些自己的简单装饰
 * @author Administrator
 *
 */
public class ChickenBurger implements Condiment{

	private String name;
	
	public ChickenBurger() {
		name =  "鸡腿堡";
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return 10;  //初始价格
	}

}
