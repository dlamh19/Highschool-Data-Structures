//David Lam
package reverseString;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
		//Declaring a Scanner Object/Variables
		Scanner input = new Scanner (System.in);
		String name = "";

		while(name.length() <= 0)
		{
			System.out.print("Enter a word to be reveresed: ");
			name = input.nextLine();
		}
		//Calls Reverse Method and Prints
		System.out.print(reverse(name));
	}
	//Reverse Method
	public static String reverse(String str) 
	{
	    if (str.length() <= 1) 
	        return str;
	    return reverse(str.substring(1)) + str.charAt(0);
	}
}
/*
Enter a word to be reveresed: we love comp sci
ics pmoc evol ew

Enter a word to be reveresed: 12345/
/54321

Enter a word to be reveresed: 2+2=4
4=2+2
*/