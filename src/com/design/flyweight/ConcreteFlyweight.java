package com.design.flyweight;

public class ConcreteFlyweight implements Flyweight{
	
	private String name;
	
	public ConcreteFlyweight(String name) {
		this.name = name;
	}
	

	@Override
	public void action(String name) {
		
	}

}
