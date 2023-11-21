import java.util.Scanner;

public class NumberGame {
// 검색기본 알고리즘... 바이너리써치... 데이터가 정렬되어 있다고 가정 또는 정렬시킨다음
// 반씩 짤라서 비교한다.	
	public static void main(String[] args) {		
		// 0 < x < 100 에서 랜덤하게 선택하는 정수
		int comp = (int)(Math.random()*101); // 랜던하게 셋팅할것		
		
		while (true) {			
			System.out.println("0~100 사이 정수를 입력하세요");
			Scanner sc = new Scanner(System.in);
			int human = sc.nextInt();
			if(comp == human) {
				System.out.println("정답");
				System.out.println("프로그램 종료");
				break;
			}
			else if(comp>human)
				System.out.println("추측한 값이 작습니다.");
			else
				System.out.println("추측한 값이 큽니다..");
		}
	}

}
