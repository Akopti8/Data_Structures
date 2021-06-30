import java.util.Arrays;
public class factorial {
	
	int[] one= {1,3,4,7,9};
	int[] two= {2,3,4,6,8};
	
	public static int factorial1(int n)
	{
		if(n==1) 
		{
			return n;
		}
		else
		{
			return(n*factorial1(n-1));
		}
	}
	
	
//if I change the * to a + it will add up all the numbers under and equal to the number u inputted 
	public static int factorial2(int n)
	{
		if(n==1) 
		{
			return n;
		}
		else
		{
			return(n+factorial2(n-1));
		}
	}
	
	public static int power(int base, int exp)
	{
		if(exp==1)
		{
			return base;
		}
		else 
		{
			return base*power(base,exp-1);
		}
	}
	/**public static int[] merge(int[] a, int[]b)
	{
		
		int[] temp = new int[a.length+b.length];
		int positiona = 0;
		int positionb = 0;
		int positiontemp = 0;
		while(positiona < a.length && positionb < b.length)
		{
			if(a[positiona]<=b[positionb])
			{
				positiontemp= a[positiona];
				positiona++;
				positiontemp++;
			}
			else
			{
				temp[positiontemp]=b[positionb];
				positionb++;
				positiontemp++;
			}
			while(positiona<a.length)
			{
				temp[positiontemp]= a[positiona];
				positiona++;
				positiontemp++;
				
			}
			while(positiona<b.length)
			{
				temp[positiontemp]= b[positiona];
				positionb++;
				positiontemp++;
				
			}
			return temp;
		}
	}
	/**
	 * power10 will be power 5 power 5 
	 * the first power 5 will split into power 2 and power 3 
	 * the second will do the same thing 
	 * power 2 will split into power 1 and power 1 
	 * power3 will split into pow 2 and pow 1\
	 * pow 2 will split into pow 1 and pow 1 
	 * @param base
	 * @param exp
	 * @return
	 */
	public static int power1(int base, int exp)
	{
		if(exp==1)
		{
			return base;
			
		}
		else
		{
			return power1(base, exp/2) *power1(base, exp-exp/2);
		}
	}
	public static int[] sort(int[] a)
	{
		if(a.length==1)
		{
			return a;
		}
		else
		{
			return merge(sort(Arrays.copyOfRange(a, 0, a.length/2)), sort(a,a.length/2,a.length));
												//the first index is included and the second is excluded 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial1(6));
		System.out.println(factorial2(6));
		System.out.println(power(2,10));
		System.out.println(power1(2,10));
		//System.out.println(Arrays.toString(merge(one,two)));
	}

}
