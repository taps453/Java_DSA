package Binary_Search;

public class find_element_reverseSortedArray {

	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5,4,3,2,1};
		int target = 1;
		System.out.println(search_Element(arr, target));

	}
	public static int search_Element(int[] arr, int target) {
		int left = 0, right = arr.length - 1;
		
		while(left <= right) {
			int mid = left + (right - left) / 2;
			
			if(arr[mid] == target) {
				return mid;
			}
			else if (arr[mid] < target) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return -1;
	}

}
