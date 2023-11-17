import java.text.SimpleDateFormat;
import java.util.Date;

public class Metho10 {
	/*
	 * 사용자 정의 메서드 만들기
	 * 1. 입력/ 반환 없음
	 * 2. 입력만 있음
	 * 3. 출력만 있음
	 * 4. 둘다 있음
	 */	
	
//	1. 현재시간 출력
	
	public static void displayDate() {
		// 시간정보는 객체
		Date currentDate = new Date();
//		System.out.println(currentDate);
		// 출력형식을 지정
		SimpleDateFormat formatter 
			= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strDate = formatter.format(currentDate);
		System.out.println(strDate);
	}
//	2. 인사말과 함께 시간출력하기
	public static void displayDate(String greeting) {
		Date currentDate = new Date();
		SimpleDateFormat formatter 
			= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strDate = formatter.format(currentDate);
		System.out.println(greeting+" : " +strDate);
	}
//	3. 현재시간을 문자열로만들어서 리턴하기
	public static String getCurrentDate() {
		Date currentDate = new Date();
		SimpleDateFormat formatter 
			= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strDate = formatter.format(currentDate);
		return strDate;
	}
//	4. 출력포멧을 지정받아서 현재시간을 지정된 포멧형태로 변환해서 반환
	public static String getCurrentDate(String fmt) {
		Date currentDate = new Date();
		SimpleDateFormat formatter 
			= new SimpleDateFormat(fmt);
		String strDate = formatter.format(currentDate);
		return strDate;
	}
	
	public static void main(String[] args) {
		displayDate();
		displayDate("안녕하세요");
		System.out.println( getCurrentDate() );
		System.out.println( getCurrentDate("yyyy-MM-dd") );
	}

}
