package s_11_23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		try {
			int num = sc.nextInt();
			int arr[] = new int[5];
			arr[num] = 10 / num;
			System.out.println(arr[num]);
			
		} 
		catch (ArithmeticException e) {
			System.out.println("0이아닌 값을 입력하세요");
			System.out.println(e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("올바른 배열 인덱스를 입력하세요");
			System.out.println(e.getMessage());
		}catch (InputMismatchException e) {
			System.out.println("정수를 입력하세요");
			System.out.println(e.getMessage());
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
