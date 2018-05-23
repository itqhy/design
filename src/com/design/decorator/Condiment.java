package com.design.decorator;

/**
 * 公共接口，所有汉堡和配料都必须实现该接口。
 * @author Administrator
 *
 */
public interface Condiment {

	String getName();
	double getPrice();
}
