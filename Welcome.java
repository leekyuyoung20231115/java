/*
 * static 키워드는 메소드나 변수를 static으로 만드는데.
 * static은 일반메모리보다 가장 먼저 생성되기 때문에
 * non-static은 static 키워드가 붙은 맴버(변수,메소드)에서 사용할 수 없다.(생성순서때문에)
 */
public class Welcome {
	// static 상수
	final static String GREETING = "Welcome to Shopping Mall";
	final static String TAGLINE = "Welcome to Book Market";
	
	
	// 문자열 + 어떤타입 -> 문자열 + 문자열로 변경하고... 연산을 한다.... 
	// 문자열 + 문자열은 두 개의 문자열을 합쳐서 하나로 표현
	public static void main(String[] args) {
		
		printLines();
		System.out.println("\t" + GREETING);
		System.out.println("\t" + TAGLINE);
		printLines();
		
		System.out.println("1.고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
		System.out.println("2.장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
		System.out.println("3.장바구니 비우기 \t\t6. 장바구니의 항목 삭제하기");
		System.out.println("7.영수증 표시하기 \t\t8. 종료");
	}
	
	public static void printLines() {
		System.out.println("*******************************************");
	}
	
	

}
