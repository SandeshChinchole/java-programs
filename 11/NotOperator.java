import java.util.Scanner;

public class NotOperator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing the game! Press q or Q to quit");
		String response = scanner.next();
		
		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("You are still playing the game");
		}
		else {
			System.out.println("You have quit the game");
		}
		
		scanner.close();
	}
}
