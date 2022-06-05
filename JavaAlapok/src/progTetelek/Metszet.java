package progTetelek;

import java.util.Random;

public class Metszet {
	
	public static void main(String[] args) {
		//Metszet: azoknak az elemeknek a kiválasztása, amelyek mind a két 
		// halmazban megtalálhatóak. 
		// Az egyes tömbökön belül nem lehetnek ismétlõdések. 
		
		//metódus hívás - method call
		int[] tombA = tombFeltolt(10, 20);
		int[] tombB = tombFeltolt(12,20);
		
		System.out.print("A tombA elemei: ");
		tombKiir(tombA);
		System.out.println();
		
		System.out.print("A tombB elemei: ");
		tombKiir(tombB);
		System.out.println();
		
		//kiderítjük, hány darab egyezõség van - ez lesz az új tömbnek a mérete
		int szamlalo = 0;
		for (int i = 0; i < tombB.length; i++) {
			if (eldont(tombA, tombB[i])) {
				szamlalo++;
			}
		}
		
		int[] eredmenyTomb = new int[szamlalo];
		int eredmenyTombIndex = 0;
		for (int i = 0; i < tombB.length; i++) {
			if (eldont(tombA, tombB[i])) {
				//eredmeny tömbbe helyezés
				eredmenyTomb[eredmenyTombIndex] = tombB[i];
				eredmenyTombIndex++;
			}
		}
		System.out.print("Metszet:  ");
		tombKiir(eredmenyTomb);
	}

	//metódus deklaráció - method declaration
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
