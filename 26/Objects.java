
public class Objects {

	public static void main(String[] args) {

		Car myCar1 = new Car();
		Car myCar2 = new Car();
		
		// myCar1
		
		System.out.println(myCar1.make);
		System.out.println(myCar1.model);
		System.out.println(myCar1.color);
		System.out.println(myCar1.price);
		System.out.println(myCar1.year);

		myCar1.drive();
		myCar1.brake();
		
		System.out.println();
		
		// myCar2
		
		System.out.println(myCar2.make);
		System.out.println(myCar2.model);
		System.out.println(myCar2.color);
		System.out.println(myCar2.price);
		System.out.println(myCar2.year);
		
		myCar2.drive();
		myCar2.brake();

	}

	
}
