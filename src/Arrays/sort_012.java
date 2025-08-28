package Arrays;

public class sort_012 {

	public static void main(String[] args) {
		
		int[] arr = {1,0,2};
		int high = arr.length - 1;
		int low = 0, mid = 0;
		
		while(low < high) {
			if(arr[mid] == 0) {
				swap(arr,low,mid);
				low++;
				mid++;
			}
			else if(arr[mid] == 1) {
				mid++;
			}
			else {
				swap(arr, mid, high);
				high--;
			}
		}	
		for(int x : arr) {
			System.out.print(x + " ");
		}
	}

	private static void swap(int[] arr, int low, int mid) {
		int temp = arr[mid];
		arr[mid] = arr[low];
		arr[low] = temp;
	}

}
