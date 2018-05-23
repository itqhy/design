package com.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * @author Administrator
 *
 */
public class FlyweightFactory {

	private static final Map<String,Flyweight> map = new HashMap<String,Flyweight>();
	
	public static Flyweight getFlyweight(String key) {
		Flyweight flyweight = map.get(key);
		if(flyweight == null) {
			flyweight = new ConcreteFlyweight("ces");
			map.put(key, flyweight);
		}
		return flyweight;
	}
	
	public static int getSize(){
		return map.size();
	}
}
