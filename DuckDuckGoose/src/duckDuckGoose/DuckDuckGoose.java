//David Lam
package duckDuckGoose;
import java.io.IOException;
import java.util.Scanner;

public class DuckDuckGoose
{
	public static void main(String[] args) 
	{
		int players = 0;

		//Declaring a Scanner Object
		Scanner input = new Scanner (System.in);

		//Declare Objects
		DuckNode items = null;
		DuckNode first = items;


		//User input
		System.out.print("Enter The number of players: ");
		players = input.nextInt();

		//check input
		while (players <= 0)
		{
			System.out.print("Enter a valid number of players: ");
			players = input.nextInt();
		}

		//Assigning player numbers
		for(int i = players; i > 0; i--)
			items = new DuckNode(i, items);	
		DuckNode temp1 = items;

		//Go to the end of the list
		for(int i = 0; i < players; i++)
		{
			first = temp1;
			temp1 = temp1.getNext();
		}
		//connect last node to first
		first.setNext(items);

		DuckNode temp2 = first; 
		DuckNode predLoc = temp2; 

		int count = 0; 
		int delete = 0; 

		//runs until 1 node is left
		while(delete != (players-1))
		{
			//finds goose
			while (count != 3)
			{
				predLoc = temp2;
				temp2 = temp2.getNext();
				count++;
			}
			count = 0;
			predLoc.setNext(temp2.getNext());
			delete++;
		}
		//Output
		System.out.println("The winner is: " + predLoc.getNum());
	}
}
/*
Enter The number of players: 100
The winner is: 91

Enter The number of players: 5
The winner is: 4

Enter The number of players: 3
The winner is: 2
 */