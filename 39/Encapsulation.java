
public class Encapsulation {

	public static void main(String[] args) {

		EncapsulationCar car = new EncapsulationCar("chevloret", "camero", 2021);
		
		// Before defining setters
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
		// After defining setters

		car.setMake("Audi");
		car.setModel("R8");
		car.setYear(2022);
		
		System.out.println();

		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
	}

}
