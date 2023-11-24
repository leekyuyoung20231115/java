package s_11_24;

public class Student implements Comparable<Student>{
	public String name;
	public int kor, eng, math;
	public double avg;
	public Student() {}
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		avg = (kor+eng+math) / 3.0;
	}

	

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + "]";
	}
	@Override
	public int compareTo(Student o) {
		// x1이 x2보다 작으면 오름차순  음수리턴
		// x1이 x2보다 크면 오름차순  음수리턴		
		return (this.avg > o.avg)? -1 : 0;
	}


	
}
	
