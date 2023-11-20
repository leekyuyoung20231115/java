
public class Array03 {

	public static void main(String[] args) {
//		정수형 배열 : 
//			size : 5
//			데이터 0 ~ 10 사이중에 임의의 데이터
//			사용자가 원하는 데이터 찾아서 있으면 true, 없으면 false를 출력
//			break문 사용
		int[] array = {1,5,8,6,2};  // 다양하게 초기화... Math.random()
		int searchNum = 8;
		boolean isFind = false;
				
		for (int i = 0; i < array.length; i++) {
			if(searchNum == array[i]) {
				isFind = true;
				break;
			}
		}		
		System.out.println(isFind);
	}

}
