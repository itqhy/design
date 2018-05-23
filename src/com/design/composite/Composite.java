package com.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 枝节点
 * 
 * @author Administrator
 *
 */
public class Composite extends Component {

	private List<Component> children = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		children.add(component);
	}

	@Override
	public void remove(Component component) {
		children.remove(component);
	}

	@Override
	public void display() {
		System.out.println("节点名:\t" + name);
		for (Component component : children) {
			component.display();
		}
	}

}
