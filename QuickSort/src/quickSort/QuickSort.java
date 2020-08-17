//David Lam
package quickSort;

import java.io.*;
import java.io.IOException;
import java.util.*;

public class QuickSort {

	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(new File("randomNums"));
		int [] array1 = new int[100];
		int [] array2 = {252,-120,327,706,979,636,103,66,1031,327};

		System.out.print("Unsorted List:\n");

		//Fill First Array and Print First Array
		for(int i = 1; i < 101; i++)
		{
			int number = input.nextInt();
			array1[i-1] = number;
			System.out.print(array1[i-1] + " ");

			if(i % 10==0)
				System.out.println();
		}

		//Unsorted Linear Search
		System.out.println("\nUnsorted Linear Search Results:");
		System.out.println("|   Number   |    # of Comps   |     Found?    |");
		for (int j = 0; j < 10; j++)
		{
			boolean found = false;
			int count = 0;

			while(found == false && count < 100)
			{
				if(array2[j] == array1[count])
					found = true;
				count++;
			}
			if(found)
			{
				System.out.format("%-20s %-15s %-13s",array2[j],count,"found");
				System.out.println();
			}
			else
			{
				System.out.format("%-20s %-15s %-13s",array2[j],count,"not found");
				System.out.println();
			}
		}

		System.out.print("\n" + "Sorted List: ");

		//Call Sort Method and Print Sorted List
		quickSort(array1, 0, array1.length-1);
		for (int i = 0; i < array1.length; i++) 
		{
			if(i % 10==0)
				System.out.println();
			System.out.print(array1[i] + " ");
		}
		System.out.println();

		//Sorted Linear Search
		System.out.println("\nSorted Linear Search Results:");
		System.out.println("|   Number   |    # of Comps   |     Found?    |");
		for (int j = 0; j < 10; j++)
		{
			boolean found = false;
			int count = 0;

			while(found == false && count < 100)
			{
				count++;
				if(array2[j] == array1[count])	
					found = true;
				if(array2[j] < array1[count] || array2[j] > array1[99])
					break;

			}
			if(found)
			{
				System.out.format("%-20s %-15s %-13s",array2[j],count + 1,"found");
				System.out.println();
			}
			else
			{
				System.out.format("%-20s %-15s %-13s",array2[j],count + 1,"not found");
				System.out.println();
			}
		}
		//Binary Search
		System.out.println("\nBinary Search Results:");
		System.out.println("|   Number   |    # of Comps   |     Found?    |");

		for(int i = 0; i < 10; i++)
		{
			boolean found = false;
			int low = 0;
			int high = 99;
			int comparisons = 0;
			int mid = 0 ;

			//ubop
			while (low <= high) 
			{
				comparisons++;
				mid = (low + high) / 2;

				if (array1[mid] < array2[i]) 
				{
					low = mid + 1;
				} 
				else if (array1[mid] > array2[i]) 
				{
					high = mid - 1;
				} 
				else if (array1[mid] == array2[i]) 
				{
					found = true;
					break; 
				}
			}
			if(found)
			{
				System.out.format("%-20s %-15s %-13s",array2[i],comparisons + 1,"found");
				System.out.println();
			}
			else
			{
				System.out.format("%-20s %-15s %-13s",array2[i],comparisons + 1,"not found");
				System.out.println();
			}
		}
	}

	//Method 
	public static void quickSort(int[] array, int low, int high)
	{
		if(array.length <= 0) 
			return;

		if(low >= high) 
			return;

		int left = low;
		int right = high;

		int temp = array[left];   
		while (left < right)
		{
			while(left < right && array[right] >= temp)
				right--;

			array[left] = array[right];

			while(left < right && array[left] <= temp)  
				left++;

			array[right] = array[left];
		}
		array[left] = temp;   
		quickSort(array, low, left-1);
		quickSort(array, left+1, high);

	}
}
/*
 Unsorted List:
928 689 
574 979 785 778 937 108 420 365 
876 66 512 596 896 489 774 839 428 961 
692 688 327 387 515 51 374 38 235 822 
798 270 925 171 360 636 460 874 308 136 
969 483 483 642 346 634 581 161 447 619 
795 179 441 589 171 147 62 779 326 152 
237 997 399 2 122 677 258 471 495 222 
294 860 80 599 880 407 113 260 270 521 
878 741 645 433 599 696 232 427 621 706 

Unsorted Linear Search Results:
|   Number   |    # of Comps   |     Found?    |
252                  100             not found    
-120                 100             not found    
327                  33              found        
706                  100             found        
979                  14              found        
636                  46              found        
103                  100             not found    
66                   22              found        
1031                 100             not found    
327                  33              found        

Sorted List: 
2 38 51 62 66 73 80 108 113 122 
136 147 152 161 171 171 179 205 222 232 
235 237 241 258 260 270 270 294 306 308 
326 327 346 351 360 365 374 387 399 407 
420 427 428 433 441 447 460 471 483 483 
489 495 501 512 515 521 574 581 589 596 
599 599 619 621 634 636 642 645 668 677 
684 688 689 692 696 699 706 741 774 778 
779 785 795 798 822 839 860 874 876 878 
880 896 905 925 928 937 961 969 979 997 

Sorted Linear Search Results:
|   Number   |    # of Comps   |     Found?    |
252                  24              not found    
-120                 2               not found    
327                  32              found        
706                  77              found        
979                  99              found        
636                  66              found        
103                  8               not found    
66                   5               found        
1031                 2               not found    
327                  32              found        

Binary Search Results:
|   Number   |    # of Comps   |     Found?    |
252                  8               not found    
-120                 7               not found    
327                  7               found        
706                  8               found        
979                  7               found        
636                  7               found        
103                  8               not found    
66                   8               found        
1031                 8               not found    
327                  7               found    
 */
