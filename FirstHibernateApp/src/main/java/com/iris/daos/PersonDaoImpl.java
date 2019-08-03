package com.iris.daos;

import java.util.List;

import org.hibernate.Transaction;

import org.hibernate.Session;

import com.iris.models.Person;
import com.iris.providers.SessionFactoryProvider;

public class PersonDaoImpl implements PersonDao {

	@Override
	public boolean addPerson(Person p) {
		Session session=SessionFactoryProvider.getSF().openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(p);
		tx.commit();
		session.close();
		
		return true;
	}

	@Override
	public boolean deletePerson(int personId) {
		Session session=SessionFactoryProvider.getSF().openSession();
		Transaction tx=session.beginTransaction();
		
		Person p=session.get(Person.class, personId);
		if(p==null){
			return false;
		}
		session.delete(p);
		
		tx.commit();
		session.close();
		
		return true;
	}

	@Override
	public boolean updatePerson(Person p) {
		Session session=SessionFactoryProvider.getSF().openSession();
		Transaction tx=session.beginTransaction();
		
		session.update(p);
		tx.commit();
		session.close();
		
		
		return true;
	}

	@Override
	public Person getPerson(int pId) {
		Session session=SessionFactoryProvider.getSF().openSession();
		Person p=session.get(Person.class,pId);
		session.close();
		
		return p;
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

}
