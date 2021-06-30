import java.util.Arrays;
//ccccccxcxc
public class HeapSort 
{
	public static void main(String args[])
	{
		int test[] = {4, 13, 6, 7, 11, 5, 12, 3, 8};
		heapSort(test,test.length);
		//System.out.println(Arrays.toString(test));
	}
	public static void heapSort(int a[], int maxSize)
	{
		int temp;
		buildHeap(a,maxSize);
		for (int i =maxSize-1;i>0;i--) 
		{
			temp=a[0];
			a[0] = a[i];
			a[i] = temp;
			heapify(a,0,i);// because our heap will get smaller and smaller as we go
		}
	}
	public static void buildHeap(int [] a, int maxSize)
	{
		for(int i=maxSize/2 -1; i>=0;i--)
		{
			heapify(a,i,maxSize);
		}
	}
	public static void heapify(int[] a, int pos,int maxSize)
	{
		int largest;
		if(leftChild(pos) <maxSize && a[leftChild(pos)]>a[pos])
			//we are asking if the left child is not the last one and that the left child is greater than the parent
		{
			largest=leftChild(pos);
		}
		else
		{
			largest=pos;
		}
		if(rightChild(pos)<maxSize && a[rightChild(pos)]>a[largest])
		{
			largest = rightChild(pos);
		}
		//what if both its children are smaller than the parent
		if(largest != pos)
		{
			int temp = a[pos];
			a[pos]=a[largest];
			a[largest]= temp;
			heapify(a, largest,maxSize);
		}
		System.out.println(Arrays.toString(a));
	}
	public static int leftChild(int n)
	{
		return(2*n+1); //returns data of the left child
	}
	public static int rightChild(int n)
	{
		return (2*n+2); // returns teh right child data of teh parent 
	}
}
