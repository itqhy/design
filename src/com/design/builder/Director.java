package com.design.builder;

/**
 * 建造者
 * @author Administrator
 *
 */
public class Director {

	public Person constructPerson(Builder builder) {
		builder.buildHead();
		builder.buildBody();
		builder.buildFoot();
		Person person = builder.buildPerson();
		return person;
	}
}
