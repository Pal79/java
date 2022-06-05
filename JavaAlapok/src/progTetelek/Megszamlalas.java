package progTetelek;

public class Megszamlalas {
	
	public static void main(String[] args) {
		// Megszámlálás tétele: 
		// Meghatározza egy halmazon belül az adott tulajsonságú elemek számát
		int[] tomb = {3,6,9,23,55,89,11,22,66};
		
		//kiírjuk a tömb elemeit
		System.out.println("A tömb elemei: ");
		tombKiir(tomb);
		System.out.println();
		System.out.println("Párosak száma: " + parosMegszamol(tomb));
		
	}

	public static int parosMegszamol(int[] tomb) {
		int darab = 0;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i]%2 == 0) {
				darab++;
			}
		}
		return darab;
	}
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}

}
