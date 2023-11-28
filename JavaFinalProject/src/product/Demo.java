package product;

import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import db.DbCRUD;

public class Demo {

	public static void main(String[] args) throws Exception {
		int menuNum = 0;
		while(menuNum != 4) {
			System.out.println("1. 재고목록\t\t2. 입고/출고");
			System.out.println("3. 로그인/로그아웃\t\t4. 종료");
			System.out.print("input menu : ");
			Scanner sc = new Scanner(System.in);
			menuNum = sc.nextInt();
			ResultSet rs = null;
			switch (menuNum) {
			case 1:		
				List<ProductVO> results =  DbCRUD.selectByName("",true);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				for (ProductVO vo : results) {
					System.out.format("%s  %d  %d  %s  %s\n", 
							vo.getPname(),vo.getStock(),vo.getPrice(),
							sdf.format(vo.getCreate_dt()),
							sdf.format(vo.getModify_dt())
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
				
				List<ProductVO> resultOne =  DbCRUD.selectByName(pname,false);
				if(resultOne.size() > 0) {  // 제품이 있음				
					DbCRUD.updataData(pname, stock, price, rs.getInt("id"));
					System.out.println("수정했습니다.");
				}else {  // 신규상품임
					DbCRUD.insertData(pname, stock, price);
					System.out.println("추가했습니다.");
				}				
				break;			
			case 3:
				break;
			case 4: break;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}
		} // end while
	}

}
