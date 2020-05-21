import java.util.ArrayList;

public class PlayGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ten = '0';
		
		boolean test = ('9' < ')');
		
//		System.out.println(test);
		
		Card testC = new Card();
//		System.out.println(testC.suit);
		
		ArrayList<Integer> testList = new ArrayList<Integer>();
//		System.out.println(testList.size());
		
		for (int i=0; i<=51; i++)
			testList.add(i);
		
//		System.out.println(testList.size());
//		System.out.println(testList);
//		testList.remove(1);
//		System.out.println(testList);
				
		System.out.println((Math.random() * 52 - 1 + 1) % 52);
		
		for (int i=0; i<=30; i++) {
			double rand = (Math.random()*6 + 16 );
			int by = 5;
			
//			System.out.println(rand);
//			System.out.println((int)rand);
		}
		
		Deck testDeck = new Deck();
//		System.out.println(testDeck);
//		System.out.println();
		
		Hand testHand = new Hand();
		Hand hand2 = new Hand();
		testHand.draw(testDeck.deal());
		testHand.draw(testDeck.deal());
		testHand.draw(testDeck.deal());
		hand2.draw(testDeck.deal());
		hand2.draw(testDeck.deal());
		hand2.draw(testDeck.deal());
		hand2.draw(testDeck.deal());
		testHand.draw(testDeck.deal());
		testHand.draw(testDeck.deal());
		hand2.draw(testDeck.deal());
		//System.out.println(testHand);
		//System.out.println(hand2);
		
		
		hand2.swap(0, 1); 
		//System.out.println(hand2);
		
		//hand2.sortSuit();
		//System.out.println(hand2);
		
		char[] suits = {'h', 'd', 'c', 's'};
		
		Card st1 = new Card('s', 5, false);
		Card st2 = new Card('h', 5, false);
		Card st3 = new Card('s', 11, false);
		Card st4 = new Card('h', 6, false);
		Card st5 = new Card('d', 8, false);
		Card st6 = new Card('c', 2, false);
		Card st7 = new Card('h', 4, false);
		Card st8 = new Card('d', 2, false);
		Card st9 = new Card('c', 12, false);
		Card st10 = new Card('s', 1, false);
		Card st11 = new Card('c', 13, false);
		Hand hand3 = new Hand();
		hand3.draw(st1);
		hand3.draw(st2);
		hand3.draw(st3);
		hand3.draw(st4);
		hand3.draw(st5);
		hand3.draw(st6);
		hand3.draw(st7);
		hand3.draw(st8);
		hand3.draw(st9);
		hand3.draw(st10);
		hand3.draw(st11);
		
		
//		System.out.println();
//		System.out.println(hand3);
//		
//		hand3.sortColor();
//		
//		System.out.println();
//		System.out.println(hand3);
//		

		Deck handDeckTest = new Deck();
		Hand handFin = new Hand();
		for (int i = 0; i < 52; i++)
			handFin.draw(handDeckTest.deal());
		handFin.sortSuit();
		System.out.println(handFin);
		
		//System.out.println(printBool(st.suit == suits[0]));
	
		BlackJackHand bjt = new BlackJackHand();
		bjt.draw(st11);
		bjt.draw(st11);
		
//		System.out.println(bjt);
//		System.out.println(bjt.hand.size());
//		System.out.println(printBool(bjt.isBlackJack()));
//		System.out.println(bjt.hand.get(0).value == 1);
//		System.out.println(bjt.score());

	}
	
	public static String printBool (boolean in) {
		if (in == true)
			return "true";
		else
			return "false";
	}

}
