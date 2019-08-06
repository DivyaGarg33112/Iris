package com.examples.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.examples.models.Vehicle;
import com.examples.providers.SessionFactoryProvider;

public class VehicleDaoImpl implements VehicleDao {

	@Override
	public boolean addVehicle(Vehicle VehicleObj) {
		try {
		SessionFactory sf=SessionFactoryProvider.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(VehicleObj);
		tx.commit();
		session.close();
		return true;
		}
		catch(Exception e){
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Vehicle getVehicleById(String id) {
		try {
			SessionFactory sf=SessionFactoryProvider.getSessionFactory();
			Session session=sf.openSession();
			Vehicle VehicleObj=session.get(Vehicle.class,id);
			return VehicleObj;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}

}
