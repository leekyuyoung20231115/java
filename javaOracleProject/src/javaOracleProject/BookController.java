package javaOracleProject;

import java.util.List;
import java.util.Scanner;

import bookservice.BookService;
import bookservice.BookVO;

public class BookController {
	private static BookService bookService = BookService.getInstance();
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice != 4) {
			System.out.format("%-10s %-10s\n","1.책 리스트", "3.책 추가및업데이트");
			System.out.format("%-10s %-10s\n","2.책 삭제", "4.종료");
			System.out.print("번호를 선택해 주세요 : ");
			choice =  sc.nextInt();
			switch (choice) {
			case 1:		
				List<BookVO> lists =  bookService.getBookLists();
				System.out.format("%-10s %-20s %-20s %-20s\n",
						"bookid","bookname","publisher","price");
				for (BookVO bookVO : lists) {
					System.out.format("%-10s %-20s %-20s %-20s\n",
							bookVO.getBookid(),bookVO.getBookname(), bookVO.getPublisher(),bookVO.getPrice());
				}
				break;
			case 2:	
				System.out.print("삭제할 bookid를 선택해 주세요");
				int bookid = Integer.valueOf( sc.nextLine() );
				bookService.deleteBookById(bookid);
				System.out.println("삭제 되었습니다.");
				break;
			case 3:	
				System.out.print("공백을 기준으로 한번에 입력해 주세요(10 역사책 더미출판사 500)");
//				String temp = sc.next();
				String[] params =  sc.nextLine().split(" ");				
				params =  sc.nextLine().split(" ");
				BookVO bookVO = new BookVO(Integer.valueOf(params[0]), 
						params[1], params[2], Integer.valueOf(params[3]));
				bookService.insertOrUpdate(bookVO);
				break;
			case 4:		
				System.out.println("프로그램을 종료합니다");
				break;
			default:
				System.out.println("잘못 선택했습니다. ");
				break;
			}
			
		}
	}

}
