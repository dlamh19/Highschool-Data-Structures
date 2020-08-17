//David Lam
package bigInt;

public class BigInt 
{
	public static void main(String[] args) 
	{
		//Declare Variables
		System.out.println("Variables");
		BigClass A = new BigClass("128");
		BigClass B = new BigClass("999699");
		BigClass C = new BigClass("2653452");
		
		//Print Variables
		System.out.println(A.toString());
		System.out.println(B.toString());
		System.out.println(C.toString());
		System.out.println();
		
		//Add the BigInts
		System.out.println("The sum is " + (BigClass.add(A,B)).toString());
		System.out.println("The sum is " +(BigClass.add(A,C)).toString());
		System.out.println("The sum is " +(BigClass.add(C,C)).toString());	
	}
}
/*
Variables
128
999699
2653452

The sum is 999817
The sum is 2653580
The sum is 5206904
*/
	