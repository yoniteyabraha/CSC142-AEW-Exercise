
public class CardClient {

	public static void main(String[] args) {
		Card jackOfHearts=new Card ("H",11);
		Card hundredsOfClubs=new Card ("G",100);
		Card cv=new Card("B",12);
		System.out.println(hundredsOfClubs.getValue());
		System.out.println(jackOfHearts.getSuit());
		System.out.println(hundredsOfClubs.getSuit());
		
		System.out.println(cv.getSuit());
		
		

	}

}
