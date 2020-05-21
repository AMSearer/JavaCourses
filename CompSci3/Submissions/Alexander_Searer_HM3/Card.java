
public class Card {
	
	char suit;
	int value;
	boolean isFace;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Card() {
		suit = 'j';
		value = 14;
		isFace = true;
	}
	
	public Card(char suitIn, int valueIn, boolean isFaceIn) {
		suit = suitIn;
		value = valueIn;
		isFace = isFaceIn;
	}
	
	public String getColor() {
		String out = "";
		
		if (suit == 'h' || suit == 'd')
			out = "red";
		else if (suit == 'c' || suit == 's')
			out = "black";
		else
			out = "joker";
		
		return out;
	}
	
	public String toString() {
		String out = "";
		
		if (value >=2 && value <= 10)
		{
			out += Integer.toString(value);
			out += " ";
			if (value != 10)
				out += " ";
		}
		else {
			
			switch (value) {
			
			case 1:
				out += "A  ";
				break;
			case 11:
				out += "J  ";
				break;
			case 12:
				out += "Q  ";
				break;
			case 13:
				out += "K  ";
				break;
			default:
				out += "Jk ";
				break;
			}
		}
		
		out += "of ";
		
		switch (suit) {
		
		case 'h':
			out += "Hearts ";
			break;
		case 'd':
			out += "Diamonds ";
			break;
		case 's':
			out += "Spades ";
			break;
		case 'c':
			out += "Clubs ";
			break;
		default:
			out += "Joker ";
			break;
		}
		
		return out;
	}

}
