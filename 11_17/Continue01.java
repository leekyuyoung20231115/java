
public class Continue01 {

	public static void main(String[] args) {
		// continue를 이용해서 0과 10까지중에 짝수만 출력
		for (int i = 0; i <= 10; i++) {
			if(i%2 != 0)
				continue;
			System.out.println(i);
		}

	}

}
