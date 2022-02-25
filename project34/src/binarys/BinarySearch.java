package binarys;

public class BinarySearch {
	public static void binarySearch (int arr[],int first,int last, int key) {
		int mid = (first+last)/2;
		while(first<=last) {
			if(arr[mid]<key) {
				first=mid+1;
			} else if (arr[mid]==key) {
				System.out.println(key +" is found at index:" + mid);
				break;
			} else {
				last =mid-1;
			}
			mid=(first+last)/2;
		}
		if (first>last) {
			System.out.println("Element is not found!");
		}
	}
	public static void main(String a[]) {
		int arr[] = {2,72,19,4,7,20,5,94,99,72};
		int key=94;
		int last=arr.length-1;
		binarySearch(arr,0,last,key);
	}
}
