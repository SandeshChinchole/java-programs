
public class Inheritance {

	public static void main(String[] args) {

		InheritanceCar car = new InheritanceCar();
		
		InheritanceBicycle bike = new InheritanceBicycle();
		
		System.out.println(car.speed);
		
		car.go();
		//car.stop();
		
		//System.out.println(car.wheels);
		//System.out.println(car.doors);
		
		System.out.println(bike.speed);
		
		//bike.go();
		bike.stop();
		
		//System.out.println(bike.wheels);
		//System.out.println(bike.pedals);

		
		
		
	}

}
