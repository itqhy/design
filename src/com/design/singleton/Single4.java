package com.design.singleton;

/**
 * 饿汉式   在类初始化时，已经自行实例化 
 * @author Administrator
 *
 */
public class Single4 {

	private static final Single4 instance = new Single4();
	private Single4(){
		
	}
	
	/**
	 * 静态工厂模式
	 * @return
	 */
	public static Single4 getInstance(){
		return instance;
	}
}
