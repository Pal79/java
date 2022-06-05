package progTetelek;

public class Eldont {
	
	public static void main(String[] args) {
		// Eld�nt�s: egy halmazon bel�l vizsg�ljuk, hogy egy �rt�k benne, 
		// vagy nincs: true/false (igaz/hamis)
		int[] tomb = {3,6,9,23,55,89,11,1,66,89};
		
		//ki�rjuk a t�mb elemeit
		System.out.println("A t�mb elemei: ");
		tombKiir(tomb);
		System.out.println();
		
		System.out.println("Benne van -e: " + eldont(tomb, 23)); //true
		if (eldont(tomb, 99)) {
			System.out.println("Benne volt a sz�m...");
		} else {
			System.out.println("Nem volt benne a sz�m...");
		}
		System.out.println(eldont(tomb, 101)); //false
		
	}

	public static boolean eldont(int[] tomb, int keresett) {
		boolean valasz = false;
		int i = 0;
		//Am�g a t�mb v�g�ig nem �r�nk �s t�mb aktu�lis eleme nem a keresett
		// addig l�ptetjuk a t�mb�t
		while (i<tomb.length && tomb[i] != keresett) {
			i++;
		}
		
		if (i<tomb.length) {
			valasz = true;
		}
		return valasz;
	}
	
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}

}
