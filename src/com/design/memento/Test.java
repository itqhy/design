package com.design.memento;

/**
 * 测试 备忘录模式
 * @author Administrator
 *
 */
public class Test {
	
	public static void main(String[] args) {
		GameRole gameRole = new GameRole();
		//游戏角色初始体力和攻击力
		gameRole.init();
		gameRole.show();
		
		RoleStateMange adminMange = new RoleStateMange();
		adminMange.setMemento(gameRole.saveMemento()); //备忘录保存
		
		gameRole.fightBoss();
		//打完boss后体力及攻击力
		gameRole.show();
		
		gameRole.recove(adminMange.getMemento());
		//回城后恢复完成的体力和攻击力
		gameRole.show();
		
	}
}
