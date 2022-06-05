package progTetelek;

public class Osszegzes {
	
	public static void main(String[] args) {
		// �sszegz�s t�tele: 
		// Meghat�rozza egy sz�msorozat(t�mb) elemeinek �sszeg�t 
		int[] tomb = {3,6,9,23};
		
		//ki�rjuk a t�mb elemeit
		System.out.println("A t�mb elemei: ");
		tombKiir(tomb);
		System.out.println();
		
		System.out.println("A t�mb elemeinek �sszege: " + tombElmeinekOsszegeSzamol(tomb));
		System.out.println("A t�mb elemeinek �tlaga: " + (double)tombElmeinekOsszegeSzamol(tomb) / tomb.length);
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
