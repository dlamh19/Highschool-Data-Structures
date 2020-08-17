package parenthesisChecker;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) 
	{
		Stack<String> myStack = new Stack<String>();
		Scanner scan = new Scanner(System.in);
		String notation = "";
		int again = 1;
		Boolean check = true;

		while(again == 1)
		{
			System.out.println("\nEnter a Expression:");
			notation = scan.nextLine();

			for(int i = 0; i < notation.length(); i++)
			{
				switch(notation.charAt(i))
				{
				case '(':
					myStack.push("(");
					break;
				case '[':
					myStack.push("[");
					break;
				case '{':
					myStack.push("{");
					break;
				case ')':
					if(myStack.empty())
						check = false;
					else if(myStack.peek() == "(")
						myStack.pop();	
					else
						check = false;
					break;
				case ']':
					if(myStack.empty())
						check = false;
					else if(myStack.peek() == "[")
						myStack.pop();	
					else
						check = false;
					break;
				case '}':
					if(myStack.empty())
						check = false;
					else if(myStack.peek() == "{")
						myStack.pop();	
					else
						check = false;
					break;
				}

			}

			if(check == false)
				System.out.println("This expression is invalid.");
			else if(check == true)
			{
				System.out.println("This expression is valid.");	
				again = 0;
			}
			System.out.print("\nEnter 1 to enter again and 0 to stop: ");
			again = scan.nextInt();

			scan.nextLine();
			while(!myStack.empty())
				myStack.clear();

		}
	}
	}
