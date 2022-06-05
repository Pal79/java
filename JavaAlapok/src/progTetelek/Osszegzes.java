package progTetelek;

public class Osszegzes {
	
	public static void main(String[] args) {
		// Összegzés tétele: 
		// Meghatározza egy számsorozat(tömb) elemeinek összegét 
		int[] tomb = {3,6,9,23};
		
		//kiírjuk a tömb elemeit
		System.out.println("A tömb elemei: ");
		tombKiir(tomb);
		System.out.println();
		
		System.out.println("A tömb elemeinek összege: " + tombElmeinekOsszegeSzamol(tomb));
		System.out.println("A tömb elemeinek átlaga: " + (double)tombElmeinekOsszegeSzamol(tomb) / tomb.length);
	}
	
	public static int tombElmeinekOsszegeSzamol(int[] tomb) {
		int osszeg = 0;
		for (int i = 0; i < tomb.length; i++) {
			osszeg+=tomb[i]; //ua. osszeg = osszeg + tomb[i]
		}
		return osszeg;
	}
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}

}
