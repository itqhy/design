package com.design.chain;

public class ConcreteHandler1 extends Handler {
	
	

	@Override
	public void request(int request) {
		if(request > 10) {
			this.handler.request(request);
			return;
		}
		System.out.println("处理了request小于等于10的请求");
	}

}
