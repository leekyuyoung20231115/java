
public class Test01 {

	public static void main(String[] args) {
		// 공배수 
		// 정수 number, m,n 을 주면 
		// 1. number가 m,n의 공배수이면 1을 리턴하고 아니면 0을 리턴하는 메소드
		//  60, 3, 2  결과 1
		// 2. 알파벳 문자열에서 특정 문자열이 있는지 확인하고 있으면 1 없으면 0
		// 대소문자 구분하지 않는다.
		//  AbCdEfg    aBc  1을 리턴
		//  aaAA       aaaaaa   0
		// 3. 정수배열이 있을때 길이가 짝수이면 모두 더하고 홀수이면 모두 곱해서 결과 리턴하는메소드
		// 4. 충분한 크기의 배열이 있는데... 메소드에 원소로 배열을 줬을때 배열의 앞에서부터 차례대로 값을 추가하는데
		// 원소가 a라면 배열의 맨뒤에 a를 a번 추가
		// []  [5,1,4]  [5,5,5,5,5,1,4,4,4,4]
		// [] [2,2]  [2,2,2,2]
		
		
		String str = "abcdefg";
		String find = "bcd";
		System.out.println(str.contains(find));
		
		

	}

}
