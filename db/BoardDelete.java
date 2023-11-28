package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardDelete {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;		
		try {			
			conn = DbConnection.getConnection();
			String sql = "delete  from  board where board_id = 1";
			stmt =  conn.createStatement();
			stmt.executeUpdate(sql);		
	 
		}catch (Exception e) {			
			e.printStackTrace();
		}finally {
			DbConnection.close(conn);
			DbConnection.close(stmt);
			DbConnection.close(rs);
		}
		
	}

}
