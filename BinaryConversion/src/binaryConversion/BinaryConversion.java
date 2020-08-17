package binaryConversion;

import java.util.Scanner;
import java.util.Stack;

public class BinaryConversion {

	public static void main(String[] args) 
	{
		//decalre scanner and stack object
		Stack<Integer> stack = new Stack<Integer>();
		Scanner scan = new Scanner(System.in);
		int again = 1;

		while(again == 1)
		{
			//User input
			System.out.print("Enter decimal number: ");
			int num = scan.nextInt();

			while (num != 0)
			{
				int d = num % 2;
				stack.push(d);
				num /= 2;
			}        
			/* Print Binary equivalent */
			System.out.print("Binary equivalent = ");
			while (!(stack.isEmpty() ))
			{
				System.out.print(stack.pop());
			}
			System.out.print("\nEnter 1 to enter again and 0 to stop: ");
			again = scan.nextInt();
		}
	}
}
/*

*/