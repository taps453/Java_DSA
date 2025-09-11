package Arrays;

public class second_highest_lowest {

	public static void main(String[] args) {
		int[] arr = {10, 20, 4, 45, 99};
		int[] arr1 = {12, 35, 1, 10, 34, 1};
		int[] arr2 = {12, 13, 1, 10, 34, 10};
		int[] arr3 = {5,5,5,5};
		
		System.out.println(second_highest(arr));
		System.out.println(second_highest(arr1));
		System.out.println(second_highest(arr2));
		System.out.println(second_highest(arr3));
		
		System.out.println(second_lowest(arr));
		System.out.println(second_lowest(arr1));
		System.out.println(second_lowest(arr2));
		System.out.println(second_lowest(arr3));
	}
	
	public static int second_highest(int[] arr) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > first) {
				second = first;
				first = arr[i];
			}
			else if(arr[i] > second && arr[i] < first) {
				second = arr[i];
			}
		}
		return second;
	}
	
	public static int second_lowest(int[] arr) {
		int first_min = Integer.MAX_VALUE;
		int second_min = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < first_min) {
				second_min = first_min;
				first_min = arr[i];
			}
			else if(arr[i] < second_min && arr[i] > first_min) {
				second_min = arr[i];
			}
		}
		if(second_min == Integer.MAX_VALUE) {
			throw new IllegalArgumentException("No unique element");
		}
		return second_min;
	}
}
