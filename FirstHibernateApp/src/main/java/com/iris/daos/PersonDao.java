package com.iris.daos;

import java.util.List;

import com.iris.models.Person;

public interface PersonDao {
	public boolean addPerson(Person p);
	public boolean deletePerson(int personId);
	public boolean updatePerson(Person p);
	public Person getPerson(int pId);
	public List<Person> getAllPersons();
	
	
}
