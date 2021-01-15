import java.util.Random;

public class DiceRoller {
	
	Random random;  // declared globally
	int number;		// declared globally

	DiceRoller() {
		
		random = new Random();
		
		roll();
	}
	
	void roll() {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
}
