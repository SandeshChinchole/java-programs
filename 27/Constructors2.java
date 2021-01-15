
public class Constructors2 {

	public static void main(String[] args) {

		Bike bike1 = new Bike("Yamaha", "Fazer", 5000, 2021);
		
		// bike 1
		
		System.out.println(bike1.make);
		System.out.println(bike1.model);
		System.out.println(bike1.year);
		System.out.println(bike1.price);
		
		bike1.start();
		bike1.stop();
		
		// bike 2
		
		Bike bike2 = new Bike("Suzuki", "Hayabhusa", 10000, 2020);
		
		System.out.println(bike2.make);
		System.out.println(bike2.model);
		System.out.println(bike2.year);
		System.out.println(bike2.price);
		
		bike2.start();
		bike2.stop();

	}

}