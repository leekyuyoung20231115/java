/*
 *   System.out.print("*") 문장을 이용해서  가로 3 세로 3의 사각형모양
 */
public class Loop03 {

	public static void main(String[] args) {
//		for (int t = 0; t < 3; t++) {
//			for (int i = 0; i < 3; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}	
//		for (int t = 0; t < 3; t++) {
//			for (int i = 0; i < t+1; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for (int t = 3; t > 0; t--) {
			for (int i = 0; i < t; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
