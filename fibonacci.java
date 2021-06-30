import java.io.*;
import java.util.*;
public class fibonacci {
	public static int counter = 0;
	public static int fib(int n) {
	      if ((n == 0) || (n == 1))
	         return n;
	      else
	         return fib(n - 1) + fib(n - 2);
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
			if(i==2)
			{
				System.out.println("i= "+ i + " and the array: " + Arrays.toString(a));
			}
		}
		return a;
	}
///////////////////////////////////////////////////////////////////////////////////
	public static int[] insertionSort(int[] a){
		int temp;
		int pos;
		for (int i=1;i<a.length;i++){ 
			temp = a[i];
			pos = i;
			while (pos>0 && a[pos-1]>temp) {
				//System.out.println(" and the array before while affect: " + Arrays.toString(a));
				a[pos] = a[pos-1]; //counter++;
				pos--;
				System.out.println(" and the array: " + Arrays.toString(a));
			}
			a[pos] = temp;
			System.out.println(" and the array after the while: " + Arrays.toString(a));
			if(true)
			{
				//System.out.println("i= "+ i + " and the array: " + Arrays.toString(a));
			}
		}
		return a;
	}
///////////////////////////////////////////////////////////////////////////////////////
	public static int[] sort(int[] a){
		if (a.length==1) {
			return a;
		} else {
			return merge(sort(Arrays.copyOfRange(a, 0, a.length/2)),sort(Arrays.copyOfRange(a, a.length/2, a.length)));
		}
	}
	////////////////////////////////////////////////////////////////
	public static int[] merge (int[] a, int[] b){
		counter++;
		int[] temp = new int[a.length+b.length];
		int positiona = 0;
		int positionb = 0;
		int positiontemp = 0;
		while (positiona<a.length && positionb<b.length){
			if(a[positiona] <= b[positionb]) {
				//counter++;
				temp[positiontemp] = a[positiona];
				positiona++;
				positiontemp++;
			} else {
				//counter++;
				temp[positiontemp] = b[positionb];
				positionb++;
				positiontemp++;
			}
		}
		while(positiona<a.length) {
			temp[positiontemp] = a[positiona];
			positiona++;
			positiontemp++;
		}
		while(positionb<b.length) {
			temp[positiontemp] = b[positionb];
			positionb++;
			positiontemp++;
		}
		System.out.println(Arrays.toString(a));
		return temp;
	}

//////////////////////////////////////////////////////////////////////////
	public static void hw(int n){
		System.out.print(n+" ");
		if (n>1) {
			if (n%2==0){
				hw(n/2);
			}else {
				hw(3*n+1);
			}
		}
	}
	public static int posMult(int x)
	{
		if(x==0||x%2==0)
		{
			return 1*posMult(x-1);
		}
		else if(x%2==1)
		{
			return x*posMult(x-1);
		}
		else
		{
			return 1;
		}
	}
//////////////////////////////////////////////////////////////////////////
	public static void traverse(int index, int[] a){
		if (a[2*index+1] != -1){
		traverse(2*index+1,a);
		}
		if (a[2*index+2] != -1){
		traverse(2*index+2,a);
		}
			System.out.print(a[index] +"");
		}
	//////////////////////////////////////////////////////////////////////
	 public static int find(int decimal_number)
	    {
	        if (decimal_number == 0)
	        {
	            return 0;
	             
	    }
	        else 
	    {
	         
	        return (decimal_number % 2 + 10 *
	                find(decimal_number / 2));
	    }

	    }
	 public static void bin(int x)
	 {
		 if(x>1)
		 {
			 bin(x/2);
		 }
		 System.out.print(x%2);
	 }
	 /////////////////////////////////////////////////////////////////
	public static void main(String[] args) 
	{
		int [] a= {5,4,3,2,1};
		// TODO Auto-generated method stub
		//System.out.println("Fibbonaci is: " + fib(7));
		//System.out.println(Arrays.toString(Arrays.copyOfRange(a, 0, a.length/2)));
		//System.out.println("the buble srted array is: " + Arrays.toString(bubbleSort(a)));
		//System.out.println("the merge sort array is: " + Arrays.toString(sort(a))+ " counter: " + counter);
		//hw(11);
		System.out.println(insertionSort(a));
		//traverse(0,a);
		//int k=80;
		//System.out.println("binary version for: "+ k + " " + find(k));
		//bin(12);
	}

}