package com.design.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 男性过滤器
 * 
 * @author Administrator
 *
 */
public class MaleFilter implements Filter {

	@Override
	public List<Person> filter(List<Person> persons) {
		List<Person> result = new ArrayList<>();
		for (Person person : persons) {
			if ("MALE".equalsIgnoreCase(person.getGender())) {
				result.add(person);
			}
		}
		return result;
	}

}
