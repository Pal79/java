package progTetelek;

import java.util.Random;

public class Unio {
	
	public static void main(String[] args) {
		// Unio: k�t halmaz elemei k�z�l legal�bb az egyikben szerepelnie kell.
		// A halmazokon bel�l nincs ism�tl�d�s
		int[] tombA = tombFeltolt(10, 20);
		int[] tombB = tombFeltolt(12,20);

		System.out.print("A tombA elemei: ");
		tombKiir(tombA);
		System.out.println();
		
		System.out.print("A tombB elemei: ");
		tombKiir(tombB);
		System.out.println();
		
		int eredmenyTombMeret = (tombA.length+tombB.length)-
				egyezosegekSzamaMeghataroz(tombA, tombB);
		//System.out.println(eredmenyTombMeret);
		int[] eredmenyTomb = new int[eredmenyTombMeret];
		
		//1.l�p�s tombA-b�l minden elemet belepakolok az eredmenyt�mbbe
		for (int i = 0; i < tombA.length; i++) {
			eredmenyTomb[i] = tombA[i];
		}
		
		//2. l�p�s: tombB-b�l azokat helyezz�k bele, ami m�g nincs benne
		int eredmenyTombIndex = tombA.length;
		for (int i = 0; i < tombB.length; i++) {
			if (!eldont(eredmenyTomb, tombB[i])) {
				eredmenyTomb[eredmenyTombIndex] = tombB[i];
				eredmenyTombIndex++;
			}
		}
		
		System.out.print("Unio: ");
		tombKiir(eredmenyTomb);
		
	}
	
	//tombElso - form�lis param�ter a met�dus deklar�ci�n bel�l
	private static int egyezosegekSzamaMeghataroz(int[] tombElso, int[] tombMasodik) {
		int szamlalo = 0;
		for (int i = 0; i < tombMasodik.length; i++) {
			if (eldont(tombElso, tombMasodik[i])) {
				szamlalo++;
			}
		}
		return szamlalo;
	}
	
	//met�dus deklar�ci� - method declaration
	private static int[] tombFeltolt(int meret, int velFelsoHatar) {
		int[] tomb = new int[meret];
		Random r = new Random();
		int veletlenSzam;
		for (int i = 0; i < tomb.length; i++) {
			do {
				veletlenSzam = r.nextInt(velFelsoHatar) +1;
			} while (eldont(tomb, veletlenSzam));
			tomb[i] = veletlenSzam;
		}
		return tomb;
	}

	private static boolean eldont(int[] tomb, int keresett) {
		boolean benneVan = false;
		int i = 0;
		do {
			if (tomb[i]==keresett) {
				benneVan = true;
			}
			i++;
		} while (!benneVan && i<tomb.length);
		return benneVan;
	}
	
	private static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}

}
