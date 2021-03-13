
public class GenericMethods {

	public static void main(String[] args) {

		Integer[] intArray = {1, 2, 3, 4};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
		Character[] charArray = {'B', 'Y', 'E'};
		String[] stringArray = {"H", "E", "L", "L", "O"};
		
		//displayArray(intArray);
		//displayArray(doubleArray);
		//displayArray(charArray);
		//displayArray(stringArray);
		
		System.out.println(getFirst(intArray));
		System.out.println(getFirst(doubleArray));
		System.out.println(getFirst(charArray));
		System.out.println(getFirst(stringArray));
		
	}
	
	// Normal way to display array
	
	/*
	
	public static void displayArray(Integer[] array) {
		for(Integer x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public static void displayArray(Character[] array) {
		for(Character x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public static void displayArray(Double[] array) {
		for(Double x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public static void displayArray(String[] array) {
		for(String x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	*/
	
	// Generic way to display array without returning anything
	
	public static <T> void displayArray(T[] array) {
		for(T x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	// returning first element of the array using generic methods
	
	public static <T> T getFirst(T[] array) {
		return array[0];
	}
}
