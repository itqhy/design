package com.design.factory.simple;

/**
 * 多方法静态工厂
 * @author Administrator
 *
 */
public class Factory {
	
	public static Car createCar(){
		return new Car();
	}
	
	public static Tv createTv(){
		return new Tv();
	}

}
