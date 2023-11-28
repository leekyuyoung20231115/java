package db;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DbCRUD implements AutoCloseable{
	private static Connection conn = null;	
	private static PreparedStatement pstmt = null;
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
		conn = DbConnection.getConnection();
		String sql = "insert into product(pname,stock,price) values(?,?,?)";
		pstmt= conn.prepareStatement(sql);
		pstmt.setString(1, pname);
		pstmt.setInt(2, stock);
		pstmt.setInt(3, price);
		pstmt.executeUpdate();
	}
	
	
	
	@Override
	public void close() throws Exception {
		pstmt.close();
		conn.close();		
	}
	
}
