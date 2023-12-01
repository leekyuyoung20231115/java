package javaOracleProject;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookInsertOrUpdate {
	public static void main(String[] args) {
		try {
			Connection conn = DbConnection.getConnection();
			String sql = "call PS_INSERTROUPDATE(?,?,?,?)";
			PreparedStatement pstmt =  conn.prepareCall(sql);
			pstmt.setInt(1, 55);
			pstmt.setString(2, "새로운책3");
			pstmt.setString(3, "새로운 출판사3");
			pstmt.setInt(4, 5000);
			pstmt.executeQuery();
			System.out.println("삽입 또는 업데이트 되었습니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		String sql = "select * from book";
	}
}
