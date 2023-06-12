package week06Final;

public class Card {
//The Classic Card game WAR. 
// Our class we created known as Card.
//fields which we have created value, name, and book(Which is a terminology for suit playing cards).
	private int value;
	private String name;
	private String book;
	
	
	// in our Card constructor as you can see we have book and Value we had to pass those arguments through. Also defined
	//this.book and this. value below as well setting this.book = book and this.value = value. 
	public Card(String book, int value) {
		kindOfBooks(book, value);
		this.book = book;
		this.value = value;
	} 
	// I used getBookName() to define name in our field of work as well.
	public String getBookName() {
		return name;
	}
	// This is contains our value of 2-14 representing the cards.
	public void kindOfBooks(String book, int value) {
		switch (value) {
		case 2: 
			this.book = "Two of " + book;
			break;
		case 3:
			this.book = "Three of" + book;
			break;
		case 4:
			this.book = "Four of " + book;
			break;
		case 5:
			this.book = "Five of " + book;
			break;
		case 6:
			this.book = "Six of " + book;
			break;
		case 7:
			this.book = "Seven of " + book;
			break;
		case 8:
			this.book = "Eight of " + book;
			break;
		case 9:
			this.book = "Nine of " + book;
			break;
		case 10:
			this.book = "Ten of " + book;
			break;
		case 11:
			this.book = "Jack of " + book; 
			break;
		case 12:
			this.book = "Queen of " + book;
			break;
		case 13:
			this.book = "King of " + book;
			break;
		case 14:
			this.book = "Ace of " + book;
			break;
	}
		
	}
	public String book() {
		return book;
	}
	public void kindOfBooks(String book) {
		this.book = book;
	}
	public int valueOfCard() {
		return value; 
	}
	public void setValueOfCard(int value) {
		this.value = value;
	}
// This is our describe method which is requested upon us to use during our project. This method will be used to print out the information
	//about a card that is in play.
  public void describe () {
	  System.out.println(name + value);
  }
public static void add(Card card) {
	// TODO Auto-generated method stub
	
}

}
