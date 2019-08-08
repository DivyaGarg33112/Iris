package com.examples.SpringCoreDemo1;

public class Laptop {
	
	private String brand;
	private int ram;
	private double cost;
	
	public Laptop(String brand, int ram, double cost) {
		System.out.println("I m  parameterised constructor");
		this.brand = brand;
		this.ram = ram;
		this.cost = cost;
	}
	
	public Laptop(){
		System.out.println("I m no-arg constructor");
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void printLaptopDetails(){
		System.out.println("\n====Laptop Details ====");
		System.out.println("Brand : "+brand);
		System.out.println("Ram : "+ram+" GB");
		System.out.println("Cost : "+cost);
	}
	
	
	
}
