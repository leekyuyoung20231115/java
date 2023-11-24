package s_11_24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Set01 {
	
	// 메소드
	public static List<Integer> makeOneGame() {
		Set<Integer> se = new HashSet<Integer>();
		while (true) {
			int temp = (int)(Math.random()*45)+1;
			if(se.size()>6)
				break;
			se.add(temp);
		}
		List<Integer> temp = new ArrayList<Integer>(se);
		return temp;
	}

	public static void main(String[] args) {
		// 리스트와 셋의 속성 확인하기
		// 10번 데이터를 임의로 저장하면 set은 중복을 허용하기 않기때문에
		// 데이터가 10개가 안될수도 있다
		List<Integer> li = new ArrayList<Integer>();
		Set<Integer> se = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			int temp = (int)(Math.random()*9);
			li.add(temp);
			se.add(temp);
		}
		
		
		// li의 모든 요소를 출력
		// se의 모든 요소를 출력
		// 로또번호 생성하기
		int gamenum = 3;
		// set객체를 이용해서 데이터가 6개 쌓일때까지 랜덤하게 데이터를 추가한다.
		// 그렇게 추가한 데이터를 gamenum 수 만큼 리스트에 저장한다.
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		for (int i = 0; i < gamenum; i++) {
			se = new HashSet<Integer>();
			while (true) {
				int temp = (int)(Math.random()*45)+1;
				if(se.size()>6)
					break;
				se.add(temp);
			}
			List<Integer> sortedLists = new ArrayList<Integer>(se);
			sortedLists.sort(null);			
			lists.add(sortedLists);			
		}
		System.out.println(lists);

		//  2..
		// 1번과 동일한 방법인데.. while 하나만 사용하고
		// 6개가 될때까지 순환하면서 이때 리스트에 저장하고
		// 저장한 후에는 다시 중복없는 6개를 만들어야 하기때문에
		// Set객체를 초기화 한후에 반복한다.
		// 이때 set으로 만든 데이터를 리스트에 저장하는데 gamenum수 만큼 저장한다.
		List<Set<Integer>> lotto = new ArrayList<Set<Integer>>();
		se = new HashSet<Integer>();
		while (true) {
			int temp = (int)(Math.random()*45)+1;
			if(se.size()>6) {
				if(lotto.size() > gamenum)
					break;
				lotto.add(se);				
				se = new HashSet<Integer>();  // 초기화
			}
			se.add(temp);
		}
		System.out.println(lotto);
		
		// 3.   로또번호를 set을 이용해서 만드는데.. 이 로직을 메소드로 분류하고
		// 이 메소드를 gamenum만큼 실행한다.
		for (int i = 0; i < gamenum; i++) {
			System.out.println(makeOneGame());
		}
		

	}

}
