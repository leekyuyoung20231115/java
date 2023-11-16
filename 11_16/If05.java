import java.util.Scanner;

public class If05 {

	public static void main(String[] args) {
		System.out.print("3개의 숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if( (x > y) && (x > z) ) {
			System.out.println(x + " 는 가장 큰 수입니다.");
		}else {
			System.out.println(x + " 는 가장 큰 수가 안입니다.");
		}
		
//		if(x > y) {
//			if(x > z) {
//				System.out.println(x + " 는 가장 큰 수입니다.");
//			}
//			else {
//				System.out.println(x + " 는 가장 큰 수가 안입니다.");
//			}
//		}
//		else {
//			System.out.println(x + " 는 가장 큰 수가 안입니다.");
//		}
		

	}

}
