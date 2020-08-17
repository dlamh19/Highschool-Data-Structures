package postFix;

import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.util.Stack;

public class PostFix {
	public static void main(String[] args) throws IOException
	{
		//Taking word inputs
		Scanner input = new Scanner (new File("Postfix"));

		//Holds the initial string
		String notation = "";

		//Stack and scanner object
		Stack<Integer> myStack = new Stack<Integer>();

		int countOfOperators = 0;
		int countOfOperands = 0;


		while (input.hasNextLine())
		{
			notation = input.nextLine();
			for(int i = 0; i<notation.length(); i++)
			{
				if(notation.charAt(i) =='*' || notation.charAt(i) == '/' || notation.charAt(i) == '+' || notation.charAt(i) =='-' || notation.charAt(i) =='%' || notation.charAt(i) =='^')
				{
					countOfOperators++;
				}
				if(notation.charAt(i) !='*' && notation.charAt(i) != '/' && notation.charAt(i) != '+' && notation.charAt(i) !='-' && notation.charAt(i) !='%' && notation.charAt(i) !='^')
				{
					countOfOperands++;
				}
			}

			if((countOfOperands-1) == countOfOperators && notation.charAt(0) !='*' && notation.charAt(0) != '/' && notation.charAt(0) != '+' && notation.charAt(0) !='-' && notation.charAt(0) !='%' && notation.charAt(0) !='^' && notation.charAt(1) !='*' && notation.charAt(1) != '/' && notation.charAt(1) != '+' && notation.charAt(1) !='-' && notation.charAt(1) !='%' && notation.charAt(1) !='^')
			{

				for(int i = 0;i< notation.length();i++)
				{

					switch(notation.charAt(i))
					{
					case '*':
					{
						int temp = myStack.pop();

						if(!myStack.isEmpty())
						{
							myStack.push(myStack.pop() * temp);
						}
					}
					break;
					case '+':
					{
						int temp = myStack.pop();

						if(!myStack.isEmpty())
						{
							myStack.push(myStack.pop() + temp);
						}
					}
					break;
					case '-':
					{
						int temp = myStack.pop();

						if(!myStack.isEmpty())
						{
							myStack.push(myStack.pop() - temp);
						}
					}
					break;
					case '/':
					{
						int temp = myStack.pop();

						if(!myStack.isEmpty())
						{
							myStack.push(myStack.pop() / temp);
						}
					}
					break;
					case '%':
					{
						int temp = myStack.pop();

						if(!myStack.isEmpty())
						{
							myStack.push(myStack.pop() % temp);
						}
					}
					break;
					case '^':
					{
						int temp = myStack.pop();

						if(!myStack.isEmpty())
						{
							myStack.push(myStack.pop() ^ temp);
						}
					}
					break;

					default:myStack.push((int)notation.charAt(i) - 48);
					break;
					}
				}
				System.out.println(notation + "    Result:" +myStack.pop());
			}
			else 
			{
				System.out.println(notation + "     Invalid Expression");
			}
			countOfOperands = 0;
			countOfOperators = 0;

		}
	}
}
