package com.design.singleton;
/**
 * 懒汉式 ：  双重检查锁定
 * @author Administrator
 *
 */
public class Single2 {
	private static Single2 instance = null;
	
	private Single2(){}
	
	public static synchronized Single2 getInstance(){
		if(instance == null) {
			synchronized (Single2.class) {
				if(instance == null) {
					return new Single2();
				}
			}
		}
		return instance;
	}
}
