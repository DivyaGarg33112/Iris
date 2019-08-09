package com.examples.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement 
@ComponentScan(basePackages={"com.examples"})
public class DBConfig {  
	
	DriverManagerDataSource dataSource= new DriverManagerDataSource();
	
	@Bean(name="dataSource")
	public DataSource getDataSource() {
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("hr");
		dataSource.setPassword("hr");
		return dataSource;
	}

	@Bean(name="sessionFactory")  
	public SessionFactory getSessionFactory(){
		System.out.println("About to create  Sessionfactory");
		//will hold hibernate configuration
	
		Properties p=new Properties(); 
		p.setProperty("hibernate.dialect","org.hibernate.dialect.OracleDialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		p.setProperty("hibernate.show_sql","true");
		
		LocalSessionFactoryBuilder sb=new LocalSessionFactoryBuilder(getDataSource());
		sb.addProperties(p);
		sb.scanPackages("com.examples.models");
		System.out.println("Session Factory Created");
		return sb.buildSessionFactory();
	}  
		 
	@Bean(name="hibernateTransection")
	@Autowired
	public HibernateTransactionManager getHibernateTransectionManager
	(SessionFactory sessionFactory) {
		System.out.println("About to create HibernateTransactionManager");
		HibernateTransactionManager txManager=new HibernateTransactionManager(sessionFactory);
		System.out.println("Hibernate Transaction created");
		return txManager;
	}
	
	
}
