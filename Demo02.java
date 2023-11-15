
public class Demo02 {

	public static void main(String[] args) {
		// 0 ~ 1사이의 실수값을 랜덤하게 출력
		int a = (int)(Math.random()*5); 
		int b = (int)(Math.random()*5);
		
		System.out.println(a);		
		System.out.println(b);
		// 1. 실수를 정수로 -> 2
		// 2. 범위를 조정  -> 1
				
		System.out.println(a> b); 
		System.out.println(!(a > b));
		System.out.println((a==b) && (a == 3));
		System.out.println((a!=b) && (a == 3));
		System.out.println(!((a==b) && (a == 3)));
		

	}

}
