package week06Final;
import java.util.Scanner;



/// created a class called AppMain with a main method
//we have to instantiate a Deck and two players, call for the shuffle method on the deck
 
public class AppMain {

	public static void main(String[] args) {
		Scanner cI = new Scanner (System.in);
		Deck deck = new Deck();
		System.out.println("Welcome to War Player1: Cedrick ");
		Player playerOneWar = new Player (cI.nextLine());
		System.out.println("Welcome to War Player2: Rosie ");
		Player playerTwoWar = new Player (cI.nextLine());
		System.out.println("***##**##***");
	/// Which shuffle method the deck of course
		deck.shuffle();
/// For a traditional for loop, iterate 52 times calling the draw method on the other player each iteration using the Deck you instantiated. Since its just 2 players
/// we want the cards to be dealt evenly so each player will draw 26.
		for (int i = 1; i <= 26; i++) {
			playerOneWar.draw(deck);
			playerTwoWar.draw(deck);
		
			
}
	
		/// Every Round will Print "WAR ** Round: " including the number of the round.
				for (int i = 1; i <= 26; i++) {
					System.out.println("WAR ** Round: " + i);
					Card cardOneWar = playerOneWar.flip();
					System.out.println(playerOneWar.getPlayerName() + " : ");
					cardOneWar.describe();
					Card cardTwoWar = playerTwoWar.flip();
					System.out.println(playerTwoWar.getPlayerName() + " : ");
					cardTwoWar.describe();
					
					if (cardOneWar.valueOfCard() > cardTwoWar.valueOfCard()) {
						playerOneWar.incrementScore();
						System.out.println(" *!! " + playerOneWar.getPlayerName() + " Wins Round Of WAR " + i );
					} else if (cardOneWar.valueOfCard() < cardTwoWar.valueOfCard()) {
						playerTwoWar.incrementScore();
						System.out.println(" *!! " + playerTwoWar.getPlayerName() + " Wins Round of War " + i);
					} 
					System.out.println(" *** KING OF WAR ***");
					
	}
	/// These are the outcomes of the game if playerOneWar wins, playerTwoWar wins, or if the game is a draw the results shall
	// print out these responses. 
				System.out.println("King Of War:" + "\n" + playerOneWar.getPlayerName() + "--" + playerOneWar.playerScore() + "\n" + 
	playerTwoWar.getPlayerName() + "--" + playerTwoWar.playerScore());
				if(playerOneWar.playerScore() > playerTwoWar.playerScore()) {
					System.out.println(" Your KING OF WAR Is :" + playerOneWar.getPlayerName() + "MAY YOU REIGN FOREVER ");}
				else if (playerOneWar.playerScore() < playerTwoWar.playerScore()) {
					System.out.println(" Your KING OF WAR Is : " + playerTwoWar.getPlayerName() + "MAY YOU REIGN FOREVER ");
					} else {
						System.out.println(" May The WAR CONTINUE ");
				}
				cI.close();
				}
}