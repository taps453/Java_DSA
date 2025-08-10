//Remove duplicate from String

package collections;

import java.util.HashSet;
import java.util.stream.Collectors;

public class string_removeDuplicate {

	public static void main(String[] args) {
		String name = "programming";
		remove_duplicate1(name);
		remove_duplicate2(name);
		remove_duplicate3(name);
	}
	
	public static void remove_duplicate1(String name) {
		StringBuilder sb = new StringBuilder();
		HashSet<Character> hs = new HashSet<Character>();
		for(char c : name.toCharArray()) {
			if(!hs.contains(c)) {
				sb.append(c);
			}
			hs.add(c);
		}
		System.out.println(sb.toString());
	}
	
	public static void remove_duplicate2(String name) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if(sb.indexOf(name.valueOf(c)) == -1) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());	
	}
	
	public static void remove_duplicate3(String name) {
		String res = name.chars()
						.mapToObj(c -> String.valueOf((char) c))
						.distinct()
						.collect(Collectors.joining());
		System.out.println(res);
	}
}
