package Apple;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
	public static void main(String[] args) {
		String str = "aaabbcc";
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		
		for(char c : str.toCharArray()) {
			if(hs.containsKey(c)) {
				hs.put(c, hs.get(c) + 1);
			}else {
				hs.put(c, 1);
			}
		}

		StringBuilder sb = new StringBuilder();
		for(Map.Entry<Character, Integer> e : hs.entrySet()) {
			sb.append(e.getKey()).append(e.getValue());
		}
		
		System.out.println(sb.toString());
	}

}
