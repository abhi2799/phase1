package bubble;

public class bsort {

	public static void main (String[] args) {
		new bsort().sortArray();

	}
	int[] arr= {28,5,-21,6,49,35 ,45,47,3,5,77,5,4,5,7,457};
	public void sortArray() {
		int size = arr.length;
		for (int i = 1;i < size ; i++) {
			for (int j = 1;j < size ; j++) {
				if (arr[j - 1]>arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("End of iterartion:");
			for (int j = 1;j < size;j++) {
				System.out.println(arr[j] + "");
			}
			
			System.out.println();
		}
		System.out.println("After Sorting");
		for(int i=0;i < arr.length ; i++) {
			System.out.println(arr[i]);

			}
		}

}
