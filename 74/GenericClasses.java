
public class GenericClasses {

	public static void main(String[] args) {

		// Displaying values without generic class
		
		/*
		
		MyIntegerClass myInt = new MyIntegerClass(1);
		MyDoubleClass myDouble = new MyDoubleClass(3.14);
		MyCharacterClass myChar = new MyCharacterClass('H');
		MyStringClass myString = new MyStringClass("Hello");
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
		
		*/
		
		// Displaying values using generic class (single parameter)
		
		/*
		
		MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
		MyGenericClass<Double> myDouble = new MyGenericClass<>(3.14);
		MyGenericClass<Character> myChar = new MyGenericClass<>('H');
		MyGenericClass<String> myString = new MyGenericClass<>("Hello");

		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
		
		*/
		
		// Displaying values using generic class (multiple parameters)
		
		MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 2);
		MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(1.1, 2.2);
		MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@', '$');
		MyGenericClass<String, Character> myString = new MyGenericClass<>("Hello", '#');

		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());

	}

}
