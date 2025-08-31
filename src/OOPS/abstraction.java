package OOPS;

class Test implements Interface_A, Interface_B{
	
	public void car() {
		System.out.println("This is a car");
	}
	
	public void Bike() {
		System.out.println("This is a Bike");
	}
	
	public void print_Name() {
		System.out.println("Anand");
	}
}

public class abstraction{
	public static void main(String[] args) {
		Test obj = new Test();
		obj.car();
		obj.Bike();
		obj.print_Name();
	}
}
