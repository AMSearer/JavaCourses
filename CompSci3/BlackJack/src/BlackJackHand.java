
public class BlackJackHand extends Hand{
	
	//int score = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public BlackJackHand() {
		
	}
	
	public int score() {
		int score = 0;
		int numOfAces = 0;
		for(Card card:hand)
		{
			if (card.value >= 10)
				score += 10;
			else if (card.value == 1)  // count Ace as 1 to start
			{
				score += 1;
				numOfAces++;
			}
			else
				score += card.value;
		}
		
		if (score <= 11 && numOfAces != 0)
			score += 10;  // add 10 for one Ace if it won't put the score over 21
		
		return score;
	}
		
	public boolean isBlackJack() {
		
		if (this.hand.size() != 2)  // more than two cards
			return false;
		else if (hand.get(0).value == 1 && hand.get(1).value >= 10)  // first card Ace
			return true;
		else if (hand.get(0).value >= 10 && hand.get(1).value == 1)  // second card Ace
			return true;
		else
			return false;
	}

}
