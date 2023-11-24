package s_11_24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComp implements Comparator<Integer>{

	@Override
	public int compare(Integer x, Integer y) {		
		return (x < y)? -1 : 0;
	}	
}


public class Collection01 {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		for (int i = 10; i > 0; i--) {
			num.add(i);
		}
		System.out.println("정렬전");
		System.out.println(num);
		System.out.println("정렬후");
//		num.sort(null);
//		System.out.println(num);
//		System.out.println("정렬후");
		
		MyComp mycomp = new MyComp();
		num.sort(mycomp);
		System.out.println(num);		
	}

}
