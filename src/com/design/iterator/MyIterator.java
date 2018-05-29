package com.design.iterator;

/**
 * 自定义迭代器接口
 * @author Administrator
 *
 */
public interface MyIterator {
	
	void first(); //将游标指向第一个元素
	void next(); //将游标指向下一个元素
	
	boolean hasNext(); //判断是否有下一个元素
	boolean isFirst(); 
	boolean isLast();
	Object getCurrentObj();
	
}
