
public class Break01 {

	public static void main(String[] args) {		
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
				if(true) {
					if(true) {
						if(true) {
							break;
						}
					}
				}
			}
			System.out.println(i);
		}

	}

}
