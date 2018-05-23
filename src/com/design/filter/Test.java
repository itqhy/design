package com.design.filter;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		// 初始化数据
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("霍一", "FEMALE", "MARRIED"));
		persons.add(new Person("邓二", "MALE", "MARRIED"));
		persons.add(new Person("张三", "MALE", "SINGLE"));
		persons.add(new Person("李四", "FEMALE", "MARRIED"));
		persons.add(new Person("王五", "MALE", "SINGLE"));
		persons.add(new Person("赵六", "FEMALE", "SINGLE"));
		persons.add(new Person("孙七", "MALE", "SINGLE"));
		persons.add(new Person("罗八", "MALE", "MARRIED"));
		persons.add(new Person("刘九", "FEMALE", "SINGLE"));
		persons.add(new Person("史十", "FEMALE", "SINGLE"));

		// 打印出所有男性的信息
		System.out.println("---------------------所有男性---------------------");
		List<Person> maleList = new MaleFilter().filter(persons);
		printList(maleList);
		// 打印出所有单身的信息
		System.out.println("---------------------所有单身---------------------");
		List<Person> singleList = new SingleFilter().filter(persons);
		printList(singleList);
		// 打印出所有已婚女性的信息
		System.out.println("--------------------所有已婚女性-------------------");
		List<Filter> filters = new ArrayList<Filter>();
		filters.add(new MarriedFilter()); 
		filters.add(new FemaleFilter());
		List<Person> marriedFemaleList = new FilterAdd(filters).filter(persons);
		printList(marriedFemaleList);
		// 打印出所有单身或女性的信息
		System.out.println("-------------------所有单身或女性------------------");
		
		List<Filter> filterOrs = new ArrayList<Filter>();
		filterOrs.add(new SingleFilter()); 
		filterOrs.add(new FemaleFilter());
		List<Person> singleOrFemaleList = new FilterOr(filterOrs).filter(persons);
		printList(singleOrFemaleList);

	}

	// 打印列表中的数据信息
	private static void printList(List<Person> list) {
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}
}
