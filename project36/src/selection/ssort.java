package selection;

public class ssort {

	public static void main(String[] args) {
		new ssort().sort();
	}
	int[] arr = {28,5,-21,6,49,3,5,77,14,3,2,0,-1};
	public void sort() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("After Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
