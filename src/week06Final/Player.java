/**
 * 
 */
package week06Final;
import java.util.ArrayList;
import java.util.List;

// import Our List and ArrayList;
/**
 * @author Simmons
 */
//Fields that We had to Create for our Class Player. Which includes: hand (which is a list of card},score (Have to set to 0 in the 
// constructor) and name.
public class Player {
	List<Card>hand = new ArrayList<>();
	private int score;
	private String name;
	
public Player (String name) {
	this.score = 0;
	this.name = name; 
	
}

//Our describe method that we had to create. This method will print out info about the Player and call the describe method
//for each card in the hand List.
public void describe () {
	System.out.println("Player " + this.name);
	for(Card card : hand) {
		System.out.println("     ");
		card.describe();
	}
		
		
	}
	

//Next Method to create is our flip method which removes and returns the top card of the Hand. 
public Card flip () {
	Card topCard = this.hand.remove(0);
	return topCard;
}
// Our draw method that will take Deck as an argument and calls the draw method on the deck. Also it will
// add the return card to the hand field.
public void draw (Deck deck) {
	hand.add(deck.draw());
}

///we made this setter "playerScore" which will return our "score", which is set at 0 already. This setter will play a factore in the
//last method we create for this class. 
public int playerScore() {
	return score;
}
// The last method of this class which is incrementScore which will add 1 to the player score.
public void incrementScore() {
	score = playerScore() + 1;
}

public String getPlayerName() {
	return name;
}

public void nameOfBook(String name) {
	this.name = name;
}
}
