// 펙토리얼..
// 5!   5*4*3*2*1 --> 1*2*3*4*5
// 사용자로부터 정수를 입력받아서(ex 4)
// 펙토리얼을 구한다.... 1*2*3*4
// hint  
// Scanner,  for문을 사용자가 입력한 숫자만큼 순환한다.
// for문 안에서 1*2*3*4 를 적용한다.

import java.util.Scanner;

// 

public class Loop02 {

	public static void main(String[] args) {
		int total = 1;  // Factorial
		String str = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("펙토리얼값을 입력하세요");
		int number =  sc.nextInt();
		for (int i = 1; i <= number; i++) {
			total *= i;			
			// 애초에 만들때 불필요한 부분이 없도록 조건문을 써서
			// 두번째 부터 *를 붙인다
//			if(i == 1)
//				str += i;
//			else
//				str += ("*"+i); 
			str += ("*"+i);
			
		}
		// 결과가 *1*2.... 앞에 불필요한 *가 포함되었으나. 없애는 방법은
		// 아래코드처럼 필요한 부분만 잘라낸다
//		str = str.substring(1);
		System.out.println(str + " : " + total);
	}

}
