package com.design.proxy.dong;

public class Test {
	
	public static void main(String[] args) {
		Manage admin = (Manage) new AdminProxy(new Admin()).getProxyInstance();
		admin.doSomething();
	}
}
