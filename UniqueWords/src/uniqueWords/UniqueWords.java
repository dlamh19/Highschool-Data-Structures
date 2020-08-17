//David Lam
package uniqueWords;

import java.util.Scanner;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;

public class UniqueWords {

	public static void main(String[] args) throws FileNotFoundException
	{
		//Declare Variables
		TreeSet<String> set = new TreeSet<String>();
		Scanner input = new Scanner(new File("paragraph"));
		String line;
		String word;
		int count = 0;

		while(input.hasNext())
		{
			word = "";
			line = input.nextLine();
			System.out.println(line);

			for(int i = 0; i < line.length(); i++)
			{
				if(line.charAt(i) == ' ')
				{
					set.add(word.toLowerCase());
					word = "";
				}
				else if(Character.isLetter(line.charAt(i)))
					word = word + line.charAt(i);
			}
		}

		System.out.println();

		while(!set.isEmpty())
		{
			System.out.println(set.first());
			set.remove(set.first());
			count++;
		}
		System.out.println("\nList Size: " + count);
	}
}