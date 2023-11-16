
public class Switch01 {

	public static void main(String[] args) {
		String str = "C";
		
		switch (str) {
		case "A":			
		case "B":			
		case "C":
			System.out.println("입력하신 값은 A부터 C사이의 값입니다.");
			break;
		default:
			System.out.println("디폴트");
			break;
		}

	}

}
