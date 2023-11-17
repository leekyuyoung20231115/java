/*
 * static 키워드는 메소드나 변수를 static으로 만드는데.
 * static은 일반메모리보다 가장 먼저 생성되기 때문에
 * non-static은 static 키워드가 붙은 맴버(변수,메소드)에서 사용할 수 없다.(생성순서때문에)
 */

import java.util.Scanner;

public class Welcome {
	// static 상수
	final static String GREETING = "Welcome to Shopping Mall";
	final static String TAGLINE = "Welcome to Book Market";
		
	
	// 문자열 + 어떤타입 -> 문자열 + 문자열로 변경하고... 연산을 한다.... 
	// 문자열 + 문자열은 두 개의 문자열을 합쳐서 하나로 표현
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("전화번호를 입력하세요 : ");
		String phone = sc.next();
		
		printLines();
		System.out.println("\t" + GREETING);
		System.out.println("\t" + TAGLINE);
		printLines();
		while (true) {
			menuIntro();  // 메뉴호출
			System.out.print("메뉴 번호를 선택 해 주세요 : ");
			// 사용자 입력을 받아서
			int choice = sc.nextInt();
			// 2번이면
			// 2번 메뉴를 선택했습니다. 
//			System.out.println(choice + "번 메뉴를 선택했습니다.");
//			switch case문을 이용해서 각 번호에 해당하는 비지니스로직을 가지고 있는 메소드를 호출
			if(choice == 8)
				break;
			else
				menuChoice(choice);	
			
			printLines();
		}
	}

	private static void menuChoice(int choice) {
		switch (choice) {
		case 1:	
			menuGuestInfo();
			break;
		case 2:				
			menuCartItemList();
			break;
		case 3:				
			menuCartClear();
			break;
		case 4:				
			menuCartAddItem();
			break;
		case 5:				
			menuCartRemoveItemCount();
			break;
		case 6:				
			menuCartRemoveItem();
			break;
		case 7:				
			menuCartBill();
			break;		
		default:
			System.out.println("잘못입력했습니다");
			return;
		}
	}

	private static void menuCartBill() {
		// TODO Auto-generated method stub
		
	}

	private static void menuCartRemoveItem() {
		// TODO Auto-generated method stub
		
	}

	private static void menuCartRemoveItemCount() {
		// TODO Auto-generated method stub
		
	}

	private static void menuCartAddItem() {
		// TODO Auto-generated method stub
		
	}

	private static void menuCartClear() {
		// TODO Auto-generated method stub
		
	}

	private static void menuCartItemList() {
		// TODO Auto-generated method stub
		
	}

	private static void menuGuestInfo() {
		// TODO Auto-generated method stub
		
	}

	private static void menuIntro() {
		System.out.println("1.고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
		System.out.println("2.장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
		System.out.println("3.장바구니 비우기 \t\t6. 장바구니의 항목 삭제하기");
		System.out.println("7.영수증 표시하기 \t\t8. 종료");
	}
	
	public static void printLines() {
		for (int i = 0; i < 50; i++) 
			System.out.print("*");
		
		System.out.println();
	}
	
	

}
