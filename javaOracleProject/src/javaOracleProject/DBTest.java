package javaOracleProject;

import java.sql.Connection;

public class DBTest {

	public static void main(String[] args) {
		// jdbc
		// 1. connection string, id ,psw
		// 2. 드라이버 로드
		// 3. 커넥션 연결
		// 4. preparestatement 객체 생성 및 쿼리 실행
		// 5. resultset객체로 받아서 처리
		try {
			Connection conn =  DbConnection.getConnection();
			System.out.println("접속 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
