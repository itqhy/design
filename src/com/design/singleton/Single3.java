package com.design.singleton;

/**
 * 静态内部类实现单例模式
 * 
 * @author Administrator
 *
 */
public class Single3 {

	private Single3() {
	}

	public static Single3 getInstance() {
		return LayzHolder.instance;
	}

	static class LayzHolder {
		private static Single3 instance = new Single3();
	}
}
