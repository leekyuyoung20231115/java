package s_11_24;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 영어점수 순으로 정렬
class engSort implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {		
		return -Integer.compare(o1.eng, o2.eng);
	}	
}

public class StudentDemo {

	public static void main(String[] args) {
		List<Student> s = new ArrayList<Student>();
		s.add( new Student("홍길동1", 80, 50, 90)  );
		s.add( new Student("홍길동2", 80, 90, 92)  );
		s.add( new Student("홍길동3", 80, 88, 75)  );
		s.add( new Student("홍길동4", 80, 82, 91)  );
		s.add( new Student("홍길동5", 80, 85, 88)  );
		System.out.println(s);
		
		s.sort(null);
		System.out.println(s);
		// 1등은
		System.out.println("1등은 : "+s.get(0).name);
		s.sort(new engSort());
		System.out.println(s);
		
		// 국어점수 내림차순
		Comparator<Student> c =  new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o2.kor,o1.kor);
			}
		};
		s.sort(c);
		System.out.println(s);
		
		// 수학순 오름차순
		s.sort( (Student o1, Student o2)->Integer.compare(o1.math, o2.math)   );
		System.out.println(s);

	}

}
