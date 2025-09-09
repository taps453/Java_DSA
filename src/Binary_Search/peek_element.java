package Binary_Search;

public class peek_element {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,1,5,1};
		System.out.println(find_Peek_Element(arr));
	}
	
	public static int find_Peek_Element(int[] arr) {
		int left = 0, right = arr.length - 1;
		
		while(left <= right) {
			int mid = left + (right - left) / 2;
			
			if( mid > 0 && mid < right) {
				if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
					return arr[mid];
				}
				else if(arr[mid] > arr[mid - 1]) {
					left = mid + 1;
				}
				else {
					right = mid - 1;
				}
			}
			 // check end cases
			else if(mid == 0) {
				if(arr[0] > arr[1]) {
					return arr[0];
				}else {
					return arr[1];
				}
			}
			
			else {
				if(arr[right] > arr[right - 1]) {
					return arr[right];
				}else {
					return arr[right - 1];
				}
			}
		}
		return -1;
	}
}
