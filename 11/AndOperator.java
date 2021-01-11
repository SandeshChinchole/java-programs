public class AndOperator {
	
	public static void main(String[] args) {
		
		int temp = 25;
		
		if(temp>30) {
			System.out.println("It's hot outside");
		}
		else if(temp>=20 && temp<=30) {
			System.out.println("It's warm outside");
		}
		else {
			System.out.println("It's cold outside");
		}
	}
}