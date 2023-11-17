
public class Loop04 {

	public static void main(String[] args) {
//    *********  9개, 0 
//     *******   7개, 1 		
//      *****    5개, 2
//		 ***     3개, 3
//		  *      1개, 4 
		for (int i = 0,j=9; i < 5; i++, j-=2) {
//			System.out.format("%d, %d\n",j,i);
			for (int j2 = 0; j2 < i; j2++) {
				System.out.print(" ");
			}
			for (int j2 = 0; j2 < j; j2++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
