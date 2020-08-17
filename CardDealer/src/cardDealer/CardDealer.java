//David Lam
package cardDealer;
import java.io.*;
import java.util.*;

public class CardDealer {

	public static void main(String[] args) throws IOException
	{
		//Create Scanner Object
		Scanner inFile = new Scanner(new File("cardData.dat"));

		//Create Variables
		CardNode[] hand = {null,null,null,null};
		int cardHand;
		CardClass cardLoc;
		CardNode deck = null;
		CardNode previous = null;
		CardNode temp;


		//Create deck
		for(int suit = 4; suit >= 1; suit--)
			for(int value = 13; value >=1; value--)
				deck = new CardNode(new CardClass(suit,value),deck);

		System.out.print("David Lam\n");

		//Deal Cards
		while(inFile.hasNext())
		{
			for(int out = 1; out <= 13; out++)
				for(int in = 0; in <= 3; in++)
				{
					cardHand = inFile.nextInt();
					temp = deck;
					
					for(int i = 1; i < cardHand; i++)
					{
						previous = temp;
						temp = temp.getNext();
					}
					cardLoc = temp.getValue();
					
					if(deck == temp)
						deck = deck.getNext();
					else
						previous.setNext(temp.getNext());

					temp = hand[in];
					previous = null;
					
					while(temp != null && cardLoc.compareTo(temp.getValue()) > 0)
					{
						previous = temp;
						temp = temp.getNext();
					}

					if(temp == hand[in])
						hand[in] = new CardNode(cardLoc,temp);
					else
						previous.setNext(new CardNode(cardLoc,temp));
				}
		}
		//Print Hand with Cards
		for(int in = 0;in <=3; in++)
		{
			System.out.println("\nHand #" + (in + 1));
			temp = hand[in];
			
			for(int out = 0; out < 13; out++)
			{
				System.out.println(temp.getValue());
				temp = temp.getNext();
			}
		}
	}
}