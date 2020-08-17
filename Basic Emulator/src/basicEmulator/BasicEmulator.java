//David Lam
package basicEmulator;
import java.util.*;
import java.io.*;
import java.lang.*;
public class BasicEmulator {

	public static void main(String[] args) {

		String basic = new String ("");
		NodeLine node = new NodeLine(-1, "", null);
		int line = 0;
		boolean loop = false;
		Scanner input = new Scanner(System.in);
		

		while (!loop)
		{
			System.out.print(">");
			basic = input.nextLine();
			basic = basic.toUpperCase();
			
			//Run basic
			if (basic.contains("RUN")) 
			{

			}

			//checks if the line of basic has LIST in it
			else if (basic.contains("LIST")) 
			{
				//list all
				if(basic.equals("LIST"))
				{	
					NodeLine temp = node.getNext();
					while (temp != null)
					{
						System.out.println(temp);
						temp = temp.getNext();
					}
				}

				//list until a number
				else if(basic.contains("LIST - "))
				{
					int loc = Integer.parseInt(basic.substring(7));

					NodeLine temp = node.getNext();
					while (temp != null && temp.getNum() <= loc)
					{
						System.out.println(temp);
						temp = temp.getNext();
					}
				}

				//list between 2 numbers
				else if (basic.substring(basic.indexOf("-")) != "0" && basic.indexOf("-") != basic.length() - 1)
				{
					int start = Integer.parseInt(basic.substring(5,basic.indexOf("-")));
					int end = Integer.parseInt(basic.substring(basic.indexOf("-") + 1));

					NodeLine temp = node.getNext();
					while (temp != null)
					{
						if (temp.getNum() >= start && temp.getNum() <= end)
							System.out.println(temp);
						temp = temp.getNext();
					}
				}

				//list from a number
				else
				{
					int begin = Integer.parseInt(basic.substring(5,basic.indexOf("-")));
					NodeLine temp = node.getNext();
					while (temp != null)
					{
						if (temp.getNum() >= begin)
							System.out.println(temp);
						temp = temp.getNext();
					}
				}
			}
			
			//Put Lines of basic into the nodes
			else 
			{			
				line = Integer.parseInt(basic.substring(0, basic.indexOf(" ")));
				NodeLine hold = new NodeLine(line, basic, null);

				if (node.getNext() == null)
					node.setNext(hold);
				else 
				{
					NodeLine temp = node;
					while (temp.getNext() != null) 
						temp = temp.getNext();

					if (temp.getNext() == null)
						temp.setNext(hold);		
					else 
					{
						hold.setNext(temp.getNext());
						temp.setNext(hold);
					}
				}
			}					
		}
	}
}