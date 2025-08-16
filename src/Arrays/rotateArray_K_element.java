package Arrays;

public class rotateArray_K_element {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int[] arr1 = {11,12,13,14,15,16,17};
		int k = 3;
		
		for(int i = 1; i <= k; i++) {
			rotate_right(arr);
		}
		
		print_array(arr);
		
		System.out.println();
		for(int i = 1; i <= k; i++) {
			rotate_left(arr1);
		}
		print_array(arr1);
	}
	
	public static void rotate_left(int[] arr) {
		int n = arr.length;
		int temp = arr[0];
		for(int i = 0; i < n-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
	}
	public static void rotate_right(int[] arr) {
		int n = arr.length;
		int temp = arr[n-1];
		for(int i = n-1; i >= 1; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}
	
	public static void print_array(int[] arr) {
		for(int x : arr) {
			System.out.print(x + " ");
		}
	}
}

