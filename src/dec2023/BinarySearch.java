package dec2023;

public class BinarySearch {

	
	public static int binarySearch(int[] arr, int x) {
	    int l = 0, r = arr.length - 1;
	    while (l <= r) {
	        int mid = l + (r - l) / 2;
	        if (arr[mid] == x) return arr[mid];
	        if (arr[mid] < x) l = mid + 1;
	        else r = mid - 1;
	    }
	    return -1; // Element not found
	}
	public static void main(String[] args) {
		int []arr= {5,6,1,0,9,8,6,5};
		int target=5;
		System.out.println(binarySearch(arr, target));
	}
}
