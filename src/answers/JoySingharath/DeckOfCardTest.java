package answers.JoySingharath;
//Card shuffling and dealing 

public class DeckOfCardTest {

	public static void main(String[] args) {
		DeckOfCards myDeckOfCards = new DeckOfCards();
		/*myDeckOfCards.shuffle();//place Cards in random order
		
		//print all 52 Cards in the order in which they're dealt
		for(int i = 1; i <= 52; i++) {
			
			//deal and display a Card
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			
			//output newline every 4 cards
			if(i % 4 == 0)
				System.out.println();
		}*/
		//test five card poker hand
		Card[] poker;
		poker = myDeckOfCards.oneHand();
		for(Card card : poker) {
			System.out.printf("%s\n", card);
		}
		myDeckOfCards.getFaceAndSuit();
	}

}
