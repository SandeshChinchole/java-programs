
public class StaticKeyword {

	public static void main(String[] args) {

		Friend friend1 = new Friend("Sam");
		Friend friend2 = new Friend("Harry");
		Friend friend3 = new Friend("Hermoine");
		Friend friend4 = new Friend("Ron");
				
		//System.out.println(Friend.numberOfFriends);
		
		//System.out.println(friend1.numberOfFriends);

		Friend.displayFriends();
	}

}
