public class Student {
	// 맴버변수
	public String name, id;
	public int kor,eng;
//	public double avg;
	
	// 맴버함수
	public void insertRecord(String id,String name, int kor, int eng) 
	{
		this.id = id; this.name = name; this.kor = kor; this.eng = eng;
	}
	
	public double getAvg() {
		return (kor+eng) / 2;
	}
	
	

}
