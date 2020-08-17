//David Lam
package bigInt;

public class BigClass 
{
	private int array[];
	private int length;
	
	public BigClass(String num)
	{
		array = new int [100];
		length = num.length();
		for(int i = num.length(); i > 0; i--)
			array[i - 1] = num.charAt(num.length() - i) - 48;
	}
	
	public static String add(BigClass X, BigClass Y)
	{
		int [] temp = new int[100];
		int i = 0;
		String hold = "";
		
		for(int j = 0; j < 100; j++)
			temp[j] = 0;
		
		for(int j = 0; j < 100; j++)
			temp[j] += X.array[j] + Y.array[j];
		
		for(int j = 0; j < 100; j++)
			if(X.array[j] + Y.array[j] >= 10)
			{
				temp[j + 1] += 1;
				temp[j] = (X.array[j] + Y.array[j]) % 10;
			}
		for(int j = 99; j >= 0; j--)
			hold += temp[j];
		
		//Search for 0 in the array's
		while(hold.charAt(i) == '0')
			i++;
		
		hold = hold.substring(i);
		
		return hold;
	}
	public String toString()
	{
		int i = length - 1;
		String temp = "";
		
		for(int j = length; j> 0; j--)
		{
			temp += array[i];
			i--;
		}
		return temp;
	}
}
	