package com.design.composite;

/**
 * 叶子节点没有子节点  add和remove没有用
 * @author Administrator
 *
 */
public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println("叶子节点" + this.name);
	}

}
