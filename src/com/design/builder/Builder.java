package com.design.builder;

/**
 * 建造者模式
 * @author Administrator
 *
 */
public interface Builder {
	
	void buildHead();
	
	void buildBody();
	
	void buildFoot();
	
	Person buildPerson(); //组装完成Person
}
