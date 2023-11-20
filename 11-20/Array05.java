import java.util.Arrays;

public class Array05 {

	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100);
		}
		System.out.println("정렬전 : ");
		System.out.println(Arrays.toString(array));
		System.out.println("정렬후 : ");
		// 오름차순
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));		
	}

}
