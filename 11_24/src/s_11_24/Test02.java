package s_11_24;

import java.util.ArrayList;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		List<List<Integer>> allLists = new ArrayList<List<Integer>>();
		List<Integer> lists = new ArrayList<Integer>();
//		lists.add(10);lists.add(20);
//		System.out.println(lists);
//		lists.clear();
//		System.out.println(lists);		
		
		for (int i = 0; i < 3; i++) {
//			lists.clear();
			lists = new ArrayList<Integer>();
			for (int j = 0; j < 3; j++) {
				lists.add(  (int)(Math.random()*10)  );
			}
			allLists.add(lists);			
		}
		// 출력
		System.out.println(allLists);

	}

}
