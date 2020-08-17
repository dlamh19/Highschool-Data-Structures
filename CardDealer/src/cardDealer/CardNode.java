//David Lam
package cardDealer;

public class CardNode 
{
	private CardClass value;
	private CardNode next;
	
	public CardNode(CardClass x, CardNode y)
	{
		value = x;
		next = y;
	}
	public CardClass getValue()
	{
		return value;
	}
	public void setValue(CardClass inVal)
	{
		value = inVal;
	}
	public CardNode getNext()
	{
		return next;
	}
	public void setNext(CardNode inNex)
	{
		next = inNex;
	}	
}
