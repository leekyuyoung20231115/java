package s_11_23;

public class Demo01 {

	public static void main(String[] args) {
				
		int result = 0;
		int a = 3;
		try {
					
			result = 5 / a;	
		} catch (ArithmeticException e) {
			e.printStackTrace();
			result = 5 / 2; 
		}		
		System.out.println(result);
		System.out.println("프로그램을 종료합니다.");

	}

}
