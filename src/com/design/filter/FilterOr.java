package com.design.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FilterOr implements Filter{

	List<Filter> filters;
	
	public FilterOr(List<Filter> filters) {
		this.filters = filters;
	}
	
	@Override
	public List<Person> filter(List<Person> persons) {
		Set<Person> hashSet = new HashSet<Person>();
		
		for (Filter fi : filters) {
			List<Person> list = fi.filter(persons);
			hashSet.addAll(list);
		}
		
		return new ArrayList<Person>(hashSet);
	}
	
	

}
