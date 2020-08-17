//David Lam

package getBinary;
import java.util.Scanner;

public class GetBinary {

	public static void main(String[] args) 
	{
		//Declaring a Scanner Object
		Scanner input = new Scanner (System.in);

		//Bionary Recursion	
		int num = 0;
		while(num <=0)
		{
			System.out.print("Enter a number to convert to binary: ");
			num = input.nextInt();
		}
		recursion(num);

	}
	//Method that converts number to binary
	public static void recursion(int num)
	{
		if(num > 0)
		{
			recursion(num/2);
			System.out.print(num % 2);
		}
	}
}
/*
Enter a number to convert to binary: 15
1111

Enter a number to convert to binary: 20
10100

Enter a number to convert to binary: 5
101
*/
