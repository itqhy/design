package com.design.observer;

import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observerable {
	// 注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
	private List<Observer> list;
	private String message;

	public WechatServer() {
		list = new ArrayList<Observer>();
	}
	
	@Override
	public void attactObserver(Observer observer) {
		list.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		list.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : list) {
			observer.update(message);
		}
	}

	public void setInfomation(String s) {
		this.message = s;
		System.out.println("微信服务更新消息： " + s);
		// 消息更新，通知所有观察者
		notifyObserver();
	}

}
