package javaOracleProject;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookDelete {

	public static void main(String[] args) {
		Connection conn;
		try {
			conn = DbConnection.getConnection();
			String sql = "call ps_bookdelete(?)";
			PreparedStatement pstmt =  conn.prepareCall(sql);
			pstmt.setInt(1, 1);			
			pstmt.executeQuery();
			System.out.println("삭제되었습니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
