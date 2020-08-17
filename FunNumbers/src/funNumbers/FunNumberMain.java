//David Lam
package funNumbers;

public class FunNumberMain {

	public static void main(String[] args) 
	{	//declare constructors
		FunNumberClass input1 = new FunNumberClass("1234");
		FunNumberClass input2 = new FunNumberClass(496);
		FunNumberClass input3 = new FunNumberClass(3);

		//Print Numbers
		System.out.println("Num 1 is: "+ input1);
		System.out.println("Num 2 is: "+ input2);
		System.out.println("Num 3 is: "+ input3);

		//Print Number of Digits
		System.out.println("\nThe number of digits: "+ input1.numDigits());
		System.out.println("The number of digits: "+ input2.numDigits());
		System.out.println("The number of digits: "+ input3.numDigits());

		//Print Sum of Digits
		System.out.println("\nThe sum of digits: "+ input1.sumDigits());
		System.out.println("The sum of digits: "+ input2.sumDigits());
		System.out.println("The sum of digits: "+ input3.sumDigits());

		//Print Reverse of Digits
		System.out.println("\nThe reverse of digits: "+ input1.reverseNum());
		System.out.println("The reverse of digits: "+ input2.reverseNum());
		System.out.println("The reverse of digits: "+ input3.reverseNum());

		//Print if num is Perfect
		System.out.println("\nThe number is Perfect: "+ input1.isPerfect());
		System.out.println("The number is Perfect: "+ input2.isPerfect());
		System.out.println("The number is Perfect: "+ input3.isPerfect());

		//Print if num is Prime
		System.out.println("\nThe number is Prime: "+ input1.isPrime());
		System.out.println("The number is Prime: "+ input2.isPrime());
		System.out.println("The number is Prime: "+ input3.isPrime());	
	}
}
/*
Num 1 is: 1234
Num 2 is: 496
Num 3 is: 3

The number of digits: 4
The number of digits: 3
The number of digits: 1

The sum of digits: 10
The sum of digits: 19
The sum of digits: 3

The reverse of digits: 4321
The reverse of digits: 694
The reverse of digits: 3

The number is Perfect: false
The number is Perfect: true
The number is Perfect: false

The number is Prime: false
The number is Prime: false
The number is Prime: true
 */