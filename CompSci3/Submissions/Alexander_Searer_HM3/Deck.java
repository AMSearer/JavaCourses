import java.util.*;


public class Deck {
	
	static Card[] deck = new Card[52];
	
	char[] suits = {'h', 'd', 'c', 's'};
	
	static int currentCard = 0;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Deck() {
		
		shuffle();
		
		currentCard = 0;

//		System.out.println(deck.length);
		for (int i = 0; i < deck.length; i++)
		{
			//System.out.println(deck[i]);
		}
		
	}
	
	public Card deal() {
		if (currentCard == 52) // one more than existed
			return new Card();
		Card out = deck[currentCard];
		currentCard ++;
		return out;
	}
	
	public void shuffle() {
		
		ArrayList<Integer> testList = new ArrayList<Integer>();
		
		for (int i=0; i<=51; i++)
			testList.add(i);
		
		for (char suit: suits) 
		{
			for (int value = 1; value <= 13; value ++) 
			{
				int options = testList.size(); // size will be one greater than max index
				int rand = (int) ( Math.random() * options);
				int place = (int) testList.remove(rand);
				boolean hasFace = false;
				if (value > 10)
					hasFace = true;
				Card toAdd = new Card(suit, value, hasFace);
				deck[place] = toAdd;
			}
		}
		
	}
	
	public String toString() {
		String out = "";
		
		for (int i = 0; i <deck.length ; i++) // change back to deck.length
		{
			out += deck[i].toString();
			out += "\n";
		}
		
		return out;
	}

}
