package com.design.chain;

public class ConcreteHandler2 extends Handler {

	@Override
	public void request(int request) {
		if(request <= 10) {
			this.handler.request(request);
			return;
		}
		System.out.println("处理request请求大于10的请求");
	}

}
