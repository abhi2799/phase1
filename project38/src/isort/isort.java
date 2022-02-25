package isort;

public class isort {
	public static void insertionsort(int array[]) {
		int n = array.length;
		for (int j=1;j<n;j++) {
			int key = array[j];
			int i = j-1;
			while ((i>-1) && (array [i] > key)) {
				array[i+1] = array [i];
				i--;
			}
			array [i+1] = key; 
		}
	}
	public static void main (String args[]) {
		int[] arr = {-46,-13,-1,0,2,4,55,72,14,8,5,94,7};
		System.out.println("Before Insertion Sort:");
		for(int i:arr) {
			System.out.println(i+" ");
		}
		System.out.println();
		insertionsort(arr);
		System.out.println("After Insertion Sort:");
		for(int i:arr) {
			System.out.println(i+" ");
			}
	}

}
