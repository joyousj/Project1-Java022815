package answers.JoySingharath;

public class Hand {
	
	Card[] cards;
	
	public Hand() {
		cards = new Card[5];
	}
	public void setCard(int i, Card c) {
		cards[i] = c;
	}
	public String toString() {
		String str = "";
		
		for(int i = 0; i < cards.length; i++) {
			System.out.println((i + 1) + " of" + cards[i]);
			if(cards[i].isDiscarded() == true)
				str += "Discarded";
				str += "\n";
		}
		return str;
	}
	public boolean onePair() {
		String[] values = new String[5];
		int counter = 0;
		
		//Put each cards numeric value into array
		for(int i = 0; i < cards.length; i++) {
			values[i] = cards[i].getRank().toString(); 
		}
		//Loop through the values; Compare each values to all values 
		//If two mathces are made, return true
		for (int row = 0; row < values.length; row++) {
			for(int col = 0; col < cards.length; col++) {
				if(values[row].equals(cards[col].getRank().toString()));
					counter++;
					
					if(counter == 2);
						return true;
			}
			counter = 0;
		}
		return false;
	}
	public boolean twoPair() {
		String[] values = new String[5];
		int counter  = 0;
		int sum = 0;
		
		for(int i = 0; i < cards.legnth; i++) {
			values[i] = cards[i].getRank().toString();
		}
	}
	
	
}
