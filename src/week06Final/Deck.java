/**
 * 
 */
package week06Final;
// Contains our imports for our List, ArrayList and Our shuffle method which involves collections.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * @author Simmons
 *
 */
public class Deck {
	
//The next Class we created called Deck
//Our Field for our Deck class which is card
	private List<Card>Cards = new ArrayList<>();
	
	// we have to break down what type of cards we have in the deck so we may have to make an array for those.
	// created a String variable "typeOfBooks" Which tells us what type of Cards are in our deck. 
	
public Deck () {
	String[] typeOfBooks = { "Spades", "Hearts", "Diamonds", "Clubs"};
	for(String book : typeOfBooks) {
		int value = 2; 
		while(value <= 14) {
			Card.add(new Card(book, value));value++;
			
		}
	
		
	}
	
}

// the describe method is used for the card we have in our deck of cards to give a description of the card we draw from our deck.
public void describe () {
	for (Card card : Cards) {
		card.describe();
	}
}
// The shuffle method we created is used to randomly puts the cards in any order in our list of cards. 

public void shuffle () {
	Collections.shuffle(Cards);
}
// Our draw method that is created removes the top and returns the top of the Cards field as asked. We input 0 which is the 
// initial top card of the deck.
public Card draw () {
	Card pickUpACard = this.Cards.remove(0);
	
	return pickUpACard;
}

}


