import java.util.ArrayList;
import java.util.Scanner;

public class pokerHand {
	
	// Deck cardDeck = new Deck();
	
	// Card[] hand = new Card[5];

	public static void main(String[] args) {
		// Card[] hand = new Card[5];
		Deck cardDeck = new Deck();
		
		int numOfHands = 0;
		Scanner userIn = new Scanner(System.in);
		
		boolean validInput = false;
		
		while (validInput != true) 
		{
			System.out.println("Please enter the number of hands to print: ");
			numOfHands = userIn.nextInt();
			
			if (numOfHands > 10) // would need more than one 52 card deck
				System.out.println("Please enter a number less than 10.");
			else
				validInput = true;
		}
		
		userIn.close();
		
		for (int i=1; i<=numOfHands; i++)
		{
			Hand hand = new Hand();
			for (int j=0; j<5; j++)
			{
				hand.draw(cardDeck.deal());  //deal a card from deck, add to hand
			}
			hand.sortSuit();
			System.out.print(hand);
			System.out.println();
		}
		
		// System.out.println(cardDeck);

	}
	

}
