/**
 * this is a data structure called a head in which we 
 * so let's d0 5,12,7,1,8,24
 * we start with 5 and then add 12 as a left child node of 5, 7 will be a left child of 
 * 12 and then 1 will be a left child of 5 and 24 will be a right child of 12 
 * @author adopt
 *{4,2,6,1,3,5,7} is how you'd tress 1,2,3,4,5,6,7
 *traverse (pointer)
 *if(left child is nulll}
 *else(traverse to the left child)
 *you print whatever the data is in there
 *if right pointer child is not equal to null 
 *then we traverse the right pointer
 *traverse right pointer of that child
 *************************
 *traverse(pointer)
 *if left pointer is not null then traverse left pointer 
 *print data
 *if right pointer is not null then traverse right pointer
 *
 *********************
 *traverse(int index, int[] a) //this is for an array
 *if(2*index+1 != -1)
 *{
 *	traverse(2*index+! ,a}
 *
 *	print(a[index])
 *}
 *if(index+2 =! -1)
 *{
 *traverse(2*index+2,1)
 *}
 *
 */
public class Tree
{
	public static void main(String args[])
	{
		int [] a = {4,2,6,1,3,5,7,-1,-1,-1,-1,-1,-1,-1,-1};
		traverse(0,a);
	}
	public static void traverse(int index, int[] a)
	{
		if(a[2*index+1]!=-1)
		{
			traverse(2*index+1,a);
		}
		System.out.println(a[index] + " ");
		if(a[2*index+2] != -1)
		{
			traverse(a[2*index+2],a);
		}
	}
}
