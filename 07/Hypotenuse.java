
/* Finding the hypotenuse of a triangle
 * 
 * Formula is: sqrt(a*a + b*b)
 */

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {

		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter value for side x");
		x = scanner.nextDouble();
		
		System.out.println("Enter value for side y");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x) + (y*y));
		
		System.out.println("The value of hypotenuse is : " + z);
		
		scanner.close();
	}

}
