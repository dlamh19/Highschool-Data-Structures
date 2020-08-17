//David Lam
package cardDealer;

public class CardClass  implements Comparable<Object>
{
	private int suit;
	private int value;

	public CardClass(int s1, int v1)
	{
		suit = s1;
		value = v1;
	}

	public int getSuit()
	{
		return suit;
	}

	public void setSuit(int s1)
	{
		suit = s1;
	}   

	public int getValue()
	{
		return value;
	}

	public void setValue(int v1)
	{
		value = v1;
	}    
	public int compareTo(Object other)
	{
		CardClass card2 = (CardClass)other;
		
		if(suit > card2.getSuit())
			return 1;
		else if(suit < card2.getSuit())
			return -1;
		else
		{
			if(value > card2.getValue())
				return 1;
			else if(value < card2.getValue())
				return -1;
			else 
				return 0;
		}
	}
	public String toString()
	{
		String out = "";

		switch(value){
			case 1: out += "Ace "; break;
			case 11: out += "Jack "; break;
			case 12: out += "Queen "; break;
			case 13: out += "King "; break;
			default: out += value + " ";	
		}
		switch(suit){
			case 1: out += "of Diamonds"; break;
			case 2: out += "of Clubs"; break;
			case 3: out += "of Hearts"; break;
			case 4: out += "of Spades"; 
		}
		return out;
	}
}