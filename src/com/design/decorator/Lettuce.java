package com.design.decorator;

/**
 * 装饰者 -- 生菜
 * @author Administrator
 *
 */
public class Lettuce implements Condiment {
	
	Condiment humburger;  //持有一个被装饰者（汉堡）的引用，这是实现装饰器模式的关键
	
	public Lettuce(Condiment humburger) {  //用具体的汉堡实例来初始化
		this.humburger = humburger;
	}
	

	@Override
	public String getName() {
		return humburger.getName() + "加生菜";
	}

	@Override
	public double getPrice() {
		return humburger.getPrice() + 1.5;
	}

}
