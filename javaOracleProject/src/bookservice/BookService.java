package bookservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javaOracleProject.DbConnection;

public class BookService {
	private Connection conn;
	private static BookService instance=null;	
	
	private BookService() {
		super();
		try {
			this.conn = DbConnection.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		};
	}
	public static BookService getInstance() { // 외부에서 객체를 받아올때
		if(instance != null)
			return instance;
		instance = new BookService();
		return instance;
	}
	public List<BookVO> getBookLists() throws Exception{
		String sql = "select * from book";
		PreparedStatement pstmt =  conn.prepareStatement(sql);
		ResultSet rs =  pstmt.executeQuery();
		List<BookVO> lists = new ArrayList<BookVO>();
		getBookLists(rs, lists);
		return lists;
	}
	private void getBookLists(ResultSet rs, List<BookVO> lists) throws SQLException {
		while(rs.next()) {
			int bookid= rs.getInt("bookid");
			String bookname = rs.getString("bookname");
			String publisher = rs.getString("publisher");
			int price = rs.getInt("price");
			BookVO vo = new BookVO(bookid, bookname, publisher, price);
			lists.add(vo);
		}
	}
	
	// 단일기능으로 만들었던 BookDelete, BookInsertOrUpdate 의 기능을 여기로 통합
	public void deleteBookById(int bookid) {
		try {
			conn = DbConnection.getConnection();
			String sql = "call ps_bookdelete(?)";
			PreparedStatement pstmt =  conn.prepareCall(sql);
			pstmt.setInt(1, bookid);			
			pstmt.executeQuery();
			System.out.println("삭제되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void insertOrUpdate(BookVO bookVO) {
		try {
			Connection conn = DbConnection.getConnection();
			String sql = "call PS_INSERTROUPDATE(?,?,?,?)";
			PreparedStatement pstmt =  conn.prepareCall(sql);
			pstmt.setInt(1, bookVO.getBookid());
			pstmt.setString(2, bookVO.getBookname());
			pstmt.setString(3, bookVO.getPublisher());
			pstmt.setInt(4, bookVO.getPrice());
			pstmt.executeQuery();
			System.out.println("삽입 또는 업데이트 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
