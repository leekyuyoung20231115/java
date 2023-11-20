
public class Array08 {

	public static void main(String[] args) {
		// 두개의 2x2 2차원배열 2개를 만들고 데이터를 적당하게 넣어서
		// 각각을 행렬로 생각해서 두 행렬의 연산(+)를 한 결과를
		// 2차원 배열에 넣어서 출력
		
		int[][] array1 = { {1,2}, {3,4} }; 
		int[][] array2 = { {5,6}, {7,8} };
		
		int[][] result = new int[2][2];
		
		// 계산
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i][j] = array1[i][j] + array2[i][j];
			}
		}
		
		// 출력
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}

}
