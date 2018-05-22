package com.design.builder;

public class Test {

	/**
	 * 建造者模式
	 * @param args
	 */
	public static void main(String[] args) {
		Director director = new Director();
		Person person = director.constructPerson(new ConcreteBuilder());
		System.out.println(person.toString());
	}
}
