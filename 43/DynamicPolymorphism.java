import java.util.Scanner;

public class DynamicPolymorphism {

	public static void main(String[] args) {

		DynamicPolymorphismAnimal animal;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What type of animal do you want?");
		System.out.print("Enter (1 for dog) or (2 for cat): ");

		int choice = scanner.nextInt();
		
		if(choice == 1) {
			animal = new DynamicPolymorphismDog();
			animal.speak();
		}
		else if(choice == 2) {
			animal = new DynamicPolymorphismCat();
			animal.speak();
		}
		else {
			animal = new DynamicPolymorphismAnimal();
			
			System.out.println("You entered an invalid choice");
			
			animal.speak();
		}
		
		scanner.close();
		
	}

}
