
public class Demo3 {

	public static void main(String[] args) {
		// 국 영 수 3과목에대해서 과락이 존재  각 과목당 40점이상
		// 평균이 60점 이상이면 합격
		
		// 데이터는 Math.random 메소드를 이용해서 35 ~ 100 랜덤하게 나오게 
//		int kor = 0, eng=0,math = 0;		
//		Math.random()  0 ~ 1 나수형태의 실수를 반환하는 메소드
//		Math.random()*65   0 < x < 65
//		Math.random()*65 + 35   35 < x < 100
		int kor = (int)(Math.random()*65 + 35);
		int eng = (int)(Math.random()*65 + 35);
		int math = (int)(Math.random()*65 + 35);
		
		// 합격조건을 만들어주세요
		// 1 평균을 구한다
		// 2.평균이 60보다 크다는조건과 && 각 과목별 40점 이상인 조건을 && 결합
		
//		double avg = (double)(kor+eng+math) / (double)3;
		double avg = (kor+eng+math) / 3.0;
		
		boolean isSuccess = avg >= 60 && 
							kor >= 40 && 
							eng >= 40 && 
							math >= 40;
		
		// 3항 연산자
		// (조건 또는 boolean형태의 값)? "참일때 선택하는 값" : "거짓일때 선택하는 값"
		System.out.println( (isSuccess)? "합격" : "불합격") ;

	}

}
