package s_11_24;

import java.util.ArrayList;
import java.util.List;

public class For01 {

	public static void main(String[] args) {
		int[] ary = {1,2,3};
		// 인덱스방식은 배열의 값을 읽고 쓸수 있다.
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]); // read
//			ary[i] = 100; // write
		}
		
		System.out.println("for each-----------------------------");
		// 향상된 for문.......
		// for each
		for (int i : ary) {
			System.out.println(i);
		}		
	}

}
