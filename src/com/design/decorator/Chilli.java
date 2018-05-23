package com.design.decorator;

/**
 * 装饰者 --- 辣椒
 * @author Administrator
 *
 */
public class Chilli implements Condiment{
	
	Condiment humburger;
	
	public Chilli(Condiment humburger) {
		this.humburger = humburger;
	}

	@Override
	public String getName() {
		return humburger.getName() +"加辣椒";
	}

	@Override
	public double getPrice() {
		return humburger.getPrice() + 0.5;
	}

}
