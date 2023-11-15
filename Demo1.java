
/*
 * 클래스 변수 타입 알아보기
 * static은 static에서만 사용 
 */

public class Demo1 {
	int instanceValue = 10;
	static int staticValue = 20;
	
	public static void main(String[] args) {
		int localValue = 30;
		
		// non-static영역에서는 static을 사용할수 없다
//		System.out.println(instanceValue);
		System.out.println(staticValue);		
	}
	public void otherMethod() {
		System.out.println(instanceValue);
		System.out.println(staticValue);
//		System.out.println(localValue);  // 지역변수는 그 지역을 벗어나서 사용할 수 없다
	}
}
