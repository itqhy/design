package com.design.filter;

import java.util.List;

/**
 * 
 * @author Administrator
 *
 */
public class FilterAdd implements Filter{

	List<Filter> filters;
	
	public FilterAdd(List<Filter> filters) {
		this.filters = filters;
	}
	
	
	@Override
	public List<Person> filter(List<Person> persons) {
		for(Filter fi : filters) {
			persons = fi.filter(persons);
		}
		return persons;
	}

}
