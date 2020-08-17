//David Lam
package palindromeLab;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class PalindromeLab {
	public static void main(String[] args) throws IOException
	{
		Scanner file = new Scanner(new File("palindrome.txt"));

		while(file.hasNext())
		{
			String fullPhrase = file.nextLine();
			String lower = fullPhrase.toLowerCase();
			ArrayList <Character> check = new ArrayList <Character>();
			
			while(lower.length() != 0)
			{
				if(Character.isLetterOrDigit(lower.charAt(0)))
				{
					check.add(lower.charAt(0));
				}
				lower = lower.substring(1);
			}
			boolean pal = true; 
			for(int i = 0; i <= check.size()/2; i++)
				if(check.get(i) != check.get(check.size() - (i+1)))
					pal = false;
			
			System.out.println(fullPhrase + "   ");
			if(pal)
				System.out.println("is palidrome");
			else
				System.out.println("not palidrome");



		}

	}
}
