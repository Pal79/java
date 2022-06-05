package progTetelek;

public class MinKivalaszt {
	
	public static void main(String[] args) {
		// Egy halmazon bel�l keress�k a legkisebb �rt�k� elemet
		// Sz�ls��rt�k kiv�laszt�s - min
		int[] tomb = {3,6,9,23,55,89,11,1,66};
		
		//ki�rjuk a t�mb elemeit
		System.out.println("A t�mb elemei: ");
		tombKiir(tomb);
		System.out.println();
		
		System.out.println("A legkisebb �rt�k: " + minKivalaszt(tomb));
		
	}
	public static int minKivalaszt(int[] tomb) {
		int min = tomb[0];
		for (int i = 1; i < tomb.length; i++) {
			//ha t�mb aktu�lis eleme kisebb, mint a min v�ltoz� �rt�ke, 
			// akkor a min vegye fel a t�mb aktu�lis elem�t
			if (tomb[i] < min) {
				min = tomb[i];
			}
		}
		return min;
	}
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}

}
