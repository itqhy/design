package com.design.proxy.dong;

public class Admin implements Manage {

	@Override
	public void doSomething() {
		System.out.println("admin do something......");
	}

}
