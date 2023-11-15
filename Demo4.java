import java.util.Scanner;

public class Demo4 {
	/*
	 * 윤년계산기
	 * 1. 사용자로부터 년도를 입력받는다
	 * 2. 윤년계산법칙을 적용해서 해당 년도가 윤년인지 판단한다
	 * 율리우스력의 윤년 추가 규칙은 다음과 같다.
		4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년으로 한다.
		
		그레고리력은 다음과 같은 예외 규칙을 추가하였다.
		100으로 나누어 떨어지되 400으로 나누어 떨어지지 않는 해는 평년으로 한다.
		
	 */
	public static void main(String[] args) {
		// 입력객체를 생성
		Scanner sc = new Scanner(System.in);
		// 키보드로부터 입력받은것을 정수로 변환해서 변수 year에 대입
		System.out.println("년도를 입력하세요(ex 2023) : ");
		int year = sc.nextInt();		
		
//		year % 4 == 0  윤년		
//		!( (year % 100 == 0) && (year % 400!=0) )  윤년
		
		boolean isYoonYear = (year % 4 == 0) &&
				((year % 100 != 0) || (year % 400==0));
		
		System.out.println(isYoonYear);
	}

}
