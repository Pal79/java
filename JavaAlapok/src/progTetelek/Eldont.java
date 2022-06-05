package progTetelek;

public class Eldont {
	
	public static void main(String[] args) {
		// Eldöntés: egy halmazon belül vizsgáljuk, hogy egy érték benne, 
		// vagy nincs: true/false (igaz/hamis)
		int[] tomb = {3,6,9,23,55,89,11,1,66,89};
		
		//kiírjuk a tömb elemeit
		System.out.println("A tömb elemei: ");
		tombKiir(tomb);
		System.out.println();
		
		System.out.println("Benne van -e: " + eldont(tomb, 23)); //true
		if (eldont(tomb, 99)) {
			System.out.println("Benne volt a szám...");
		} else {
			System.out.println("Nem volt benne a szám...");
		}
		System.out.println(eldont(tomb, 101)); //false
		
	}

	public static boolean eldont(int[] tomb, int keresett) {
		boolean valasz = false;
		int i = 0;
		//Amíg a tömb végéig nem érünk és tömb aktuális eleme nem a keresett
		// addig léptetjuk a tömböt
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
