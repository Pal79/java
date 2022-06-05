package alapok;

import java.util.Scanner;

public class CiklusFor {
	
	public static void main(String[] args) {
		//Ciklust mikor haszn�lunk? 
		// ism�tl�d� utas�t�sra vagy utas�t�sokra van sz�ks�g
		
		//For ciklust mikor haszn�ljuk?
		//Tudjuk, hogy h�nyszor kell ism�telni.
		//P�ld�kban: ism�teld 5X, valah�nyszor, t�mbkezel� m�veletek, 
		//intervallumon bel�li vizsg�lat
		
		//Feladat01: Bek�rjuk a felhaszn�l� nev�t, majd ki�rjuk 5X
		Scanner sc = new Scanner(System.in);
		System.out.println("Feladat1 - N�v 5X:");
		System.out.print("K�rem adja meg a nev�t: ");
		String nev = sc.nextLine();
		
		for (int i = 0; i < 5; i++) {
			//ciklusmag: annyiszor ker�l v�grehajt�sra, ah�nyszor a ciklus
			System.out.println((i+1) + ".fut�s: " + nev);
		}
//		for (int i = 0; i < ismetlesSzam; i++) {
//		}		
		System.out.println();
		
		
		//Feladat02: K�rj�nk be egy sz�veget �s ism�tl�ssz�mot, majd
		//�rjuk ki egym�s al� a sz�veget annyiszor, amekkora �rt�ket megadtunk!
		System.out.println("Feladat02: sz�veg valah�nyszor: ");
		System.out.print("K�rem adja meg a sz�veget: ");
		String szoveg = sc.nextLine();
		System.out.print("Adjon meg egy ism�tl�ssz�mot: ");
		int ismetlesSzam = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < ismetlesSzam; i++) {
			System.out.println(szoveg);
		}
		System.out.println();
		
		//Feladat03: K�rj�nk be 5 eg�sz sz�mot, majd mindegyikr�l d�nts�k el, hogy
		//oszthat�-e h�rommal marad�k n�lk�l!
		System.out.println("Feladat03: Oszthat� -e h�rommal:");

		int szamBekert; //deklar�ci�
		for (int i = 0; i < 5; i++) {
			System.out.print("K�rem adjon meg a: " + (i+1) + "/5 sz�mot: ");
			szamBekert = Integer.parseInt(sc.nextLine()); //definici�
			if (szamBekert%3 == 0) {
				System.out.println("H�rommal m.n oszthat�");
			} else {
				System.out.println("NEM oszthat� h�rommal m.n");
			}
		}		
		System.out.println();
		
		//Feladat04: 10-t�l visszafel� 1-ig egyess�vel, sz�k�zzel elv�lasztva egym�s mell�
		//�rjuk ki a sz�mokat
		System.out.println("Feladat4: 10-t�l 1-ig sz�mok egyess�vel");
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}		
		System.out.println();
		
		//Feladat05: K�rj�nk be egy kezd� �s egy v�g�rt�ket, majd �rjuk ki a k�t �rt�k k�z�tti
		// h�rommal �s n�ggyel marad�k n�lk�l oszthat� sz�mokat (egym�s mell� sz�k�zzel elv�lasztva)
		System.out.println("Feladat05: intervallumvizsg�lat");
		System.out.print("K�rem adja meg a kezd��rt�ket: ");
		int kezdoErtek = Integer.parseInt(sc.nextLine());
		System.out.print("K�rem adja meg a v�g�rt�ket: ");
		int vegErtek = Integer.parseInt(sc.nextLine());
		for (int i = kezdoErtek; i <= vegErtek; i++) {
			if (i%3 == 0 && i%4 == 0) {
				System.out.print( i + " ");
			}
		}
		sc.close();
	}

}
