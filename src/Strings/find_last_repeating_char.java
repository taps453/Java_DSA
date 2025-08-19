package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class find_last_repeating_char {

	public static void main(String[] args) {
		String str = "programming";
		System.out.println(lastrepeatchar(str));
	}
	public static Character lastrepeatchar(String str) {
		
		HashMap<Character, Integer> hs = new LinkedHashMap<>();
		for(char c : str.toCharArray()) {
			if(hs.containsKey(c)) {
				hs.put(c, hs.get(c) + 1);
			}else {
				hs.put(c, 1);
			}
		}
		
		for(int i = str.length() - 1; i >= 0; i--) {
			if(hs.get(str.charAt(i)) > 1) {
				return str.charAt(i);
			}
		}		
		return '$';
	}
}
