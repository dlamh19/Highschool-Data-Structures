//David Lam
package footBallLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FootBallLab 
{
	public static void main(String[] args) throws FileNotFoundException 
	{

		Scanner input = new Scanner(new File("teams"));
		String[] teams = new String[53];

		for(int i = 0; i < 32; i++)
		{
			String temp = input.nextLine();
			int value = 0;
			for(int j = 0; j < temp.length(); j++)
			{
				value += temp.charAt(j) - 64;
			}
			boolean in = false;
			while (!in)
			{
				value %= 53;
				if(teams[value] == null)
				{
					teams[value] = temp;
					in = true;
				}
				else
					value++;
			}
		}
		for(int i = 0; i < teams.length;i++)
			System.out.println(i + ": " + teams[i]);
		boolean xd = false;
		while(xd != true)
		{
			System.out.print("\nEnter team name: ");
			input = new Scanner(System.in);

			String name = input.nextLine();
			int value = 0;

			for(int j = 0;j < name.length();j++)
				value += name.charAt(j) - 64;

			boolean found = false;
			int comp;
			for(comp = 0; !found; comp++)
			{
				value %= 53;
				if(name.equals(teams[value]))
					found = true;
				else if(teams[value] == null)
					break;
				else
					value++;
			}
			if(found)
				System.out.println(name + " found at location " + value  + " after " + comp + " comparisons");
			else
				System.out.println(name + " is not in the array");
		}
	}
}
/*
0: Packers
1: Raiders
2: null
3: Dolphins
4: Jaguars
5: Redskins
6: Fortyniners
7: Panthers
8: Buccaneers
9: Steelers
10: null
11: null
12: null
13: Broncos
14: Bears
15: null
16: null
17: null
18: Giants
19: Cardinals
20: Vikings
21: null
22: null
23: Bills
24: Patriots
25: null
26: null
27: Ravens
28: null
29: Cowboys
30: Saints
31: Texans
32: Titans
33: null
34: null
35: null
36: null
37: null
38: Chargers
39: Browns
40: Bengals
41: Colts
42: Lions
43: Rams
44: Jets
45: null
46: Seahawks
47: null
48: null
49: null
50: Eagles
51: Chiefs
52: Falcons

Enter team name: Ravens
Ravens found at location 27 after 1 comparisons

Enter team name: ravens
ravens is not in the array

Enter team name: Giants
Giants found at location 18 after 1 comparisons

Enter team name: Jets
Jets found at location 44 after 1 comparisons

Enter team name: Jet
Jet is not in the array
 */
