import java.util.Arrays;

public class InsertionSort
{
	public static int counter;
	public static void main(String args[])
	{
		/**int a[] = {4, 13, 6, 7, 11, 5, 12, 3, 8};
		System.out.println("original array: " + Arrays.toString(a));
		System.out.println("//////////");
		insertionSort(a);
		System.out.println("**********");
		System.out.println("//////////");
		System.out.println("counter: " + counter + " final sorted array: " + Arrays.toString(a));**/
		exam2(3);
	}
	public static int[] insertionSort(int[] a)
	{
		int temp;
		int pos;
		for (int i=1;i<a.length;i++)
		{

			temp = a[i];
			pos = i;
			while (pos>0 && a[pos-1]>temp) 
			{
				counter++;
				a[pos] = a[pos-1];
				pos--;
			}
			a[pos] = temp;
			System.out.println("i: " + i + " array: " + Arrays.toString(a));
			System.out.println("//////////");
		}
		return a;
	}
	public static void exam2(int n){
		if (n%2==0){
			exam2(2*n);
		}
		System.out.println(n);
	}

}
