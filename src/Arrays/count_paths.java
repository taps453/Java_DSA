package Arrays;

public class count_paths {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(path_count(n));
	}
	
	public static int path_count(int n) {
		if(n == 0) {
			return 1;
		}
		if(n < 0) {
			return 0;
		}
		return path_count(n-1) + path_count(n-2) + path_count(n-3);
	}
}
