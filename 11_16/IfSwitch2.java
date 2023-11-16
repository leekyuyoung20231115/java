import java.util.Scanner;

public class IfSwitch2 {

	public static void main(String[] args) {
		System.out.print("점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();		
		
		//사용자 점수를 받아서 등급을 계산
		String grade = getGrade(score);		
		// 등급에따른 세부내역 출력
		displayInfo(grade);
	}
	
	private static void displayInfo(String grade) {
		// switch문을 이용해서 A학점을 받으면.. 전액 장학급지급
//		B학점을 받으면.. 부분 장학급지급
//		C학점을 받으면.. 수강료 정상 납부
//		D학점을 받으면.. 수강료 정상 납부, 재수강 가능
//		F학점을 받으면.. 수강료 정상 납부, 학점이수 불가
		switch (grade) {
		case "A":
			System.out.println("전액 장학급지급");
			break;
		case "B":			
			System.out.println("부분 장학급지급");
			break;
		case "C":			
			System.out.println("수강료 정상 납부");
			break;
		case "D":			
			System.out.println("수강료 정상 납부, 재수강 가능");
			break;
		default:
			System.out.println("수강료 정상 납부, 학점이수 불가");
			break;
		}
		
	}

	private static String getGrade(int score) {
		String grade = "F";
		if(score>=90) 
			grade = "A";
		else if(score >=80)
			grade = "B";
		else if(score >=70)
			grade = "C";
		else if(score >=60)
			grade = "D";
		else 
			grade = "F";
		return grade;
	}

}
