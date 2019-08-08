package tableperclass;

import javax.persistence.Entity;

@Entity
public class ContractualEmployee extends Employee{
	
	private double ratePerDay;
	private int noOfDays;
	
	public double getRatePerDay() {
		return ratePerDay;
	}
	public void setRatePerDay(double ratePerDay) {
		this.ratePerDay = ratePerDay;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	
}
