package com.design.decorator;

public class Sauce implements Condiment {

	Condiment humburger;
	
	public Sauce(Condiment humburger) {
		this.humburger = humburger;
	}
	
	@Override
	public String getName() {
		return humburger.getName() + "加沙拉酱";
	}

	@Override
	public double getPrice() {
		return humburger.getPrice() + 0;  //免费
	}

}
