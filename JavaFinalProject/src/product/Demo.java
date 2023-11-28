package product;

import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import db.DbCRUD;

public class Demo {

	public static void main(String[] args) throws Exception {
		System.out.println("1. 재고목록\t\t2. 입고/출고");
		System.out.println("3. 로그인/로그아웃\t\t\t4. 종료");
		System.out.print("input menu : ");
		Scanner sc = new Scanner(System.in);
		int menuNum = sc.nextInt();
		ResultSet rs = null;
		switch (menuNum) {
		case 1:		
			rs =  DbCRUD.selectByName("",true);
			while (rs.next()) {
				String pname = rs.getString("pname");
				int stock = rs.getInt("stock");
				int price = rs.getInt("price");
				Date createDt =  rs.getDate("create_dt");
				Date modifyDt =  rs.getDate("modify_dt");
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				
				System.out.format("%s  %d  %d  %s  %s\n", 
						pname,stock,price,
						sdf.format(createDt),
						sdf.format(modifyDt)
						);
			}
			break;
		case 2:
			System.out.print("제품명을 입력하세요:");
			String pname = sc.next().trim();
			System.out.print("수량을 입력하세요");
			int stock = sc.nextInt();
			System.out.print("가격을 입력하세요");
			int price = sc.nextInt();
			
			rs =  DbCRUD.selectByName(pname,false);
			if(rs.next()) {  // 제품이 있음				
				DbCRUD.updataData(pname, stock, price, rs.getInt("id"));
				System.out.println("수정했습니다.");
			}else {  // 신규상품임
				DbCRUD.insertData(pname, stock, price);
				System.out.println("추가했습니다.");
			}
			
			break;

		default:
			break;
		}
	}

}
