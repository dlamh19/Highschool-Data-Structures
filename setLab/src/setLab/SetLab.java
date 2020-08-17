package setLab;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SetLab {

	public static void main(String[] args) throws IOException
	{
		//Declare Scanner Object
		Scanner input = new Scanner(new File("paragraph"));

		//Declare variables
		String line;
		String board;
		String word; 
		int loc;
		TreeSet<String> unique = new TreeSet<String>();
		Iterator<String> it = unique.iterator();

		while(input.hasNext()) 
		{
			line = input.nextLine(); 
			System.out.println(line);
			line = line.toLowerCase();
			
			while(line.indexOf(" ") != -1)
			{
				loc = line.indexOf(" ");
				word = line.substring(0,loc);
				line = line.substring(loc + 1);

				if(word.charAt(word.length() - 1))
				{
					
				}
			}
			
			
		}



	}

}
