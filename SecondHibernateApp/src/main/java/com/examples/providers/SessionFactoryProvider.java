package com.examples.providers;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class SessionFactoryProvider {

	private static final SessionFactory sf;
	static {
		Configuration cfg=new Configuration();
		cfg.configure();
		sf=cfg.buildSessionFactory();
		
	}
	public static SessionFactory getSessionFactory(){
		return sf;
	}
}
