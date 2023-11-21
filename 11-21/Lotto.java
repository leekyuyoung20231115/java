// 자동 1개
// 0 0 0 0 0 0

// 자동 2개
// 0 0 0 0 0 0
// 0 0 0 0 0 0


//Arrays.sort(배열) - 전달한 배열 자체가 오름차순으로 정렬
public class Lotto {	
	public int[] lotto_n = new int[45];
	
	// 로또번호 초기화
	public void initLotto() {
		for (int i = 0; i < lotto_n.length; i++) {
			lotto_n[i] = i+1;			
		}
	}
	
	public void shuffle() {
		for (int i = 0; i < 100; i++) {
			int n =  (int)(Math.random()*45);
			int temp = lotto_n[0];
			lotto_n[0] = lotto_n[n];
			lotto_n[n] = temp;
		}
	}
	 
	public String getGame() {
		String result = "";
		for (int i = 0; i < 6; i++) {
			result += (lotto_n[i] + " ");
		}
		return result;
	}
	
	public String autoLotto(int gameNumber) {
		// 로또번호 초기화
		initLotto();		
		
		String result = "";		
		for (int t = 0; t < gameNumber; t++) {			
			// 잘 섞는다
			shuffle();
			// 섞인다음에 앞에서 6개 선택
			result += getGame() + "\n";
			
		}		
		return result;
	}
}
