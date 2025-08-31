package OOPS;

public class Overloading {
	
	
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static double add(double a, double b) {
		return a+ b;
	}
	public static void main(String[] args) {
		
//		father obj = new son();
//		obj.whoAMI();
		System.out.println(add(1, 3));
		System.out.println(add(2, 4.0));
		System.out.println(add(1, 2, 3));
	}

}
