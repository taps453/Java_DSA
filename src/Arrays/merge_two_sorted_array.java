package Arrays;
import java.util.*;

public class merge_two_sorted_array {

	public static void main(String[] args) {
		int[] a = {1,3,5,7};
		int[] b = {2,4,6,8};
		merge_array(a, b);
		System.out.println();
		merge_array1(a, b);

	}
	
	public static void merge_array(int[] a,int[] b) {
		int n1 = a.length;
		int n2 = b.length;
		int[] new_array = new int[n1+n2];
		
		for(int i = 0; i < n1; i++) {
			new_array[i] = a[i];
		}
		for(int j = 0; j < n2; j++ ) {
			new_array[j+n1] = b[j];
		}
		Arrays.sort(new_array);
		for(int x : new_array) {
			System.out.print(x + " ");
		}
	}
	
	public static void merge_array1(int[] a , int[] b) {
		int n1 = a.length;
		int n2 = b.length;
		int[] new_array = new int[n1+n2]; 
		
		int i = 0, j = 0, k = 0;
		while(i < n1 && j < n2) {
			if(a[i] <= b[j]) {
				new_array[k] = a[i];
				k++;
				i++;
			}else {
				new_array[k] = b[j];
				k++;
				j++;
			}
		}
		
		while(i < n1) {
			new_array[k] = a[i];
			k++;
			i++;
		}
		while( j < n2) {
			new_array[k] = b[j];
			k++;
			j++;
		}
		for(int x : new_array) {
			System.out.print(x + " ");
		}
	}
}
