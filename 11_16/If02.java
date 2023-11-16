// 사용자 입력을 받아서 짝 홀을 구분

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		System.out.print("정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = (num % 2 ==0)? num+"은 짝수입니다." : num+"은 홀수입니다.";
		System.out.println(str);

	}

}
