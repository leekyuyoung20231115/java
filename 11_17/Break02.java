
public class Break02 {

	public static void main(String[] args) {
		// 중첩 순환문에서 탈출
		boolean flag = false;
		for (int i = 0; i < 2; i++) {			
			System.out.print("i : "+i);
			for (int j = 0; j < 3; j++) {
				if(j == 1) {
					flag = true;
					break;
				}
				System.out.format(" j : %d", j);
			}
			
			if(flag) break;			
			System.out.println();			
		}

	}

}
