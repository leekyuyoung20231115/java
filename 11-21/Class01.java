
public class Class01 {

	public static void staticMethod() {
		System.out.println("staticMethod");		
	}
	
	
	public  void instanceMethod() {
		System.out.println("instanceMethod");
		staticMethod();
	}
	
	public static void main(String[] args) {
		staticMethod();
//		instanceMethod();
		
	}

}
