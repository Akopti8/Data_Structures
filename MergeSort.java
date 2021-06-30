import java.util.Arrays;

public class MergeSort 
{
	public static int counter;
	public static void main(String args[])
	{
		int [] a = {8,7,6,5,4,3,2,1,7,9};
		a=sort(a);
		System.out.println(Arrays.toString(a) + " counter: " + counter + " length: " + a.length);
	}
	public static int[] sort(int[] a){
		if (a.length==1) {
			return a;
		} else {
			return merge(sort(Arrays.copyOfRange(a, 0, a.length/2)),sort(Arrays.copyOfRange(a, a.length/2, a.length)));
		}
	}
	public static int[] merge (int[] a, int[] b){
		//counter++;
		int[] temp = new int[a.length+b.length];
		int positiona = 0;
		int positionb = 0;
		int positiontemp = 0;
		while (positiona<a.length && positionb<b.length){
			if(a[positiona] <= b[positionb]) {
				temp[positiontemp] = a[positiona];
				positiona++;
				positiontemp++;
			} else {
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
		return temp;
	}

}
