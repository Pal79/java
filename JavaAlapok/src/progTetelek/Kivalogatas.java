package progTetelek;

import java.util.Random;

public class Kivalogatas {
	
	public static void main(String[] args) {
		// Kiválogatás tétele: egy halmaz elemi közül kiválgatjuk
		// az adott tulajdonságú elemket
		
		//Feladat: 20 elemû tömböt feltöltünk véletlen számokkal 1-10 között,
		// párosakat a páros tömbbe, páratlanokat a páratlan tömbbe helyezzék.
		// Írjuk ki a tömbök elemeit! Tömbökkel kell dolgozni!!!
		
		// Nehézség: a tömb méretét meg kell adni, amikor létrehozzuk
		// ArrayList - sokkal egyszerûbb
		int[] tomb = tombFeltolt();
		System.out.print("A tömb elemei: ");
		tombKiir(tomb);
		System.out.println();
		
		//System.out.println("páros száma: " + parosDbSzamol(tomb));
		int[] parosTomb = new int[parosDbSzamol(tomb)];
		int[] paratlanTomb = new int[tomb.length-parosDbSzamol(parosTomb)];
		
		int parosIndex = 0;
		int paratlanIndex = 0;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i]%2 == 0) {
				//párosak a páros tömbbe helyez és léptet
				parosTomb[parosIndex] = tomb[i];
				parosIndex++;
			} else {
				//páratlanok a páratlan tömbbe helyez és léptet
				paratlanTomb[paratlanIndex] = tomb[i];
				paratlanIndex++;
			}
		}
		
		System.out.println();
		System.out.println("Páros tömb elemei: ");
		tombKiir(parosTomb);
		System.out.println();
		System.out.println("Páratlan tömb elemei: ");
		tombKiir(paratlanTomb);		
	}
	
	public static int parosDbSzamol(int[] tomb) {
		int db = 0;
		for (int item : tomb) {
			if (item %2==0) {
				db++;
			}
		}
		return db;
	}
	
	public static int[] tombFeltolt() {
		Random r = new Random();
		int[] tomb = new int[20];
		for (int i = 0; i < tomb.length; i++) {
			tomb[i]  = r.nextInt(10)+1;
		}
		return tomb;
	}
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}

}
