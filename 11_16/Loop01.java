// 사용자로부터 값을 입력받아 누적 합

import java.util.Scanner;

public class Loop01 {

	public static void main(String[] args) {
		int sum = 0;  // 합을 구할 변수
		Scanner sc = new Scanner(System.in); //사용자 입력
		System.out.println("5개의 정수를 입력하세요");
		// 5번 순환
		for (int i = 0; i < 5; i++) {			
			int number =  sc.nextInt();
			sum += number;
//			sum = sum + number;
		}
		System.out.println("총 합은 : "+sum);

	}

}
