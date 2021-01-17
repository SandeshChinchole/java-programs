
public class ObjectPassing {

	public static void main(String[] args) {
		
		Garage garage = new Garage();

		Sedan car1 = new Sedan("BMW");
		Sedan car2 = new Sedan("Tesla");
		
		garage.park(car1);
		garage.park(car2);

		
	}

}
