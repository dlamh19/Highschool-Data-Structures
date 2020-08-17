package levelOrderTraversal;

public class TreeNode 
{
	private TreeNode left;
	private TreeNode right;
	private int number;
	
	public TreeNode(int num)
	{
		left = null;
		right = null;
		number = num;
	}
	public void setValue(int x)
	{
		number = x;
	}
	public int getValue()
	{
		return number;
	}
	
	public void setLeft(TreeNode left)
	{
		this.left = left;
	}
	public TreeNode getLeft()
	{
		return left;
	}
	
	public void setRight(TreeNode right)
	{
		this.right = right;
	}
	public TreeNode getRight()
	{
		return right;
	}
	
	
}
