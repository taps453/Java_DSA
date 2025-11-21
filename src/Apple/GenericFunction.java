package Apple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GenericFunction {
	
//	public static <T> T printAndReturn(T data) {
//		System.out.println(data);
//		return data;
//	}
	
	public static void main(String[] args) {
//		Integer i = printAndReturn(100);
//		String s = printAndReturn("Anand");
//		Double d = printAndReturn(12.44);	
		
		String s = "a3b3c4";
		if(s == null || s.isEmpty()) {
			System.out.println("String is empty");
		}
		
		List<Character> res = new ArrayList<Character>();
		char prev = '0';
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(Character.isLetter(c)) {
				prev = c;
			}else if (Character.isDigit(c)) {
				int count = Character.getNumericValue(c);
				for(int j = 0; j < count ;j++) {
					res.add(prev);
				}
			}
//			BufferedReader reader = new BufferedReader(new FileReader(inputFile)))

		}
		System.out.println(res);
		StringBuilder sb = new StringBuilder();
		for(char c : res) {
			sb.append(c);
		}
		System.out.println(sb.toString());
	}
}

