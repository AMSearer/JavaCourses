import java.util.*;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to BlackJack!" + "\n");
		
		Deck deck = new Deck();
		
		BlackJackHand dealerHand = new BlackJackHand();
		BlackJackHand playerHand = new BlackJackHand();
		
		int dealerMin = (int) (Math.random()*6 + 16 );
		
		boolean dealerDone = false;
		boolean playerDone = false;
		boolean goodInput = false;
		
		Scanner input = new Scanner(System.in);
		
		// Initial Deals
		playerHand.draw(deck.deal());
		dealerHand.draw(deck.deal());
		playerHand.draw(deck.deal());
		dealerHand.draw(deck.deal());
		
		if (dealerHand.isBlackJack())
			dealerDone = true;
		if (playerHand.isBlackJack())
			playerDone = true;
		
		while (!dealerDone || !playerDone) // stops when dealer and player are done
		{
			if (!playerDone) // player is not done
			{
				goodInput = false;
				
				playerHand.sortColor();
				System.out.println("This is your hand: ");
				System.out.println(playerHand);
				System.out.println("Your current score is: " + playerHand.score() + "\n");
				
				if (playerHand.score() > 21)
				{
					goodInput = true;  // skips input if player has score of 21 or higher
					playerDone = true;  
					System.out.println("Bust!! \n");
				}
					
				while(!goodInput) // ensures valid input from player
				{
					System.out.println("Would you like another card? y/n  ");
					String answer = input.next();
					
					switch (answer)
					{
						case "y": case "yes": case "1": case "Y": case "Yes":
							goodInput = true;
							playerDone = false;
							break;
						case "n": case "no": case "0": case "N": case "No":
							goodInput = true;
							playerDone = true;
							break;
						default:
							goodInput = false;
							System.out.println("Please enter one of: y, n, yes, no ");
							break;
						
					}
				}
				
				if (!playerDone)
					playerHand.draw(deck.deal());
				else
					playerDone = true;
				
			}
			
			if (!dealerDone) // dealer is not done
			{
				if (dealerHand.score() <= dealerMin)
					dealerHand.draw(deck.deal());
				else
					dealerDone = true;
			}
		}
		
		System.out.println("The Dealer's Score was: " + dealerHand.score());
		if (dealerHand.isBlackJack())
			System.out.println("The Dealer had BlackJack! \n");
		System.out.println("Your score was: " + playerHand.score());
		if (playerHand.isBlackJack())
		{
			playerHand.sortColor();
			System.out.println("\nThis is your hand: ");
			System.out.println(playerHand);
			System.out.println("You have BlackJack! \n");
		}

	}

}
