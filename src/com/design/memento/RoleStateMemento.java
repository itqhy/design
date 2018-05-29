package com.design.memento;

/**
 * 备忘录
 * @author Administrator
 *
 */
public class RoleStateMemento {

	private int vit;
	private int atk;
	
	public RoleStateMemento(int vit, int atk) {
		super();
		this.vit = vit;
		this.atk = atk;
	}
	
	public int getVit() {
		return vit;
	}
	public void setVit(int vit) {
		this.vit = vit;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	
}
