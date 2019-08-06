package com.examples.dao;

import com.examples.models.User;


public interface UserDao {
	public boolean addUser(User userObj);
	public User getUserById(int id);
}
