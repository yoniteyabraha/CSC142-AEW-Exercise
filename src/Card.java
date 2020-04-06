
public class Card {
	
	private String suit;
	private int value;
	
	public Card(String suit,int value) {
		//if card value is out of range ,set to default value
		
		if(value < 2 || value >14) {
			this.value=2;
		}else   //value is within range and set the instance field equal to the argument value
			{this.value=value;
		}
		//this.value=value;
		
		if (suit== "H" || suit=="C") {
			this.suit="H";
		}else {
			this.suit=suit;
		}
		//this.suit=suit;
	}
	
	public String getSuit() {
		return suit;
	}
	public int getValue() {
		return value;
	}
	
}
