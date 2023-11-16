
public class Debug01 {

	public static void main(String[] args) {
		System.out.println("1");
		int a = method01(100);
		int b = method02(200);
		System.out.println("2");

	}

	private static int method02(int i) {
		System.out.println("inner method02");
		return i+50;
	}

	private static int method01(int i) {
		System.out.println("inner method01");
		return i+20;
	}

}
