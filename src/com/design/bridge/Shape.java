package com.design.bridge;

/**
 * 形状
 * @author Administrator
 *
 */
public abstract class Shape {
	
	Color color;
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract void draw();
}
