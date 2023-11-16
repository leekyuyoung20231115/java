/*
 * type casting
 * 연산자의 타입을 일치시킴(큰 타입기준)
 * 대입연산자는 대입을 받는 타겟 기준으로 일치시킨다
 * 작은->큰쪽... 데이터에 아무 영향이 없으므로 자동으로 타입캐스팅
 * 큰쪽->작은쪽은 어떻게 될지 모르니 사용자가 직접 개입
 * (원하는 타입)대상이되는변수나 값
 */

public class Demo2 {

	public static void main(String[] args) {
		double d = 3.14;
		long l = (long) d;
		int i = (int)l;
		//
		displayValues(d,l,i);

	}

	private static void displayValues(double d, long l, int i) {
		System.out.println(d);
		System.out.println(l);
		System.out.println(i);
		
	}

}
