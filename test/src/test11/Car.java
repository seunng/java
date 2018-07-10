package test11;

public class Car {
	
	private int speed;
	private String name;
	private String company;
	
	void setInfo(int speed, String name, String company) {
	this.speed = speed;
	this.name = name;
	this.company = company;
	
	}

	void println() {
		System.out.println(speed);
		System.out.println(name);
		System.out.println(company);
	}
	
	
	

}
