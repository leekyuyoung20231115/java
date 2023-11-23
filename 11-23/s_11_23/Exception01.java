package s_11_23;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");		
		while (true) {
			try {
				int num1 = Integer.valueOf(sc.nextLine());
				int num2 = 10 / num1;
				System.out.println(num2);
				break;
			} catch (Exception e) {
				System.out.println("올바른 숫자를 입력하세요");
//				System.out.println(e.getMessage());
//				e.printStackTrace();
			}			
		}
		
		System.out.println("try~catch 블럭의 외부 문장입니다.");
		
	}

}
