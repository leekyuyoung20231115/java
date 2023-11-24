package s_11_23;

import java.util.Scanner;

public class Test010 {

	public static void main(String[] args) {
//		char c = '1';
		// 숫자형 문자를 정수로 변환
//		int number = Character.getNumericValue(c);
		// try~catch
		// 문자열 순환  for		
		// 사용자로부터 숫자와문자가 섞인 데이터를 입력받는다
		// ex  1 adsf 222 1de1 222 
		// 여기서 숫자만 골라서 그 숫자들의 합을 구해보자.
		
//		char a = 'a';
//		System.out.println(a);
//		System.out.println(a+1);
//		System.out.println((a >= 48) && (a <= 58));
//		a += 1;
//		System.out.println(a); // b
//		a -= 32;
//		System.out.println(a); // B
//		
//		// sdajfeij843md843klsd
//		Character.isDigit(a);
		
				
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자가 섞인 문자열을 입력하세요");
		String strNumber = sc.nextLine();
		String[] strArrays =  strNumber.split(" ");
		
		int hap = 0;  // 문자열에 있는 숫자들의 합 
		
		for (int i = 0; i < strArrays.length; i++) {
			try {
				int number = Integer.valueOf(strArrays[i]);
				hap += number;
			} catch (Exception e) {
//				e.printStackTrace();
			}
		}
		System.out.println("문자열에 있는 숫자들의 합은 : "+hap);
		
		

	}

}
