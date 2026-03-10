import java.util.*;
public class Main{
	public static void main(String[] args) {
		int[] arr = { 1,-1,2,-2,4,5,-3,-44,1,4,-2};
		List<Integer> pos = new ArrayList<>();
		List<Integer> neg = new ArrayList<>();
		for(int x : arr) {
		    if(x >= 0) {
		        pos.add(x);
		    } else {
		        neg.add(x);
		    }
		}
		int i = 0; int j = 0; int k = 0;
		int[] new_arr = new int[arr.length];
		while(i < neg.size() && j < pos.size()) {
		    new_arr[k++] = neg.get(i++);
		    new_arr[k++] = pos.get(j++);
		}
		while(i < neg.size()) {
		    new_arr[k++] = neg.get(i++);
	    }
	    while(j < pos.size()) {
		    new_arr[k++] = pos.get(j++);
	    }
		for(int n : new_arr) {
		    System.out.print( n + " ");
		}
	}
}






package Collection;

public class string_TransForm {

	public static void main(String[] args) {
		
		String name = "My name is so and so";
		String new_name = name.replaceAll(" ", "-");
		System.out.println("{" + new_name + "}");
		
		
		StringBuilder sb = new StringBuilder();
		String[] str = name.split(" ");
		for(int i = str.length -1; i >= 0 ; i--) {
			sb.append(str[i] + " ");
		}
		System.out.println(sb.toString());
		
		
		
		String name1 = "hello world Again";
		StringBuilder sb1 = new StringBuilder();
		for(int i = name1.toLowerCase().length() - 1; i >= 0 ; i--) {
			sb1.append(name1.charAt(i));
		}
		System.out.println(sb1.toString());
		
		
		
		String name2 = "hello world Again";
		String[] new_String = name2.split(" ");
		StringBuilder sb2 = new StringBuilder();
		for(String s : new_String) {
			for(int i = s.length() - 1; i >= 0; i--) {
				sb2.append(s.charAt(i));
			}
			sb2.append(" ");
		}
		System.out.println(sb2.toString());
		
		
		String name3 = "hello world Again";
		String str1 = "";
		for(int i = name3.length() - 1; i >= 0 ; i--) {
			str1 += name3.charAt(i);
		}
		System.out.println(str1);
	}
}


package interview;

import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class remove_Duplicate {

	public static void main(String[] args) {
		int[] arr = {2,3,4,3,4,2,5,5,6,5,1,3,2,6,7,8,6,8};
		String str = "Hello World Hello Again Hello Again";
//		System.out.println(countOccurance(arr));
		System.out.println(countWordOccurance(str));
	}
	

	public static List<Integer> countOccurance(int[] arr) {
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		for(int n : arr) {
			if(hs.containsKey(n)) {
				hs.put(n, hs.get(n) + 1);
			} else {
				hs.put(n, 1);
			}
		}
		
		System.out.println(hs);
		
		List<Integer> lst = new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> entry : hs.entrySet()) {
			lst.add(entry.getKey());
		}
		return lst;
	}
	
	
	public static HashMap<String, Integer> countWordOccurance(String str) {
		String[] new_String = str.split(" ");
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		for(String st : new_String) {
			if(hs.containsKey(st)) {
				hs.put(st, hs.get(st) + 1);
			} else {
				hs.put(st, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : hs.entrySet()) {
			if(entry.getValue() >= 2) {
				System.out.println(entry.getKey());
			}
		}
		return hs;
	}
	
	
	public static void removeDuplicate() {
		int[] array = {4,5,4,2,2,3,1};
		Set<Integer> new_Set = new LinkedHashSet<>();
	
		for(int n : array) {
			
		}
	}
}
