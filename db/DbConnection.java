package db;
//소문자(Lower case) 로 변경: CTRL+SHIFT+Y (CMD+SHIFT+Y on Mac OS X)
//대문자(Upper case) 로 변경: CTRL+SHIFT+X (CMD+SHIFT+X on Mac OS X)

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/bbs?serverTimezone=UTC";
	private static final String ID = "root";
	private static final String PSW = "1234";
	
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(URL, ID, PSW);
	}
	public static void close(AutoCloseable closeable) {
		try {
			if(closeable!=null) closeable.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
