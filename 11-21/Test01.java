
public class Test01 {
	

	public static void main(String[] args) {
		// 주어진 문자열을 공백을 기준으로 배열로 분리한다.
		// "i love you"   
		// ["i","love","you"]
		// "programming"  ["programing"]
		
		// 주사위 게임
		// 1~6 적힌 두개의 주사위를 던져서
		// 각가 나온숫자를 x, y 라고 했을때 
		// 모두 홀수이면 각각의 숫자의 제곱의 합
		// 둘중에 하나만 홀수이면 2x(x+y)
		// 둘다 모두 홀수가 아니면(짝수)  |x-y|
		
		// 문자를 가져오면서 바로 문자열로 만들다가..
		// 공백을 발견하면 해당조립한 문자열을 문자열 배열에 넣고
		// 다시 조립한 문자열을 초기화한후 위의 과정을 반복
		String str ="i love you";
		char c = str.charAt(0);
		String temp = "";
		temp += c;
		
		
		
	}

}
