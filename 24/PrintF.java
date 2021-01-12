
public class PrintF {

	public static void main(String[] args) {
		
		//printf() =		% [flags] [precision] [width] [conversion-character]
		
		boolean myBoolean = true;
		char myChar = '@';
		int myInt = 123;
		double myDouble = 1000;
		String myString = "Neo";
		
		//System.out.printf("%d This is a format string", 123);
		
		// [conversion-character]
		
		//System.out.printf("%b", myBoolean);
		//System.out.printf("%c", myChar);
		//System.out.printf("%d", myInt);
		//System.out.printf("%f", myDouble);
		//System.out.printf("%s", myString);

		// [width]
		//System.out.printf("Hello %10s", myString);
		
		// [precision]
		//System.out.printf("You have this amount of money %.2f", myDouble);
		
		// [flags]
		//System.out.printf("You have this amount of money %-10f", myDouble);
		//System.out.printf("You have this amount of money %+f", myDouble);
		//System.out.printf("You have this amount of money %020f", myDouble);
		System.out.printf("You have this amount of money %,f", myDouble);
		
	}

}
