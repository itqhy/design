package com.design.adapter;

public class Adapter implements Target{
	
	// 直接组合被适配类，即持有一个被适配类的实例    
	private Adaptee adaptee;
	
	 // 可以通过构造函数传入具体需要适配的对象实例 
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	

	@Override
	public void request() {
		// 这里是使用委托的方式完成特殊功能  
	    //虽然表面看起来执行的是标准接口中的request方法，实际执行的却是被适配类中的方法 
		adaptee.specificRequest();
	}

}
