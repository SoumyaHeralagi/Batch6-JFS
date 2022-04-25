package com.cg.demo;

import java.util.List;

public class Group {
	
	private String groupName;
	private List<Person> persons;
	
	Group(String groupName, List<Person> persons)
	{
		this.groupName = groupName;
		this.persons = persons;

	}
}
