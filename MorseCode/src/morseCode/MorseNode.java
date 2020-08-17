//David Lam
package morseCode;

public class MorseNode 
{
	private char num;
	private MorseNode dot;
	private MorseNode dash;
	
	public MorseNode(char let)
	{
		num = let;
		dash = null;
		dot = null;
	}
	
	public void setValue(char x)
	{
		num = x;
	}
	public char getValue()
	{
		return num;
	}
	
	public void setDot(MorseNode m)
	{
		dot = m;
	}
	public MorseNode getDot()
	{
		return dot;
	}
	
	public void setDash(MorseNode n)
	{
		dash = n;
	}
	public MorseNode getDash()
	{
		return dash;
	}
	
}
