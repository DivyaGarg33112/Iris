package ex4;

public class Engine {
	private int cc;
	private String make;
	
	public Engine(int cc, String make) {
		super();
		this.cc = cc;
		this.make = make;
	}

	@Override
	public String toString() {
		return "Engine [cc=" + cc + ", make=" + make + "]";
	}
	
	
}
