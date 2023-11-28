package productmng;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import db.DbCRUD;
import db.DbConnection;

public class ProductInsert {

	public static void main(String[] args) {
		// db connection
		// 제품명 수량 가격을 입력 받는다  공백을 기준으로 입력
		System.out.println("공백을 기준으로 제품명 수량 가격을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String[] inputs = sc.nextLine().split(" ");
		String pname = inputs[0];
		// 에러가능성 있음
		int stock = Integer.valueOf( inputs[1]);
		int price = Integer.valueOf( inputs[2]);
		
		try {
			DbCRUD.insertData(pname, stock, price);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
