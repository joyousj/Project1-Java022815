package answers.JoySingharath;
//Card class represents deck of cards
//Add method that deals five card poker hand
import java.util.Random;

public class DeckOfCards {
	
	private Card deck[];//array of Card objects
	private Card hand[];
	private int currentCard;//index  of next Card to be dealt
	private static final int totalCards = 52;//constant # of cards
	private static final Random randomNumbers = new Random();//random number generator
	
	//constructor fills deck of Cards
	public DeckOfCards() {
	
	String[] faces = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades" };
	
	deck = new Card[totalCards];//create array of Card objects
	currentCard = 0;//set currentCard so first Card dealt is deck[0]
	
	//populate deck with Card objects
	for(int count = 0; count < deck.length; count++) {
		deck[count] = new Card(faces[count % 13], suits[count / 13]);
	}

  }
	//create method to deal five card poker hand
	public Card[] oneHand() {
		hand = new Card[5];//first hand to get to get 5 cards
		
		for(int count = 0; count < 5; count++) {
			hand[count] = deck[count];
		}
		return hand;
	}
	public Card[] twoHand() {
		hand = new Card[5];//second hand to get 5 cards
		
		for(int count = 0; count < 5; count++) {
			hand[count] = deck[count];
		}
		return hand;
	}
	//method to get the five card in hand
	public void getFaceAndSuit() {
		hand = new Card[1];
		hand[0] = deck[0];
		System.out.printf("Test: %s XX %s\n", hand[0].getFace(), hand[0].getSuit());
	}
	//shuffle deck of Cards with one pass; for-loop to shuffle Cards
	public void shuffle() {
		//after shuffling, dealing should start at deck[0] again
		currentCard = 0;//reinitializing currentCard
		
		//for each Card, pick another random Card and swap them
		for (int first = 0; first < deck.length; first++) {
			
			//select a random number between 0 and 51
			int second = randomNumbers.nextInt(totalCards);
			
			//swap current Card with randomly selected Card
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	//deal one Card
	public Card dealCard() {
		//determine whether Cards remain to be dealt
		if(currentCard < deck.length)
			return deck[currentCard++];//return current Card in array
		else
			return null;//return null to indicate that all Cards were dealt
	}
	
}
