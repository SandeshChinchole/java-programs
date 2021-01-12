import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {

		//String[] animals = {"cat", "dog", "rat", "eagle"};
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("rat");
		animals.add("dog");
		animals.add("eagle");

		
		for(String i : animals) {
			
			System.out.println(i);
		}
		
	}
}
