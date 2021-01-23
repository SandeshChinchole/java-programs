
public class CopyObjects {

	public static void main(String[] args) {
		
		// using copy method

		/*
		 * 
		CopyObjectsCar car1 = new CopyObjectsCar("Ford", "Mustang", 2021);
		CopyObjectsCar car2 = new CopyObjectsCar("Audi", "R8", 2022);
		
		car2.copy(car1);
		
		*/
		
		// using copy constructor
		
		CopyObjectsCar car1 = new CopyObjectsCar("Ford", "Mustang", 2021);
		
		CopyObjectsCar car2 = new CopyObjectsCar(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		
		System.out.println();
		
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		
		System.out.println();
		
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());

	}

}
