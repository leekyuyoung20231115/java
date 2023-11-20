import java.util.Arrays;
import java.util.Iterator;

public class Array04 {

	public static void main(String[] args) {
//		두개의 변수의 값을 서로 바꾸기
//		int x=10, y = 20;
//		int temp = x;
//		x = y;
//		y = temp;
		
		// 랜덤하게 10개의 값을 갖는 정수형 배열 만들기
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100);
		}
		System.out.println("정렬전 : ");
		System.out.println(Arrays.toString(array));
		
		// 1.sort  오름차순... 두개씩 비교해서 뒤에 있는게 작으면 서로 교환
		// 개선할수 있을까요? 정렬이 빨리 끝나면 굳이 계속 반복할 필요가 없을텐데..
		// 1. 정렬이 끝난것을 어떻게 알수 있을까?
		// 2. 정렬이 끝난것을 알아내면.. 밖의 for문을 탈출한다		
		for (int j = 0; j < array.length; j++) {
			for(int i = 0; i < array.length-1; i++) {
				if(array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}			
		} 
		
		System.out.println("정렬후 : ");
		System.out.println(Arrays.toString(array));
		
		

	}

}
