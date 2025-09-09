package Binary_Search;

public class count_Element_Freq {

	public static void main(String[] args) {
		int[] arr = {1,2,5,5,5,5,67,123,125};
		int  k = 5;
		int first = find_First_Index(arr, k);
		int last = find_Last_Index(arr, k);
		System.out.println(last - first + 1);

	}
	
	public static int find_First_Index(int[] arr, int k) {
		int left = 0, right = arr.length - 1;
		int idx  = -1;
		
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(arr[mid] == k) {
				idx = mid;
				right = mid - 1;
			}
			else if(arr[mid] < k) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return idx;
	}
	
	public static int find_Last_Index(int[] arr, int k) {
		int left = 0, right = arr.length - 1;
		int idx  = -1;
		
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(arr[mid] == k) {
				idx = mid;
				left = mid + 1;
			}
			else if(arr[mid] < k) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return idx;
	}
}
