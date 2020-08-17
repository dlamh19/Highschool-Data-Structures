//David Lam
package morseCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MorseCode {

	public static void main(String[] args) throws FileNotFoundException 
	{
		//Declare Variables
		Scanner input1 = new Scanner (new File("Morse"));
		Scanner input2 = new Scanner (new File("MorseData"));
		MorseNode root = new MorseNode(' ');
		String text = ""; 
		char letter; 
		char dot; 
		String holder; 
		
		//Tree Building
		while (input1.hasNextLine())
		{
			text = input1.nextLine();
			letter = text.charAt(0);
			holder = text.substring(2);
			MorseNode temp = root;

			for(int i = 0; i < holder.length() - 1; i++)
			{
				dot = holder.charAt(i);

				if(dot =='.')
				{
					temp = temp.getDot();
				}
				else
				{
					temp = temp.getDash();
				}
			}
			if(holder.charAt(holder.length() - 1) == '.')
				temp.setDot(new MorseNode(letter));
			else 
				temp.setDash(new MorseNode(letter));
		}
		//inOrder(root);

		//Converts morse into code
		while (input2.hasNextLine())
		{
			MorseNode temp = root;
			String morse2 = input2.nextLine();
			
			for(int i = 0; i<morse2.length();i++)
			{
				if(morse2.charAt(i) =='.')
					temp = temp.getDot();
				else if(morse2.charAt(i) =='-')
					temp = temp.getDash();
				else if(morse2.charAt(i) ==' ')
				{
					System.out.print(temp.getValue());
					temp = root;
				}
				else if(morse2.charAt(i) =='/')
				{
					System.out.print(temp.getValue());
					System.out.print(" ");
					temp = root;
				}
			}
			System.out.print(temp.getValue() + "\n");
		}
	}
	//InOrder Method
	public static void inOrder(MorseNode root1)
	{
		if(root1 != null)
		{
			inOrder(root1.getDot());
			System.out.print(root1.getValue());
			inOrder(root1.getDash());
		}
	}
}