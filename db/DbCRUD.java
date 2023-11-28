package db;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DbCRUD {
	private static Connection conn = null;	
	static {
		try {
			conn = DbConnection.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void insertData(String pname,int stock, int price) throws Exception {
		// db에 데이터 추가
		Connection conn=null;
		PreparedStatement pstmt = null;		
		conn = DbConnection.getConnection();
		String sql = "insert into product(pname,stock,price) values(?,?,?)";
		pstmt= conn.prepareStatement(sql);
		pstmt.setString(1, pname);
		pstmt.setInt(2, stock);
		pstmt.setInt(3, price);
		pstmt.executeUpdate();
//		DbConnection.close(pstmt);DbConnection.close(conn);		
	}
}
