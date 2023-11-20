
public class Array01 {

	public static void main(String[] args) {
		// 1차원 배열  정수형  3
		int array[] = new int[3];
		int[] array2 = new int[3];
		
		// 초기화 값을 알고있는경우 또는 메소드를 통해 받아오는 경우
		int[] array3 = {1,2,3};
		int[] array4 = new int[]{1,2,3};
		int[] array5 = getArray();

	}
	public static int[] getArray() {
		int[] temp = {1,2,3};
		return temp;
	}

}
