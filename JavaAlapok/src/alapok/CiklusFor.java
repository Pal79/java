package alapok;

import java.util.Scanner;

public class CiklusFor {
	
	public static void main(String[] args) {
		//Ciklust mikor használunk? 
		// ismétlõdõ utasításra vagy utasításokra van szükség
		
		//For ciklust mikor használjuk?
		//Tudjuk, hogy hányszor kell ismételni.
		//Példákban: ismételd 5X, valahányszor, tömbkezelõ mûveletek, 
		//intervallumon belüli vizsgálat
		
		//Feladat01: Bekérjuk a felhasználó nevét, majd kiírjuk 5X
		Scanner sc = new Scanner(System.in);
		System.out.println("Feladat1 - Név 5X:");
		System.out.print("Kérem adja meg a nevét: ");
		String nev = sc.nextLine();
		
		for (int i = 0; i < 5; i++) {
			//ciklusmag: annyiszor kerül végrehajtásra, ahányszor a ciklus
			System.out.println((i+1) + ".futás: " + nev);
		}
//		for (int i = 0; i < ismetlesSzam; i++) {
//		}		
		System.out.println();
		
		
		//Feladat02: Kérjünk be egy szöveget és ismétlésszámot, majd
		//írjuk ki egymás alá a szöveget annyiszor, amekkora értéket megadtunk!
		System.out.println("Feladat02: szöveg valahányszor: ");
		System.out.print("Kérem adja meg a szöveget: ");
		String szoveg = sc.nextLine();
		System.out.print("Adjon meg egy ismétlésszámot: ");
		int ismetlesSzam = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < ismetlesSzam; i++) {
			System.out.println(szoveg);
		}
		System.out.println();
		
		//Feladat03: Kérjünk be 5 egész számot, majd mindegyikrõl döntsük el, hogy
		//osztható-e hárommal maradék nélkül!
		System.out.println("Feladat03: Osztható -e hárommal:");

		int szamBekert; //deklaráció
		for (int i = 0; i < 5; i++) {
			System.out.print("Kérem adjon meg a: " + (i+1) + "/5 számot: ");
			szamBekert = Integer.parseInt(sc.nextLine()); //definició
			if (szamBekert%3 == 0) {
				System.out.println("Hárommal m.n osztható");
			} else {
				System.out.println("NEM osztható hárommal m.n");
			}
		}		
		System.out.println();
		
		//Feladat04: 10-tól visszafelé 1-ig egyessével, szóközzel elválasztva egymás mellé
		//írjuk ki a számokat
		System.out.println("Feladat4: 10-tõl 1-ig számok egyessével");
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}		
		System.out.println();
		
		//Feladat05: Kérjünk be egy kezdõ és egy végértéket, majd írjuk ki a két érték közötti
		// hárommal és néggyel maradék nélkül osztható számokat (egymás mellé szóközzel elválasztva)
		System.out.println("Feladat05: intervallumvizsgálat");
		System.out.print("Kérem adja meg a kezdõértéket: ");
		int kezdoErtek = Integer.parseInt(sc.nextLine());
		System.out.print("Kérem adja meg a végértéket: ");
		int vegErtek = Integer.parseInt(sc.nextLine());
		for (int i = kezdoErtek; i <= vegErtek; i++) {
			if (i%3 == 0 && i%4 == 0) {
				System.out.print( i + " ");
			}
		}
		sc.close();
	}

}
