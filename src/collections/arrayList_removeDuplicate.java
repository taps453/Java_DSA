//Remove duplicate from ArrayList

package collections;

import java.util.*;
import java.util.stream.Collectors;

public class arrayList_removeDuplicate {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(2,3,8,4,9,1,3,5,6,4,3,2,1));
		duplicate_remove1(al1);
		duplicate_remove2(al1);
		duplicate_remove3(al1);

	}
	
	public static void duplicate_remove1(ArrayList<Integer> al1) {
		ArrayList<Integer> new_list = new ArrayList<Integer>();
		for(int n : al1) {
			if(!new_list.contains(n)) {
				new_list.add(n);
			}
		}
		System.out.println(new_list);
	}
	
	public static void duplicate_remove2(ArrayList<Integer> al1) {
		LinkedHashSet<Integer> hs1 = new LinkedHashSet<Integer>(al1);
		ArrayList<Integer> aL = new ArrayList<Integer>(hs1);
		System.out.println(aL);
	}
	
	public static void duplicate_remove3(ArrayList<Integer> al1) {
		List<Integer> new_list = al1.stream()
									.distinct()
									.collect(Collectors.toList());
		System.out.println(new_list);
	}
}
