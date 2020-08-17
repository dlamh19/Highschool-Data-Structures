//David Lam
package levelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		//declare variables
		int[] treeArray = {20,10,5,1,6,15,11,16,30,25,24,27,35,32,37};
		Queue<TreeNode> treeQueue = new LinkedList<TreeNode>();
		TreeNode root = null;
		TreeNode temp;
		TreeNode predLoc;	

		//create tree
		for(int i = 0; i < treeArray.length; i++)
		{
			predLoc = null;
			temp = root;

			while(temp != null)
			{
				predLoc = temp;
				if(temp.getValue() < treeArray[i])
					temp = temp.getRight();
				else
					temp = temp.getLeft();
			}

			TreeNode newNode = new TreeNode(treeArray[i]);

			if(predLoc == null)
				root = newNode;
			else if(predLoc.getValue() < treeArray[i])
				predLoc.setRight(newNode);

			else
				predLoc.setLeft(newNode);
		}

		treeQueue.add(root);
		//run through tree
		while(!treeQueue.isEmpty())
		{
			temp = treeQueue.remove();
			System.out.print(temp.getValue() + (" "));
			if(temp.getLeft() != null)
				treeQueue.add(temp.getLeft());
			if(temp.getRight() != null)
				treeQueue.add(temp.getRight());
		}
	}
}
/*
		
20 10 30 5 15 25 35 1 6 11 16 24 27 32 37 

*/ 
