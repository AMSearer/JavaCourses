import java.util.ArrayList;

public class Hand {
	
	char[] suits = {'h', 'd', 'c', 's'};
	String[] colors = {"black", "red"};
	
	// Card[] hand = new Card[5];
	ArrayList<Card> hand = new ArrayList<Card>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Hand() {
		//ArrayList<Card> hand = new ArrayList<Card>();
	}
	
	public void draw(Card in) {
		hand.add(in);
		
	}
	
	public void sortSuit() {
		int numSorted = 0;  // will go from 0 to 5
		int beginCurrSuit = 0;  // none found
		Card temp = new Card();
		for(char suit: suits) // {'h', 'd', 'c', 's'}
		{
			for(int i=numSorted; i<hand.size(); i++) // starts with first unsorted
			{
				Card currCard = hand.get(i); // first unsorted card
				if (currCard.suit == suit)  // suit we're currently sorting
				{
					if (beginCurrSuit == numSorted) // had none of current color so far
					{
						// System.out.println(" is First of suit");
						beginCurrSuit = numSorted;
						temp = hand.remove(i);  // take out of current pos
						hand.add(numSorted, temp);  // insert 
					}

					else // in suit, not first found
					{
						// System.out.println("Inserted");

						for(int j=beginCurrSuit; j<=numSorted; j++) // check for inserting into current sorted suit
						{
							if(j == numSorted) // didn't find a greater value card in existing suit grouping
							{
								temp = hand.remove(i);  // take out of current pos
								hand.add(numSorted,temp);  // insert behind existing suit grouping
							}
							else if(currCard.value <= hand.get(j).value) // found where to insert
							{
								temp = hand.remove(i);  // take out of current pos
								hand.add(j,temp);  // insert to the left
								j = numSorted +1; // stop checking
							}
							
						}
					}


					numSorted++;
				}

			}

			beginCurrSuit = numSorted;
		}
	}
	public void sortSuitG() {
		int numSorted = 0;  // will go from 0 to 5
		int beginCurrSuit = 0;  // none found
		Card temp = new Card();
		for(char suit: suits) // {"black", "red"}
		{
			for(int i=numSorted; i<hand.size(); i++) // starts with first unsorted
			{
				Card currCard = hand.get(i);
				if (currCard.suit == suit)  // suit we're currently sorting
				{
					temp = hand.remove(i);
					hand.add(beginCurrSuit,temp);
					numSorted++;
				}
			}

			beginCurrSuit = numSorted;
		}
	}
	
	
	public void sortColor() {
		int numSorted = 0;  // will go from 0 to 5
		int beginCurrSuit = 0;  // none found
		Card temp = new Card();
		for(String color: colors) // {'h', 'd', 'c', 's'}
		{
			for(int i=numSorted; i<hand.size(); i++) // starts with first unsorted
			{
				Card currCard = hand.get(i); // first unsorted card
				if (currCard.getColor() == color)  // suit we're currently sorting
				{
					if (beginCurrSuit == numSorted) // had none of current suit so far
					{
						// System.out.println(" is First of suit");
						beginCurrSuit = numSorted;
						temp = hand.remove(i);  // take out of current pos
						hand.add(numSorted, temp);  // insert 
					}

					else // in suit, not first found
					{
						// System.out.println("Inserted");

						for(int j=beginCurrSuit; j<=numSorted; j++) // check for inserting into current sorted suit
						{
							if(j == numSorted) // didn't find a greater value card in existing suit grouping
							{
								temp = hand.remove(i);  // take out of current pos
								hand.add(numSorted,temp);  // insert behind existing suit grouping
							}
							else if(currCard.value < hand.get(j).value) // found where to insert
							{
								temp = hand.remove(i);  // take out of current pos
								hand.add(j,temp);  // insert to the left
								j = numSorted +1; // stop checking
							}
						}
					}


					numSorted++;
				}

			}

			beginCurrSuit = numSorted;
		}
		
	}
	
	public void swap(int posA, int posB) {
		Card temp = hand.get(posA);
		hand.set(posA, hand.get(posB));
		hand.set(posB, temp);		
	}
	
	public String toString() {
		String out = "";    

		for (int i=0; i<hand.size(); i++)
		{
			out += hand.get(i).toString();
			out += "\n";
		}
		
		return out;
	}

}
