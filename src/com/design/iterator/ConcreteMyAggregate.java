package com.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义集合
 * 
 * @author Administrator
 * @param <T>
 *
 */
public class ConcreteMyAggregate<T> {
	private List<T> list = new ArrayList<>();

	public void add(T obj) {
		list.add(obj);
	}

	public void remove(T obj) {
		list.remove(obj);
	}

	public MyIterator createInterator() {
		return new ConcreteIterator();
	}

	class ConcreteIterator implements MyIterator {
		private int cursor;// 定义一个迭代器游标

		@Override
		public void first() {
			cursor = 0;
		}

		@Override
		public void next() {
			if (cursor < list.size()) {
				cursor++;
			}
		}

		@Override
		public boolean hasNext() {
			// 如果游标<list的大小，则说明还有下一个
			if (cursor < list.size()) {
				return true;
			}
			return false;
		}

		@Override
		public boolean isFirst() {
			return cursor == 0 ? true : false;
		}

		@Override
		public boolean isLast() {
			return cursor == list.size() ? true : false;
		}

		@Override
		public Object getCurrentObj() {
			return list.get(cursor);
		}

	}
}
