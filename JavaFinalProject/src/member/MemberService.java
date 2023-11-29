package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DbConnection;

public class MemberService implements AutoCloseable{
	private static Connection conn = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;
	static {
		try {
			conn = DbConnection.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static MemberVO findByEmail(String email) throws Exception 
	{
		String sql = "select * from member where email = ? and delyn='N' ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, email);
		rs = pstmt.executeQuery();
		MemberVO memberVo = getMemberVO();		
		return memberVo;
	}

	private static MemberVO getMemberVO() throws SQLException {
		if(!rs.next())
			return null;
		MemberVO memberVo = new MemberVO(rs.getString("email"), rs.getString("psw"),
				rs.getString("mrole"), rs.getDate("create_dt"), rs.getDate("modify_dt"),
				rs.getString("delyn"));
		return memberVo;
	}
	
	@Override
	public void close() throws Exception {
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
		if(conn!=null) conn.close();		
		
	}
//	회원가입
	public static void insertMember(String email, String psw) throws Exception {
		String sql = "insert into member(email,psw) values(?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, email);
		pstmt.setString(2, psw);
		pstmt.executeUpdate();		
	}
}
