import java.util.Scanner;

public class Array06 {

	public static void main(String[] args) {
		// 학생 1명은 국어 영어 평균
		// 2명의 학생에대한 점수를 입력해서 평균까지 구하는 2차원 배열
		// 1. 학생 1명에 대해서...
		Scanner sc = new Scanner(System.in);
		
//		double[] scores = new double[3];
//		System.out.println("국어 영어를 각각 입력하세요");		
//		scores[0] =  sc.nextDouble();
//		scores[1] =  sc.nextDouble();
//		scores[2] = (scores[0]+ scores[1]) / 2;  
		
		double[][] scores = new double[2][3];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("학생번호 : "+ (i+1) );
			System.out.println("국어점수");
			scores[i][0] = sc.nextDouble();
			
			System.out.println("수학점수");
			scores[i][1] = sc.nextDouble();
			
			scores[i][2] = (scores[i][0]+scores[i][1]) / 2; 
		}
		// 최종 출력은
		for (int i = 0; i < scores.length; i++) {
			System.out.println("학생번호 : " + (i+1));
			System.out.println("국어 : " + scores[i][0]);
			System.out.println("영어 : " + scores[i][1]);
			System.out.println("평균 : " + scores[i][2]);
			System.out.println("--------------------------------------");
		}

	}

}
