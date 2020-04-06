
public class CardGame {

	public static void main(String[] args) {
		RandomCard card1= new RandomCard();
		//System.out.println(card1.getSuit());
		//System.out.println(card1.getValue());
		card1.assignCard();
		System.out.println(card1.getSuit());
		System.out.println(card1.getValue());
		
		RandomCard card2= new RandomCard();
		RandomCard card3= new RandomCard();
	
		card2.assignCard();
		card3.assignCard();
		
		
		if(card1.getValue()>card2.getValue()) {
			System.out.println("card1 wins");
			
		}else {
			System.out.println("card2 wins");
			
		}


		
	}	
		
	

}
