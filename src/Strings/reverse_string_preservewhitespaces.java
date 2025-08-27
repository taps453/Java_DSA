package Strings;

public class reverse_string_preservewhitespaces {

	public static void main(String[] args) {
		String str = "Hi Anand";
		System.out.println(reverse_string(str));
	}
	
	public static String reverse_string(String str) {
		int left = 0, right = str.length() -1;
		char[] new_char = str.toCharArray();
		
		while(left < right) {
			if(new_char[left] == ' ') {
				left++;
				continue;
			}else if (new_char[right] == ' ') {
				right--;
				continue;
			}else {
				char temp = new_char[left];
				new_char[left] = new_char[right];
				new_char[right] = temp;
				left++;
				right--;
			}
		}
		return String.valueOf(new_char);
	}
}