package javaOracleProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import bookservice.BookService;
import bookservice.BookVO;

//  bookid bookname	publisher price
public class BookList {
	private static BookService bookService = BookService.getInstance(); 
	
	public static void main(String[] args) {
		System.out.format("%-10s %-20s %-20s %-20s\n",
				"bookid","bookname","publisher","price");
		try {
			Connection conn = DbConnection.getConnection();			
			String sql = "select * from book";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs =  pstmt.executeQuery();
			List<BookVO> lists = bookService.getBookLists();
			for (BookVO bookVO : lists) {
				System.out.format("%-10s %-20s %-20s %-20s\n",
						bookVO.getBookid(),bookVO.getBookname(),bookVO.getPublisher(),bookVO.getPrice());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
