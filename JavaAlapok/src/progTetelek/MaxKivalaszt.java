package progTetelek;

public class MaxKivalaszt {
	
	public static void main(String[] args) {
		// Max. kiv�laszt�s t�tele: egy halmazon bel�l keress�k 
		// a legnagyobb �rt�k� elemet. 
		// kieg�sz�t�s: Melyik indexen van a legnagyobb �rt�k?
		int[] tomb = {3,6,9,23,55,89,11,1,66,89};

		//ki�rjuk a t�mb elemeit
		System.out.println("A t�mb elemei: ");
		tombKiir(tomb);
		System.out.println();

		System.out.println("Legnagyobb �rt�k: " + maxErtekMeghataroz(tomb));
		System.out.println("A legnagyobb �rt�k ezen az indexen tal�lhat�: " + maxIndexMeghataroz(tomb));
		System.out.println("Legnagyobb �rt�k (m�shogy): " + tomb[maxIndexMeghataroz(tomb)]);
		
	}
	
	public static int maxErtekMeghataroz(int[] tomb) {
		int max = tomb[0];
		for (int i = 1; i < tomb.length; i++) {
			if (tomb[i]>max) {
				max = tomb[i];
			}
		}
		return max;
	}
	
	public static int maxIndexMeghataroz(int[] tomb) {
		int max = tomb[0];
		int maxIndex = 0;
		for (int i = 1; i < tomb.length; i++) {
			if (tomb[i]>max) {
				max = tomb[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}

}
