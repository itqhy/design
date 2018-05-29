package com.design.iterator;

public class Test {
	public static void main(String[] args) {
		ConcreteMyAggregate<String> cma = new ConcreteMyAggregate<String>();
		cma.add("111");
		cma.add("222");
		cma.add("333");
		cma.add("444");

		MyIterator iterator = cma.createInterator();
		cma.remove("111");// 如果删除一个元素的话，迭代的时候也同样会被删除
		while (iterator.hasNext()) {
			System.out.println(iterator.getCurrentObj());// 获取当前对象
			iterator.next();// 将游标向下移
		}
	}
}
