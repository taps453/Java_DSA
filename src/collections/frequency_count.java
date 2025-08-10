package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class frequency_count {

	public static void main(String[] args) {
		String str1 = "banana";
		countchar(str1);
	}
	
	public static void countchar(String st){
		char[] new_char = st.toCharArray();
		LinkedHashMap<Character, Integer> hs = new LinkedHashMap<>();
		for(char c : new_char) {
			if(hs.containsKey(c)) {
				hs.put(c, hs.get(c) + 1);
			}else {
				hs.put(c, 1);
			}
		}
		System.out.println(hs);
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<Character, Integer> mp : hs.entrySet()) {
			sb.append(mp.getKey()).append(mp.getValue());
		}
		System.out.println(sb.toString());
	}
}
