
public class Bike {
	
	String make;
	String model;
	double price;
	int year;
	
	void start() {
		System.out.println(this.model + " has been started");
	}
	
	void stop() {
		System.out.println(this.model + " has been stopped");
	}
	
	Bike(String b1, String b2, double p, int y) {
		
		this.make = b1;
		this.model = b2;
		this.price = p;
		this.year = y;
		
	}

}
