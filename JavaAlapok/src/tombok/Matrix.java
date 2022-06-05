package tombok;

import java.util.Random;

public class Matrix {
	
	public static void main(String[] args) {
		// M�trix - t�bbdimenzi�s t�mb
		// sorindex �s oszlopindex i �s j
		// 2 ciklus kell a bej�r�shoz
		// els� a sorindex: i
		// m�sodik az oszlopindex: j
		
		//3X4 m�trix: 3 sor �s 4 oszlop
		int[][] matrix = {
				{1,44,66,88},
				{77,49,93,11},
				{2,52,17,5}
		};
		
		System.out.println(matrix[2][1]); //52
		System.out.println(matrix[1][3]); //11

		//m�trix elemeinek ki�r�sa form�zottan tablu�torral hat�rolva
		//k�ls� forciklus l�pteti a sorokat, a bels� az oszlopelemeket
		System.out.println("M�trix elemei: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		//altgr + q - \
		
		//Feladat02: 5X6-os m�trix felt�lt�se (sorszint�) v�letlen sz�mokkal 1-100 k�z�tt 
		//m�trix elemeit form�zottan tabul�torral �rjuk ki!
		int[][] matrix2 = new int[5][6];
		Random r = new Random();
		
		//m�trix elemeinek felt�lt�se
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j] = r.nextInt(100)+1;
			}
		}
		
		//m�trix elemei
		System.out.println("M�trix2 elemei: ");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
