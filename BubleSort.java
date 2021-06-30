/**
 * we should not pass through an array and make a new temp array to and then sort
 * that temp array and make the original array equal to it, because what we really 
 * did was make a pointer to a new array, sort the new array and then point the
 * original one to the temp array, so our original array was not sorted!
 * 
 * @author Anton M. Kopti
 *
 */
import java.util.*;
public class BubleSort {
	public static int counter=0; 
//the worst case scinario is array that is is in order but reverse
	public static int[] bSort(int [] lst)
	{
		for(int i=0; i<lst.length -1;i++)
		{
			for(int j=0; j<lst.length -1-i;j++)//we say -i because when buble sorting the last element each recursion will be the largest one so the first time we run it the last element will be the largest element, the second time we run the for loop the second to last will be the largest element ..etc
			{
				if(lst[j]>lst[j+1]) {
					counter++;
					int temp = lst[j+1];
					lst[j+1] = lst[j];
					lst[j]=temp;
					
				}
				
			}
			System.out.println("arrat at i= " + i + " " +Arrays.toString(lst));
		}
		return lst;
	}
	public static int[] bubbleSort (int[] a){
		int temp;
		for (int i=0; i<a.length-1;i++){
			for (int j=0;j<a.length-1-i;j++){
				if (a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			System.out.println("i: " + i + " " + Arrays.toString(a));
		}
		return a;
	}

	
	
	/**
	 * insertion sort: 
	 * we take an array and start inserting each element 
	 * into a new array, but everytime we do it we check if it is greater than 
	 * the previously added number
	 * 
	 * or we can do it with the same array
	 * we can just take the same array and do the same algorithim 
	 * but this way we need to make sure we don't loose data!
	 * because we are shifting positions within the same array 
	 * 
	 * this is equivilant to buble sort and is an n^2 algorithim 
	 * 
	 * 
	 */
	
	/**
	 * the card example 
	 * in which we devide the cards into sets until 
	 * this is called a merge sort 
	 */
	
	
	/**
	 * n! = n(n-1)
	 * 1!= 1 //base case 
	 * 
	 * the programming part:
	 */
	public static void exam(int n){	
		if (n>1) {
			if (n%2==0){
				exam(n/2);
			}else {
				exam(3*n+1);
			}
		}
		System.out.print(n+" ");
	}
	public static void exam2(int n){
		if (n%2==1){
			exam2(2*n);
		}
		System.out.println(n);
	}

public static void traverse(int index, int[] a){
	

		if (a[2*index+1] != -1){
			traverse(2*index+1,a);
		}
		if (a[2*index+2] != -1){
			traverse(2*index+2,a);
		
	}
	System.out.print(a[index] + " ");

}

	public static int final1(int n)
	{
		if(n==0) {
			return 1;
		}
		else
		{
			return 2*final1(n-1);
		}
	}
	public static void main(String args[])
	{
		int [] a = {4, 13, 6, 7, 11, 5, 12, 3, 8};
		
		//System.out.println(Arrays.toString(bubbleSort(a)) + " counter: " + counter);
		//exam2(-5);
		//int[] a = {4, 2, 6, 1, 3, 5, 7, -1, -1, -1, -1, -1, -1, -1, -1};
		//traverse(0,a);
		System.out.println(final1(6
				));
	}
	
	
	
}
