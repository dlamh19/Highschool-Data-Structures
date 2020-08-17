//David Lam
package palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome{
	public static void main(String[] args) throws IOException
	{
		//Create Scanner Object
		Scanner file = new Scanner(new File("palindrome.txt"));		//uses data files
		file.useDelimiter("\n");
		
		//Output if Palindrome or not
		while(file.hasNext()) 
		{
			String word = file.next();
			word = word.toUpperCase();
			Queue<Character> q = new LinkedList<Character>();
			Stack<Character> s = new Stack<Character>();
			for(int i =0; i< word.length(); i++)
			{
				char temp = word.charAt(i);
				if(Character.isLetterOrDigit(temp))
				{
					q.add(temp);
					s.push(temp);
				}
			}
			boolean check = true;
			while(!q.isEmpty() && !s.isEmpty())
			{
				if(q.poll() != s.pop())
					check = false;
			}
			//output results
			if(check)
				System.out.println(word + " is a palindrome");
			else
				System.out.println(word + " is not a palindrome");

		}
	}
}