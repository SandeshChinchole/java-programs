import java.util.ArrayList;

public class ArrayList2dExample {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();

		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("pasta");
		bakeryList.add("Garlic bread");
		bakeryList.add("donut");
		
		ArrayList<String> produceList = new ArrayList<String>();
		produceList.add("tomatoes");
		produceList.add("cucumber");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList<String>();
		drinksList.add("soda");
		drinksList.add("coffe");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		// display entire list
		System.out.println(groceryList);
		
		// display first list of entire list
		System.out.println(groceryList.get(0));
		
		// display first item of first list
		System.out.println(groceryList.get(0).get(0));
		
	}

}
