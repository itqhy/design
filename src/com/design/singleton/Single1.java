package com.design.singleton;

/**
 * 懒汉式  synchronized
 * @author Administrator
 *
 */
public class Single1 {
	
	private static final Single1 instance = null;
	
	private Single1(){
	}
	
	/**
	 * 同步锁 多线程容易出现问题
	 * @return
	 */
	public static synchronized Single1 getInstance(){
		if(instance == null) {
			return new Single1();
		}
		return instance;
	}
}
