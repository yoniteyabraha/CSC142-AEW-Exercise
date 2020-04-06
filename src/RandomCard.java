import java.util.Random;

public class RandomCard {
	
	private int value;
	private String suit;
	
	public void assignCard() {
		Random rand = new Random();
		int suitValue=rand.nextInt(4);
		
		if (suitValue==0) {
			suit="Spades";
		}else  if(suitValue==1){
			suit="Hearts";
		}else if (suitValue==2){
			suit="Diamonds";
		}else {
			suit="Clubs";
		}
		value=rand.nextInt(13) +2;
	} 
	
	public String getSuit() {
		return suit;
	}
	
	public int getValue() {
		return value;
	}

}
