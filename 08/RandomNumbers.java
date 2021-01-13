import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {

		Random random = new Random();
		
		int x = random.nextInt();
		
		int y = random.nextInt(6)+1;
		
		double z = random.nextDouble();
		
		boolean v = random.nextBoolean();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(v);
	}

}
