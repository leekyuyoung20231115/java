package s_11_23;

import java.util.Scanner;

class CustomInvalidData extends Exception{

	public CustomInvalidData(String string) {
		super(string);
	}		
	
}


public class Exception04 {

	public static void checkNumber(int number) throws CustomInvalidData {
		if( !((number >0) && (number%2 == 0)) )
			throw new CustomInvalidData("잘못입력했습니다.");
	}
	public static void main(String[] args) {
		// 사용자로부터 정수이면서 짝수만 받아오기
		Scanner sc = new Scanner(System.in);
		System.out.println("짝수인 양수를 입력하세요 단 정수만.");
		int number = sc.nextInt();
		// 짝수이면서 양수를 체크하는 메소드를 만들고 호출하기
		try {
			checkNumber(number);
		} catch (CustomInvalidData e) {
			System.out.println("처리완료");
			e.printStackTrace();
		}
		
		

	}

}
