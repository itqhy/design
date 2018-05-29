package com.design.proxy.dong;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AdminProxy {
	
	private Object target;

	public AdminProxy(Object target) {
		this.target = target;
	}
	
	
	/**
	 * 给目标对象生成代理对象
	 * @return
	 */
	public Object getProxyInstance(){
		Object result = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				System.out.println("kaishi");
				//执行目标对象的方法
				Object returnValue = method.invoke(target, args);
				System.out.println("end");
				return returnValue;
			}
		});
		return result;
	}
	
	
	
	
}
