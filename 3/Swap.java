public class Swap {
	public static void main(String[] args) {
		String x = "water";
		String y = "ice";
		String temp;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}
}