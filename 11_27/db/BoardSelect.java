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
		String url = "jdbc:mysql://localhost:3306/bbs?serverTimezone=UTC";
		String id = "root";
		String psw = "1234";
		try {
			// 1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");			
			// 2. 연결
			conn = DriverManager.getConnection(url, id, psw);
			System.out.println("성공......");
			
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
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 오류");			
		}catch (SQLException e) {
			System.out.println("jdbc 드라이버 오류");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("연결 오류");
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(stmt !=null) stmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
