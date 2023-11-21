public class Library {
	// book 객체를 배열로 저장
	public Book[] books;
	public int bookIndex = 0;
	public int bookCount=0;
	// 배열 초기화
	public void initBooks(int bookCount) {
		this.bookCount = bookCount;
		this.books = new Book[bookCount];
	}
	
	public void insertBook(Book b) {
		if(bookIndex < books.length)
			books[bookIndex++] = b;
		else {
//			System.out.println("더이상 추가할수 없습니다.");
			// 기존용량의 2배 증가
			bookCount *= 2;
			// 새로운 배열을 생성
			Book[] temp = new Book[bookCount];
			// 기존데이터를 옮긴다.
			for (int i = 0; i < books.length; i++) {
				temp[i] = books[i];
			}
			// 새로게 만들 배열을 가리키도록 기존 배열의 주소를 변경
			books = temp;
			books[bookIndex++] = b;
		}
	}
	
	public void displayInfo() {
		for (int i = 0; i < bookIndex; i++) {
			books[i].displayInfo();
		}
	}
}
