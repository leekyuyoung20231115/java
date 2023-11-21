
public class Staff {
	public String name, major,year;
	public int money;
	
	public void insertRecord(String name, String major, String year, int money) {
		this.name = name;
		this.major = major;
		this.year = year;
		this.money = money;
	}
	// 정보 출력
	public void displayInfo() {
		System.out.format("이름 : %s, 부서 : %s, 연봉 : %d, 입사년도 : %s\n",
				name,major,money,year);
	}	
	
}
