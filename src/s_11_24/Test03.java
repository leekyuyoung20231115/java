package s_11_24;

import java.util.ArrayList;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
		List<Student> sl = new ArrayList<Student>();
		sl.add(new Student());
		sl.add(new Student());
		sl.add(new Student());
		
		sl.get(0).name = "홍순이";
		sl.get(1).name = "길동이";
		sl.get(2).name = "이발소";
	}

}
