
public class Polymorphism {

	public static void main(String[] args) {

		PolymorphismCar car = new PolymorphismCar();
		
		PolymorphismBicycle bicycle = new PolymorphismBicycle();
		
		PolymorphismBoat boat = new PolymorphismBoat();
		
		PolymorphismVehicle[] racers = {car, bicycle, boat};
		
		/*
		car.go();
		bicycle.go();
		boat.go();
		*/
		
		for(PolymorphismVehicle x: racers) {
			x.go();
		}

	}

}
