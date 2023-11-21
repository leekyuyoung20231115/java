
public class Demo {

	public static void main(String[] args) {
//		Student s1 = new Student();
//		s1.name = "홍길동"; s1.id = "1"; s1.kor=80; s1.eng = 90;		
//		Student s2 = new Student();
//		Student s3 = new Student();
//		Student s4 = new Student();
//		Student s5 = new Student();
		
		// Student 배열 생성
		Student[] students = new Student[5];
		// 각 배열에 기본객체 생성
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}		
		
		students[0].insertRecord("1", "홍길동1", 80, 88);
		
		students[1].name = "홍길동3"; students[1].id = "2"; 
		students[1].kor=88; students[1].eng = 80;
		
		students[2].name = "홍길동2"; students[2].id = "3"; 
		students[2].kor=70; students[2].eng = 81;
		
		students[3].name = "홍길동4"; students[3].id = "4"; 
		students[3].kor=81; students[3].eng = 85;
		
		students[4].name = "홍길동5"; students[4].id = "5"; 
		students[4].kor=82; students[4].eng = 95;
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].name + " : " + students[i].getAvg());
		}
		
		// 배열을 순환하면 서 평균이 가장 큰 값을 찾고 그때의 인덱스를 저장해서 해당 인덱스의 학생정보를 출력한다.
		double max = -1;
		int index = -1;
		for (int i = 0; i < students.length; i++) {
			if(max < students[i].getAvg())
				max = students[i].getAvg();
				index = i;
		}
		System.out.print("평균이 가장 높은 학생은 : ");
		System.out.format("%s : %s %d %d %f\n",
				students[index].id, students[index].name, 
				students[index].kor,students[index].eng,students[index].getAvg());
		
	}

}
