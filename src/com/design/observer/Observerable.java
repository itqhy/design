package com.design.observer;

/**
 * 抽象被观察者
 * @author Administrator
 *
 */
public interface Observerable {

	void attactObserver(Observer observer);  //关注
	
	void removeObserver(Observer observer); //取关
	
	void notifyObserver(); //通知更新
}
