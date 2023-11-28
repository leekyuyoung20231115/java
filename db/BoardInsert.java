package db;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class BoardInsert {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DbConnection.getConnection();		
			
			// 3. sql문장 실행  statement객체
			String sql = "insert into board(BOARD_TITLE,BOARD_CONTENT,REGISTER_ID,REGISTER_DATE,UPDATER_ID,UPDATER_DATE) \r\n"
					+ "	values(?, ?, ?, ?, ?, ?) ";
			pstmt =  conn.prepareStatement(sql);
			// 바인딩
			pstmt.setString(1, "추가테스트 제목");
			pstmt.setString(2, "추가테스트 내용");
			pstmt.setString(3, "작성자 아이디");
			pstmt.setDate(4, Date.valueOf( LocalDate.now() ));
			pstmt.setString(5, "업데이트한 작성자 아이디");
			pstmt.setDate(6, Date.valueOf( LocalDate.now() ));
			pstmt.executeUpdate();
			
		} catch (Exception e) {			
			e.printStackTrace();
		}finally {
			DbConnection.close(conn);
			DbConnection.close(pstmt);
			DbConnection.close(rs);
		}
		
	}

}
