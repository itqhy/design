package com.design.state;

/**
 * 定义一个电梯接口
 * 
 * @author Administrator
 *
 */
public abstract class LiftState {

	// 定义一个环境角色，也就是封装状态的变换引起的功能变化
	public Context context;

	public void setContext(Context context) {
		this.context = context;
	}

	// 首先电梯门开启动作
	public abstract void open();

	public abstract void close();

	// 电梯要能上能下，跑起来
	public abstract void run();

	// 电梯还要能停下来，停不下来那就扯淡了
	public abstract void stop();
}
