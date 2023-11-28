package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardSelect {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;		
		try {			
			conn = DbConnection.getConnection();			
			// 3. sql문장 실행  statement객체
			String sql = "select * from board";
			stmt =  conn.createStatement();
			rs = stmt.executeQuery(sql); // sql 문장을 실행
			while (rs.next()) {
//				int boardId = rs.getInt(1);
//				String boardTitle = rs.getString(2);
//				System.out.format("boardId:%d  boardTitle:%s\n", boardId,boardTitle);			
				
				System.out.format("%d %s %s %s %s %s %s\n", 
						rs.getInt("board_id"),rs.getString("board_title"),
						rs.getString("BOARD_CONTENT"),rs.getString("REGISTER_ID"),
						rs.getDate("REGISTER_DATE")	,rs.getString("UPDATER_ID"),
						rs.getDate("UPDATER_DATE")
						);
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}finally {
			DbConnection.close(conn);
			DbConnection.close(stmt);
			DbConnection.close(rs);
		}
		
	}

}
