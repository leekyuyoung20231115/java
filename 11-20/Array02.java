import java.util.Arrays;

public class Array02 {
//	배열의 개수를 전달하면 임의의 정수형 배열을 리턴하는 메소드
	public static int[] makeArray(int size) {
		int[] temp = new int[size];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (int)(Math.random()*100);
		}
		return temp;
	}
//	배열을 받아서 최대값을 리턴하는 메소드
	public static int getMaxValue(int[] array) {
		int max = array[0];  // 배열의 첫번째 값으로 초기화(기준데이터)
		// 최대값 찾기
		for (int i = 0; i < array.length; i++) {
			if(max < array[i] )
				max = array[i];
		}
		return max;
	}
	
	// 배열 요소를 출력하는 메소드
	public static void printArray(int[] array) {
		System.out.println( Arrays.toString(array) );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 정수형 배열 5개  적당한 값으로 초기화
//		2. 최대값
//		3. 배열의 개수를 전달하면 임의의 정수형 배열을 리턴하는 메소드
//		4. 배열을 받아서 최대값을 리턴하는 메소드		
		int[] array = makeArray(10);
		int max = getMaxValue(array);		
		System.out.println("최대값 : "+ max);
		System.out.print("배열 요소 :");
		printArray(array);
	}

}
