package com.design.decorator;

public class Test {
	public static void main(String[] args) {
		Condiment humburger = new ChickenBurger(); // 初始化一个鸡腿汉堡实例
		System.out.println(humburger.getName() + "  价钱：" + humburger.getPrice());
		// 测试单独加一种配料
		Condiment lettuce = new Lettuce(humburger);
		System.out.println(lettuce.getName() + "  价钱：" + lettuce.getPrice());
		Condiment chilli = new Chilli(humburger);
		System.out.println(chilli.getName() + "  价钱：" + chilli.getPrice());

		// 测试加多种配料
		humburger = new Lettuce(humburger); // 加入生菜，然后返回装配好的实例
		humburger = new Chilli(humburger); // 再加入辣椒，然后返回装配好的实例
		System.out.println(humburger.getName() + "  价钱：" + humburger.getPrice());
	}
}
