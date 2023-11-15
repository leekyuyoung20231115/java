
public class Demo5 {

	public static void main(String[] args) {
		//문자열 정수를 실제 정수로
		String strNumber = "2023";
		// 문자열 실수를 실제 실수로
		String strPi = "3.14";

		// 실제 정수를 문자열 정수로
		int number =  Integer.valueOf(strNumber);
		System.out.println( number + 100 );
		// 실제 실수를 문자열 실수로
		double doubleNumber =  Double.valueOf(strPi);
		double sum = doubleNumber + 1.524;  // 4.664
		sum = Math.round(sum*100)/100.0;
		System.out.println( sum );		
		System.out.println(Math.round(doubleNumber + 1.524 ));		

	}

}
