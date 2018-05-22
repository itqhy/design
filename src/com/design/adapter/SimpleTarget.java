package com.design.adapter;

public class SimpleTarget implements Target {

	@Override
	public void request() {
		System.out.println("非常简单的一个request");
	}

}
