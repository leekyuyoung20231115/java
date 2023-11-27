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
			String sql = "update board set board_title='업데이트',board_content='냉무' where BOARD_ID = 1";
			stmt =  conn.createStatement();
			stmt.executeUpdate(sql);
			
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
