package Strings;

public class upper_lower_case {

	public static void main(String[] args) {
		String str = "HeXaWarE";
		StringBuilder sb = new StringBuilder();
		
		for(char c : str.toCharArray()) {
			if(Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			}
			if(Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			}
		}
		System.out.println(sb.toString());
	}
}