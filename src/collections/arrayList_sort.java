package collections;

import java.util.*;

public class arrayList_sort {

	public static void main(String[] args) {
		
		List<Integer> al = Arrays.asList(5,0,6,3,1,9,2,7,3);
		int size = al.size();
		
		for(int i = 0; i < size - 1 ; i++) {
			int min_index = i;
			for(int j = i+1; j < size ; j++) {
				if(al.get(j) < al.get(min_index)) {
					min_index = j;
				}
			}
			
			int temp = al.get(min_index);
			al.set(min_index, al.get(i));
			al.set(i, temp);
		}
		System.out.println(al);
	}
}
