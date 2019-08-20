package com.springs.config;

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
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Component
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages= {"com.springs"})
public class DBConfig {

	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	
	@Bean(name="dataSource")
	public DataSource getDataSource()   //java.sql
	{
	
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("hr");
		dataSource.setPassword("hr");
		return dataSource;
	}
	
	@Bean(name="sessionFactory")  //java.util
	public SessionFactory getSessionFactory()
	{
		
		Properties p=new Properties();
		p.setProperty("hibernate.dialect","org.hibernate.dialect.OracleDialect");
		p.setProperty("hibernate.hbm2ddl.auto","update");
		p.setProperty("hibernate.show_sql", "true");
		
		LocalSessionFactoryBuilder sb=
				new LocalSessionFactoryBuilder(getDataSource());
		sb.addProperties(p);
		sb.scanPackages("com.springs.models");
		
		
		return sb.buildSessionFactory();		
	}

	@Bean(name="HibernateTranscation")
	@Autowired
	public HibernateTransactionManager getHibernateTranscationManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager txManager=
				new HibernateTransactionManager(sessionFactory);
		return txManager;
	}	
	

}
