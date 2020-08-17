//David Lam
package duckDuckGoose;

public class DuckNode
{
	private int num;

	private DuckNode next;

	public DuckNode(int v,DuckNode n)
	{
		num = v;
		next = n;
	}

	public int getNum()
	{
		return num;
	}

	public DuckNode getNext()
	{
		return next;
	}
	public void setValue(int v)
	{
		num = v;
	}
	public void setNext(DuckNode n)
	{
		next = n;
	}
}
