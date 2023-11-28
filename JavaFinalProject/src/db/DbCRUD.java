package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import product.ProductVO;

public class DbCRUD implements AutoCloseable{
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
	public static void insertData(String pname,int stock, int price) throws Exception {
		// db에 데이터 추가
		String sql = "insert into product(pname,stock,price) values(?,?,?)";
		pstmt= conn.prepareStatement(sql);
		pstmt.setString(1, pname);	pstmt.setInt(2, stock);
		pstmt.setInt(3, price);
		pstmt.executeUpdate();
	}
	public static void updataData(String pname, int stock,int price,int id) throws Exception {
		// modify_dt를 현재시간으로 업데이트한다
		String sql = " update product set pname=?, stock=?, price=?, "
				+ " modify_dt = now()"
				+ " where id=? and delyn='N'";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, pname); pstmt.setInt(2, stock);
		pstmt.setInt(3, price); pstmt.setInt(4, id);
		pstmt.executeUpdate();
		
	}
	public static void deleteData(int id) throws Exception {
		// modify_dt를 현재시간으로 업데이트한다
		String sql = "update product set delyn='Y', modify_dt = ? where id = ?";
		pstmt= conn.prepareStatement(sql);
		pstmt.setDate(1, Date.valueOf( LocalDate.now()) );
		pstmt.setInt(2, id);		
		pstmt.executeUpdate();
	}
	public static List<ProductVO> selectByName(String pname,boolean isAll) throws Exception {
		List<ProductVO> result = new ArrayList<ProductVO>();
		String sql = "select * from product where delyn='N'"
				+ " and pname like ?";
		pstmt= conn.prepareStatement(sql);
		if(isAll)
			pstmt.setString(1, "%"+pname+"%");
		else
			pstmt.setString(1, pname);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			ProductVO productVO = new ProductVO(
					rs.getInt("id"), rs.getString("pname"), 
					rs.getInt("stock"), rs.getInt("price"), 
					rs.getDate("create_dt"), rs.getDate("modify_dt"), 
					rs.getString("delyn")
					);
			result.add(productVO);			
		}
		return result;
	}
	
	@Override
	public void close() throws Exception {
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
		if(conn!=null) conn.close();		
	}
	
}
