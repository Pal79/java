package lottery;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Numbers {
	
	public static Random r = new Random();
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private static boolean arrayCheck(int[] array, int search) {
		boolean result = true;
		for (int item : array) {
			if(item == search) {
				result = false;
			}
		}
		return result;
	}
	
	public static void matrixArrayUpload(int[][] matrix) {
		int[] tempArray = new int[5];
		int number;
		boolean result;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				do {
					number = r.nextInt((90-1)+1)+1;
					result = arrayCheck(tempArray, number);
				} while(!result);
				tempArray[j] = number;
				matrix[i][j] = tempArray[j];
			}
		}
	}
	
	public static void matrixArrayWriteOut(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.print((i+1) + ". hét nyerõszámai: ");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
