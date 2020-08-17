package extendSet;
import java.util.Set;
import java.util.TreeSet;

public class ExtendSet {

	public static void main(String[] args) 
	{
		//Create Sets
		ExtendClass A = new ExtendClass();
		ExtendClass B = new ExtendClass();
		ExtendClass C = new ExtendClass();
		ExtendClass D = new ExtendClass();
	
		A.add(1);
		A.add(2);
		A.add(3);
		B.add(2);
		B.add(3);
		B.add(4);
		C.add(6);
		C.add(7);
		D.add(2);
		D.add(3);
			
		//Print Sets
		System.out.println("Set A: " + A);
		System.out.println("Set B: " + B);
		System.out.println("Set C: " + C);
		System.out.println("Set D: " + D);
		System.out.println();
		
		System.out.println("A intersection B " + A.getInter(A, B));
		System.out.println("A intersection B " + A.getInter(A, C));
		System.out.println();
		
		System.out.println("A union B " + A.union(A, B));
		System.out.println("A union B " + A.union(A, C));
		System.out.println();
		
		System.out.println("A - B " + A.getDiff(A, B));
		System.out.println("B - A " + A.getDiff(B, A));
		System.out.println("B - C " + A.getDiff(B, C));
		System.out.println();
		
		System.out.println("A isSubset of B " + A.isSubsetOf(A, B));
		System.out.println("D isSubset of B " + A.isSubsetOf(D, B));
		System.out.println();
		
		System.out.println("A isDisjoint of B " + A.isDisjoint(A, B));
		System.out.println("A isDisjoint of C " + A.isDisjoint(A, C));
		System.out.println();	
		
		System.out.println("A x C ");
		A.cartProduct(A, C);
	}
}
/*
Set A: [1, 2, 3]
Set B: [2, 3, 4]
Set C: [6, 7]
Set D: [2, 3]

A intersection B [2, 3]
A intersection B []

A union B [1, 2, 3, 4]
A union B [1, 2, 3, 6, 7]

A - B [1]
B - A [4]
B - C [2, 3, 4]

A isSubset of B false
D isSubset of B true

A isDisjoint of B false
A isDisjoint of C true

A x C 
1 6
1 7
2 6
2 7
3 6
3 7
*/
