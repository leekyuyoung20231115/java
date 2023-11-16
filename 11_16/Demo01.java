
public class Demo01 {

	public int age;
	public static void main(String[] args) {
		// Demo01 타입의 객체 d를 선언 및 할당받음
		Demo01 d = new Demo01();
		try {
			d.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
