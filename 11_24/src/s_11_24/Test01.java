package s_11_24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
		// 1
		List<Integer> lists = new ArrayList<Integer>();		
		for (int i = 0; i < 10; i++) {
			int number = (int)(Math.random()*15);
			lists.add(number);			
		}		
		
		for (Integer x : lists) {
			System.out.print(x + " ");
		}
		System.out.println();
		// 2
		Set<Integer> se = new HashSet<Integer>(lists);
		lists = new ArrayList<Integer>(se);
		for (Integer x : lists) {
			System.out.print(x + " ");
		}
		

	}

}
