package com.design.filter;

import java.util.ArrayList;
import java.util.List;
/***
 * 已婚过滤器
 * @author Administrator
 *
 */
public class MarriedFilter implements Filter {

	@Override
	public List<Person> filter(List<Person> persons) {
		List<Person> result = new ArrayList<Person>();
		for (Person person : persons) {
			if(!"SINGLE".equalsIgnoreCase(person.getMarital())) {
				result.add(person);
			}
		}
		return result;
	}

}
