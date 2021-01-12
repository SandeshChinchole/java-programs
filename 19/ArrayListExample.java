import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("burger");
		food.add("ramen");
		
		food.set(0, "taco");
		food.remove(2);
		//food.clear();
		
		for(int i=0; i<food.size(); i++) {
			
			System.out.println(food.get(i));
		}
	}

}
