import java.util.Arrays;

public class QuickSort 
{
	public static int arr[] = {4, 13, 6, 7, 11, 5, 12, 3, 8};
	public static int partition(int [] arr, int beg, int end)
	{
		int x=arr[end];
		int less = beg-1;
		for(int j=beg;j<=end-1;j++)
		{
			if(arr[j]<x)
			{
				less++;
				int temp=arr[less];
				arr[less]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[less+1];
		arr[less+1]=arr[end];
		arr[end]=temp;
		System.out.println("less: " + (less) + " " + Arrays.toString(arr));
		return(less+1);
	}
	
	public static int [] quickSort(int[] arr, int beg, int end)
	{
		if(beg<end)
		{
			int a = partition(arr,beg,end);
			System.out.println(a);
			//System.out.println(a);
			quickSort(arr,beg,a-1);
			//System.out.println(Arrays.toString(arr));
			quickSort(arr,a+1,end);
			//System.out.println(Arrays.toString(arr));
		}//
		return arr;
	}
	public static void main(String args[])
	{
		quickSort(arr,0,arr.length-1);
		//System.out.println("final: "+ Arrays.toString(arr));
		//int x = 84%31;
		//System.out.println(x);
	}
}
