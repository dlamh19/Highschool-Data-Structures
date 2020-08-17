//David Lam
package primeNumSets;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PrimeNumSets {

	public static void main(String[] args)
	{
		//Declare Scanner Object
		Scanner input = (new Scanner(System.in));

		//Declare Variables
		Set<Integer> prime = new TreeSet<Integer>();
		int temp;

		//Check/Get User Input
		do
		{
			System.out.print("Enter a number greater than two: ");
			temp = input.nextInt();
			
		}while(temp<2);

		//Fill Set
		for(int i = 2;i <= temp; i++)
			prime.add(i);

		//Remove NonPrime #'s
		for(int i = 2; i < Math.sqrt(temp); i++)
			for(int j = 2; j < prime.size(); j++)
				if(prime.contains(i * j))
					prime.remove(i * j);
		
		//Print Set with Prime #'s
		System.out.println(prime);
	}
}
/*
Enter a number greater than two: 100
[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]

Enter a number greater than two: 10
[2, 3, 5, 7]
 */
