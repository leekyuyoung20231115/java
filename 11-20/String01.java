
public class String01 {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = s1;
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1 == s3); // true

	}

}
