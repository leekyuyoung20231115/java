
public class Demo03 {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.insertRecord("a", "a", 100);
		
		Library li = new Library();
		//  도서관 용량 초기화
		li.initBooks(3);
		
		li.insertBook(b1);		li.insertBook(b1);		li.insertBook(b1);		li.insertBook(b1);
		li.insertBook(b1);		li.insertBook(b1);		li.insertBook(b1);		li.insertBook(b1);
		li.insertBook(b1);		li.insertBook(b1);		li.insertBook(b1);		li.insertBook(b1);
		
		li.displayInfo();
		

	}

}
