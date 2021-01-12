
public class Array2d {

	public static void main(String[] args) {

		String[][] numbers = {
				
								{"one", "two", "three"},
								{"four", "five", "six"},
								{"seven", "eight", "nine"}
							 };
		
		for(int i=0; i<numbers.length; i++) {
			
			System.out.println();
			
			for(int j=0; j<numbers[i].length; j++) {
				
				System.out.print(numbers[i][j] + " ");
			}
		}
	}

}
