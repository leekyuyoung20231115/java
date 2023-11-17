
public class Loop02 {

	public static void main(String[] args) {
//		구구단 중에 5단 출력
//		5 x 1 = 5
//		5 x 2 = 10
//		...
//		5 x 9 = 45
//		고정된 부분과 변경되는 부분(변수)을 구분해서 순환문 형태로 표현
//		총 몇번 순환하는 문장인지? 
		for (int dan = 2; dan < 10; dan++) {
			for (int i = 1; i < 10; i++) {
				System.out.format("%d x %d = %d\n", dan,i, dan*i);
			}
		}
	}
}
