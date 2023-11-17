/*
 * 중첩 for문
 * 	for문에 for문이 있는형태
 */
public class Loop01 {

	public static void main(String[] args) {
//		2번 반복하는 for
		for (int i = 0; i < 2; i++) {
			System.out.println("i = " + i);
//			3번 반복하는 for
			for (int j = 0; j < 3; j++) {
				System.out.print("\tj = "+j);
			}
			System.out.println();
		}

	}

}
