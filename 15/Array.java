
public class Array {

	public static void main(String[] args) {

		String[] cars = {"camero", "corvette", "BMW"};
		
		cars[0] = "Audi";
		
		System.out.println(cars[2]);
		
		// another way of creating an array
		
		String[] countries = new String[3];
		
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		
		for(int i=0; i<countries.length; i++) {
			
			System.out.println(countries[i]);
		}
	}

}
