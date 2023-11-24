package s_11_23;

import java.util.Scanner;

public class Exception03 {

	public static void check(int num) throws Exception {
		if(num < 0)
			throw new NumberFormatException("0보다 작습니다.");
		else
			System.out.println(num);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 ");
		int num = s.nextInt();
		try {
			check(num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				

	}

}
