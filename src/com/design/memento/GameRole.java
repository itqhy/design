package com.design.memento;

public class GameRole {

	private int vit; // 体力
	private int atk; // 攻击力
	
	public void init(){
		this.atk = 100;
		this.vit = 100;
	}

	public void show() {
		System.out.println("体力：" + vit + "攻击力：" + atk);
	}
	
	
	public void fightBoss() {
		this.atk = 100;
		this.vit = 20;
	}
	
	//保存备忘录
	public RoleStateMemento saveMemento(){
		return new RoleStateMemento(vit, atk);
	}
	
	//从备忘录中恢复数据
	public void recove(RoleStateMemento memento) {
		this.vit = memento.getVit();
		this.atk = memento.getAtk();
	}
	
}
