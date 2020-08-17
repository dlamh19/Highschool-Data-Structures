//David Lam
package basicEmulator;

public class NodeLine 
{
	private int num;
	private String line;
	private NodeLine next;

	public NodeLine(int x, String y, NodeLine z)
	{
		num = x;
		line = y.substring(y.indexOf(" ") + 1);
		next = z;
	}

	public NodeLine getNext()
	{
		return next;
	}

	public void setNext(NodeLine x)
	{
		next = x;
	}

	public int getNum()
	{
		return num;
	}

	public void setNum(int x)
	{
		num = x;
	}

	public String getLine()
	{
		return line;
	}

	public void setCode(String x)
	{
		line = x;
	}

	public String toString()
	{
		return (num + " " + line);	
	}
}