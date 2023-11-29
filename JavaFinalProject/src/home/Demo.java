package home;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import member.MemberService;
import member.MemberVO;
import product.ProductService;
import product.ProductVO;

public class Demo {

	public static void main(String[] args) throws Exception {
		int menuNum = 0;
		while(menuNum != 5) {
			System.out.println("1. 재고목록\t\t2. 입고/출고");
			System.out.println("3. 로그인/로그아웃\t\t4. 회원가입");
			System.out.println("5. 종료");
			System.out.print("input menu : ");
			Scanner sc = new Scanner(System.in);
			menuNum = sc.nextInt();
			ResultSet rs = null;
			switch (menuNum) {
			case 1:		
				List<ProductVO> results =  ProductService.selectByName("",true);
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
				
				ProductVO productVO 
					= new ProductVO(0, pname, stock, price, null, null, null);
				
				List<ProductVO> resultOne =  ProductService.selectByName(pname,false);
				
				if(resultOne.size() > 0) {  // 제품이 있음	
					productVO.setId( resultOne.get(0).getId() );
					ProductService.updataData(productVO);
					System.out.println("수정했습니다.");
				}else {  // 신규상품임
					ProductService.insertData(productVO);
					System.out.println("추가했습니다.");
				}				
				break;			
			case 3: // 로그인/로그아웃
				// 과제...
				// 아이디 패스워드 입력받아서 
				// 로그인 성공여부 출력하기
			case 4: // 회원가입
				System.out.println("이메일을 입력하세요");
				String email = sc.next();
				MemberVO vo =  MemberService.findByEmail(email);
				if(vo != null) {
					System.out.println("사용할수 없는 아이디 입니다.");
					break;
				}
				System.out.println("비밀번호를 입력하세요");
				String psw = sc.next();
				MemberService.insertMember(email,psw);
				System.out.println("회원가입이 완료되었습니다.");
				break;
			case 5: // 종료
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}
		} // end while
	}

}
