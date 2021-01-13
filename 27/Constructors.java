
public class Constructors {

	public static void main(String[] args) {

		Human human1 = new Human("Rick", 65, 70);
		Human human2 = new Human("Morty", 16, 50);
		
		System.out.println(human1.name);
		System.out.println(human1.age);
		System.out.println(human1.weight);
		
		System.out.println(human2.name);
		System.out.println(human2.age);
		System.out.println(human2.weight);
		
		human1.eat();
		human2.drink();
	}

}
