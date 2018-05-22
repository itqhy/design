package com.design.builder;

public class ConcreteBuilder implements Builder{

	Person person;
	
	public ConcreteBuilder() {
		person = new Person();
	}
	
	@Override
	public void buildHead() {
		person.setHead("组装头部");
	}

	@Override
	public void buildBody() {
		person.setBody("组装身体部位");
	}

	@Override
	public void buildFoot() {
		person.setFoot("组装四肢");
	}

	@Override
	public Person buildPerson() {
		return person;
	}

}
