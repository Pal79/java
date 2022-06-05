package progTetelek;

import java.util.Random;

public class Kivalogatas {
	
	public static void main(String[] args) {
		// Kiv�logat�s t�tele: egy halmaz elemi k�z�l kiv�lgatjuk
		// az adott tulajdons�g� elemket
		
		//Feladat: 20 elem� t�mb�t felt�lt�nk v�letlen sz�mokkal 1-10 k�z�tt,
		// p�rosakat a p�ros t�mbbe, p�ratlanokat a p�ratlan t�mbbe helyezz�k.
		// �rjuk ki a t�mb�k elemeit! T�mb�kkel kell dolgozni!!!
		
		// Neh�zs�g: a t�mb m�ret�t meg kell adni, amikor l�trehozzuk
		// ArrayList - sokkal egyszer�bb
		int[] tomb = tombFeltolt();
		System.out.print("A t�mb elemei: ");
		tombKiir(tomb);
		System.out.println();
		
		//System.out.println("p�ros sz�ma: " + parosDbSzamol(tomb));
		int[] parosTomb = new int[parosDbSzamol(tomb)];
		int[] paratlanTomb = new int[tomb.length-parosDbSzamol(parosTomb)];
		
		int parosIndex = 0;
		int paratlanIndex = 0;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i]%2 == 0) {
				//p�rosak a p�ros t�mbbe helyez �s l�ptet
				parosTomb[parosIndex] = tomb[i];
				parosIndex++;
			} else {
				//p�ratlanok a p�ratlan t�mbbe helyez �s l�ptet
				paratlanTomb[paratlanIndex] = tomb[i];
				paratlanIndex++;
			}
		}
		
		System.out.println();
		System.out.println("P�ros t�mb elemei: ");
		tombKiir(parosTomb);
		System.out.println();
		System.out.println("P�ratlan t�mb elemei: ");
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
