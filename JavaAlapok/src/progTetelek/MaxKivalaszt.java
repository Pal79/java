package progTetelek;

public class MaxKivalaszt {
	
	public static void main(String[] args) {
		// Max. kiválasztás tétele: egy halmazon belül keressük 
		// a legnagyobb értékû elemet. 
		// kiegészítés: Melyik indexen van a legnagyobb érték?
		int[] tomb = {3,6,9,23,55,89,11,1,66,89};

		//kiírjuk a tömb elemeit
		System.out.println("A tömb elemei: ");
		tombKiir(tomb);
		System.out.println();

		System.out.println("Legnagyobb érték: " + maxErtekMeghataroz(tomb));
		System.out.println("A legnagyobb érték ezen az indexen található: " + maxIndexMeghataroz(tomb));
		System.out.println("Legnagyobb érték (máshogy): " + tomb[maxIndexMeghataroz(tomb)]);
		
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
