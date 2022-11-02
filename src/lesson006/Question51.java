package lesson006;

import java.util.Iterator;

public class Question51 {

	public static void main(String[] args) {
		
		//Bealdung
		
		// verilen 2 matristeki sayıları toplayan program
		// toplanan sayıları 2 ye 3 lük bir matriste yazdırlaım

		/*
		 * 8 10 3 
		 * 10 4 12
		 */
		
		int[][] matris1 = {{5,6,2}, {9,1,6}};
		int[][] matris2 = {{3,4,1}, {1,3,6}};
		
		
		String bosluk = " / ";
		
		int[][] toplamMatris  = new int [2][3];
		
		for (int i = 0; i < toplamMatris.length; i++) {
			for (int j = 0; j < toplamMatris[i].length; j++) {
				toplamMatris[i][j] = matris1[i][j] + matris2[i][j];
				
				System.out.print(toplamMatris[i][j] + bosluk);
			
			}
			System.out.println();
		}
	}

}
