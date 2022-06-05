package progTetelek;

public class MinKivalaszt {
	
	public static void main(String[] args) {
		// Egy halmazon belül keressük a legkisebb értékû elemet
		// Szélsõérték kiválasztás - min
		int[] tomb = {3,6,9,23,55,89,11,1,66};
		
		//kiírjuk a tömb elemeit
		System.out.println("A tömb elemei: ");
		tombKiir(tomb);
		System.out.println();
		
		System.out.println("A legkisebb érték: " + minKivalaszt(tomb));
		
	}
	public static int minKivalaszt(int[] tomb) {
		int min = tomb[0];
		for (int i = 1; i < tomb.length; i++) {
			//ha tömb aktuális eleme kisebb, mint a min változó értéke, 
			// akkor a min vegye fel a tömb aktuális elemét
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
