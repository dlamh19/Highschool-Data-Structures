//David Lam
package hashingLab;

public class HashingLab 
{
	public static void main(String[] args) 
	{
		//Declare Variables
		String [] array1 = {"DOLPHINS", "PATRIOTS", "JETS", "BILLS", "STEELERS", "BROWNS","OILERS"};
		String [] array2 = {"BENGALS", "COLTS", "BRONCOS", "SEAHAWKS", "RAIDERS","OILERS"};
		String [] hashmap = new String[13];
		int add = 0;

		//hashes array into hashmap
		for(int i = 0; i < array1.length; i++)
		{
			//Find values of the team name
			for(int j = 0; j < array1[i].length(); j++)
			{
				String temp = array1[i];
				int res = temp.charAt(j)-64;
				add += res;
			}
			int remainder = add % 13;

			if(hashmap[remainder] == null)
				hashmap[remainder] = array1[i];
			
			//linear probing
			else if (hashmap[remainder] != null)
			{
				int temp2 = remainder;

				for(int k = temp2; k < hashmap.length; k++)
				{
					if(hashmap[k] == null)
					{
						hashmap[k] = array1[i];
						k = hashmap.length;
					}
					else if(hashmap[k] != null)
					{

					}
					else if(k == hashmap.length)
						k = 0;
				}
			}
			add = 0;
		}
		//Prints Output
		System.out.println("OUTPUT");
		for(int i = 0; i < 13; i ++)
			System.out.println(i + ": " + hashmap[i]);
		System.out.println();
		
		
		for(int i = 0; i < array2.length; i++)
		{
			//Find values of more teams
			for(int j = 0; j < array2[i].length(); j++)
			{
				String temp = array2[i];
				int res = temp.charAt(j) - 64;
				add += res;
			}
			int remainder = add % 13;	
			
			if(array2[i].equals(hashmap[remainder]))
			{
				System.out.println("already in array");
			}
			else if(hashmap[remainder] == null)
			{
				hashmap[remainder] = array2[i];
				System.out.println(array2[i] + " was placed at position " + remainder);
			}
			else if(hashmap[remainder] != null)
			{
				int temp2 = remainder;

				for(int k = temp2; k < hashmap.length; k++)
				{
					if(array2[i].equals(hashmap[k]))
					{
						System.out.println(array2[i] + " is already in the array at position: " + k);
						break;
					}
					else if(hashmap[k] == null)
					{
						hashmap[k] = array2[i];
						System.out.println(array2[i] + " was added in position: " + k);
						k = hashmap.length;
					}
					else if(hashmap[k] != null)
					{

					}
					else if(k == hashmap.length)
						k = 0;
				}
			}
			add = 0;
			
		}
		System.out.println();
		for(int o = 0; o < 13; o ++)
			System.out.println(o + ": " + hashmap[o]);	
	}
}
/*
OUTPUT
0: BROWNS
1: PATRIOTS
2: JETS
3: BILLS
4: OILERS
5: null
6: DOLPHINS
7: null
8: null
9: null
10: null
11: null
12: STEELERS

BENGALS was placed at position 8
COLTS was added in position: 5
BRONCOS was added in position: 9
SEAHAWKS was added in position: 10
RAIDERS was added in position: 11
OILERS is already in the array at position: 4

0: BROWNS
1: PATRIOTS
2: JETS
3: BILLS
4: OILERS
5: COLTS
6: DOLPHINS
7: null
8: BENGALS
9: BRONCOS
10: SEAHAWKS
11: RAIDERS
12: STEELERS
*/
