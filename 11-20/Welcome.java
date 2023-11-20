/*
 * static 키워드는 메소드나 변수를 static으로 만드는데.
 * static은 일반메모리보다 가장 먼저 생성되기 때문에
 * non-static은 static 키워드가 붙은 맴버(변수,메소드)에서 사용할 수 없다.(생성순서때문에)
 */

import java.util.Scanner;

public class Welcome {
	// static 상수
	static final int NUM_BOOK = 3;
	static final int NUM_ITEM = 7;
	static final String GREETING = "Welcome to Shopping Mall";
	static final String TAGLINE = "Welcome to Book Market";
		
	
	// 문자열 + 어떤타입 -> 문자열 + 문자열로 변경하고... 연산을 한다.... 
	// 문자열 + 문자열은 두 개의 문자열을 합쳐서 하나로 표현
	public static void main(String[] args) {
//		3 X 7 형태의 2차원배열을 만들고 이걸 메소드에 전달해서 
//		해당 메소드에서 데이터를 채운다.
//		그러면 메소드 호출후에는 데이터 채워져 있음		
		String[][] mBook = new String[NUM_BOOK][NUM_ITEM];
		// 초기화(데이터 채우기)
		BookList(mBook);
				
				
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
				menuChoice(choice,mBook);	
			
			printLines();
		}
	}
	
	public static void BookList(String[][] book ) {
		book[0][0] = "ISBN1234";
		book[0][1] = "쉽게 배우는 자바";
		book[0][2] = "27000";
		book[0][3] = "홍길동";
		book[0][4] = "자바 정복";
		book[0][5] = "IT전문서적";
		book[0][6] = "2023-11-20";
		
		book[1][0] = "ISBN5678";
		book[1][1] = "쉽게 배우는 자바2";
		book[1][2] = "30000";
		book[1][3] = "홍길동2";
		book[1][4] = "자바 정복2";
		book[1][5] = "IT전문서적";
		book[1][6] = "2023-11-20";
		
		book[2][0] = "ISBN1579";
		book[2][1] = "쉽게 배우는 자바3";
		book[2][2] = "35000";
		book[2][3] = "홍길동3";
		book[2][4] = "자바 정복3";
		book[2][5] = "IT전문서적";
		book[2][6] = "2023-11-20";
		
	}
	

	private static void menuChoice(int choice, String[][] book) {
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
			menuCartAddItem(book);
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

	private static void menuCartAddItem(String[][] book) {
		// 도서정보를 출력하고   | 를 기준으로 옆으로 출력(책 단위로)		
		for (int i = 0; i < book.length; i++) {
			for (int j = 0; j < book[i].length; j++) {
				System.out.print(book[i][j] + " | ");
			}
			System.out.println();
		}
		// 사용자로부터 도서id를 입력받는다
		// 입력받은 아이디가 제시한 목록에 있는지 판단해서
		// 없으면 다시입력하라는 메세지 출력하고
		// 있으면 미리 만들어놓은 boolean형 변수 boolean flag 에 true를 셋팅한다
		Scanner sc = new Scanner(System.in);
		System.out.println("도서 ID를 입력하세요");
		String bookId = sc.nextLine();
		boolean flag = false;
		int bookNumber = -1;
		for (int i = 0; i < book.length; i++) {
			if(book[i][0].equals(bookId)) {
				flag = true;
				bookNumber = i;   // 찾은 책의 번호(인덱스) 즉. 행 번호(줄 번호)
				break;
			}			
		}
		// flag가 true라는 애기는 사용자가 입력한 번호가 목록에 있으므로 이 상품을 장바구니에 추가할지 묻는다
		if(flag) {
			System.out.println("장바구니에 추가하겠습니까 y/Y");
			String yesOrNo = sc.nextLine();
			yesOrNo = yesOrNo.toUpperCase(); // 대문자로통일
			if("Y".equals(yesOrNo)) {
				System.out.println( book[bookNumber][1]+ " 도서가 장바구니에 추가되었습니다."  );
			}
		}
		
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
