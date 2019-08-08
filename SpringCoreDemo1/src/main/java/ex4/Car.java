package ex4;

public class Car {
	private String carNumber;
	private String color;
	private Engine engine;
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", color=" + color + ", engine="
				+ engine + "]";
	}
	
	
}
