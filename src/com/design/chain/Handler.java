package com.design.chain;

public abstract class Handler {
	
	//下一级责任链
	public Handler handler;
	
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	public abstract void request(int request);

}
