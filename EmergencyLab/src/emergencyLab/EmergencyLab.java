package emergencyLab;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class EmergencyLab {

	public static void main(String[] args) 
	{
		//declare variables
		String name = "";
		int num1 = 0;
		int num2 = 0;
		int again = 0;
		Queue<String> crit = new LinkedList<String>();
		Queue<String> ser = new LinkedList<String>();
		Queue<String> fair = new LinkedList<String>();
		Scanner input = new Scanner(System.in);

		while(again == 0)
		{
			System.out.println("1. Schedule a patient");
			System.out.println("2. Treat the next patient");
			System.out.println("3. Treat all patients");
			System.out.println("4. Exit the Program");
			System.out.println("Enter number [1-4]: ");
			num1 = input.nextInt();

			while(num1 < 1 || num1 > 4)
			{
				System.out.print("Invalid input enter [1-4] again: ");
				num1 = input.nextInt();
			}
			if(num1 == 1)
			{
				input.nextLine();
				System.out.println("Enter name of patient: ");
				name= input.nextLine();
				System.out.println();

				System.out.println("CONDITION");
				System.out.println("1. Critical");
				System.out.println("2. Serious");
				System.out.println("3. Fair");
				System.out.println("Enter number [1-3]: ");
				num2 = input.nextInt();

				while(num2 < 1 || num2 > 3)
				{
					System.out.print("Invalid input enter [1-3] again: ");
					num2 = input.nextInt();
				}
				System.out.print(name + " has been added to the ");
				if(num2 == 1)
				{
					crit.add(name);
					System.out.println("Critical List\n");
				}
				else if(num2 == 2)
				{
					ser.add(name);
					System.out.println("Serious List\n");
				}
				else if(num2 == 3)
				{
					fair.add(name);
					System.out.println("Fair List\n");
				}
			}
			else if(num1 == 2)
			{				
				if(!crit.isEmpty())
					System.out.println("\n" + crit.remove() + " has been treated from critical list.\n");
				else if(!ser.isEmpty())
					System.out.println("\n" + ser.remove() + " has been treated from serious list.\n");
				else if(!fair.isEmpty())
					System.out.println("\n" + fair.remove() + " has been treated fair list.\n");
				else
					System.out.println("\nNo patients are scheduled\n");
			}
			else if(num1 == 3)
			{
				if(crit.isEmpty() && ser.isEmpty() && fair.isEmpty())
					System.out.println("\nNo patients are scheduled\n");
				while(!crit.isEmpty())
					System.out.println("\n" + crit.remove() + " has been treated from critical list.\n");
				while(!ser.isEmpty())
					System.out.println("\n" + ser.remove() + " has been treated from serious list.\n");
				while(!fair.isEmpty())
					System.out.println("\n" + fair.remove() + " has been treated fair list.\n");
			}
			else
				again = 0;
		}
	}
}


