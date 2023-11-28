package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardUpdate {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;		
		try {
			conn = DbConnection.getConnection();
			// 3. sql문장 실행  statement객체
			String sql = "update board set board_title='업데이트',board_content='냉무' where BOARD_ID = 1";
			stmt =  conn.createStatement();
			stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DbConnection.close(conn);
			DbConnection.close(stmt);
			DbConnection.close(rs);
		}
		
	}

}
