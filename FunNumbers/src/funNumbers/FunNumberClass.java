//David Lam
package funNumbers;

public class FunNumberClass 
{
	private int myNum;

	public FunNumberClass(int n)
	{
		myNum = n;
	}

	public FunNumberClass(String n)
	{
		myNum = Integer.parseInt(n);
	}

	public int numDigits()
	{
		int count = 0;
		int hold = myNum;

		while(hold != 0)
		{
			hold = hold/10;
			count++;
		}
		return count;
	}

	public int sumDigits()
	{
		int num = myNum;
		int sum = 0;

		while (num > 0) 
		{
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum;
	}

	public boolean isPerfect() 
	{	
		int num = myNum;
		int sum = 0;
		for(int i = 1; i < num; i++)
		{	
			if(num % i == 0)
				sum += i;
		}
		if(num == sum)
			return true;
		else
			return false; 
	}

	public int reverseNum()
	{
		int num = myNum;
		int reverse = 0;
		while( num != 0 )
		{
			reverse = reverse * 10;
			reverse = reverse + num%10;
			num = num/10;
		}
		return reverse;  
	}

	public boolean isPrime()
	{
		int prime = 0;
		int num = myNum;
		for(int i = 1; i <= num / 2; i++)
		{
			if(num % i == 0)
				prime += i;
		}
		return prime == 1;
	}
	public String toString()
	{
		return ((Integer)myNum).toString();
	}
}
