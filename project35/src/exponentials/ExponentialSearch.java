package exponentials;
import java.util.Arrays;
public class ExponentialSearch {
	public static int exponentialSearch(int arr[], int n, int x) {
		if(arr[0] == x)
			return 0;
		int i = 1;
		while(i< n && arr[i]<=x) 
			i=i*2;
			return Arrays.binarySearch(arr , i/2 , Math.min(i, n-1), x);
	}
	public static void main(String args[]) {
		int arr[] = {4,45,44,75,7,20,5};
		int x= 4;
		int  result =exponentialSearch(arr,arr.length,x);
		if (result < 0) {
			System.out.println(x+"is not found in an Array");
		} else
			System.out.println(x+ "is found in array at index" +result);
	}
}
