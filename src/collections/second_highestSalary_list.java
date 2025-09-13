package collections;

import java.util.Arrays;
import java.util.List;

public class second_highestSalary_list {

	public static void main(String[] args) {
		List<Integer> aList = Arrays.asList(3,1,55,26,35,5,3,2);
		System.out.println(getSalary(aList));
	}
	
	public static int getSalary(List<Integer> al) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int x : al) {
			if(x > first) {
				second = first;
				first = x;
			}
			else if(x > second && x < first) {
				second = x;
			}
		}
		return second;
	}
}
