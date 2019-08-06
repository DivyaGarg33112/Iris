package com.examples.dao;

import com.examples.models.Vehicle;


public interface VehicleDao {
	public boolean addVehicle(Vehicle VehicleObj);
	public Vehicle getVehicleById(String id);
}
