package s_11_23;

public class Test02 {

	public static void main(String[] args) {
		// 임의의 2차원 배열 생성
		int[][] ary = new int[3][3];
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary.length; j++) {
				ary[i][j] = (int)(Math.random()*50); 
			}
		}
		// 출력
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary.length; j++) {
				System.out.print(ary[i][j]+"\t"); 
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		int[][] ary2 = new int[ary.length+1][ary[0].length+1];
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary.length; j++) {
				ary2[i][j]  = ary[i][j]; 
			}
		}
		
		// 가로의 합을 각각의 위치에 저장
		for (int i = 0; i < ary.length; i++) {
			ary2[ary.length][ary[i].length] += ary[i][i];
			for (int j = 0; j < ary[i].length; j++) {
				ary2[i][ary2[j].length-1] += ary[i][j];
				ary2[ary2.length-1][i] += ary[j][i];
			}
		}
		
		// 마지막 출력
		for (int i = 0; i < ary2.length; i++) {
			for (int j = 0; j < ary2[i].length; j++) {
				System.out.print(ary2[i][j]+"\t"); 
			}
			System.out.println();
		}
		
		
//		// 세로의 합을 각각의 위치에 저장
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				ary2[3][i] += ary[j][i];
//			}
//		}
		
//		// 대각선		
//		for (int i = 0; i < 3; i++) {
//			ary2[3][3] += ary[i][i];
//		}
		
		
		
		
		
		

	}

}
