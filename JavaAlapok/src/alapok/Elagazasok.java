package alapok;

import java.util.Scanner;

public class Elagazasok {
	
public static void main(String[] args) {
		
		//El�gaz�sok - Mikor haszn�ljuk?
		//Egy felt�telt�l f�gg�en a programunkat valamilyen ir�nyba szeretn�nk
		//vez�relni.
		//H�rom fajt�ja van: egyir�ny�, k�tir�ny� �s t�bb ir�ny�
		
		
		/***********************************************************/
		/**************** Egyir�ny� el�gaz�s **********************/
		/*********************************************************/
		
		//csak az igaz �ggal foglalkozunk
		
		//Feladat01: K�rj�k be a kinti h�m�rs�kletet, majd d�nts�k el, hogy 
		// fagy -e odakint (0 fok alatt van -e)!
		System.out.println("Feladat - 1: Fagy -e? (egyir�ny� el�gaz�s)");
		Scanner sc = new Scanner(System.in);
		System.out.print("K�rem adja meg a kinti h�m�rs�kletet(eg�sz sz�m): ");
		int homerseklet = Integer.parseInt(sc.nextLine());
		
		// a z�r�jelen bel�li r�sz a felt�tel (condition): �gy kell megfogalmazni
		//hogy logikai tipus legyen true(igaz) vagy false(hamis)
		if (homerseklet<0) {
			System.out.println("Fagy odakint!!!"); //Igaz blokk: ha a felt. igaz
		}
		System.out.println(); //sort�r�s
		
		/***********************************************************/
		/**************** K�tir�ny� el�gaz�s **********************/
		/*********************************************************/
		
		//Feladat02: K�rj�nk be egy pozit�v eg�sz sz�mot, majd d�nts�k el,
		//hogy p�ros vagy p�ratlan!
		System.out.println("2. feladat - p�ros - p�ratlan vizsg�lat:");
		System.out.print("K�rem adjon meg egy pozit�v eg�sz sz�mot: ");
		int egeszSzam = Integer.parseInt(sc.nextLine());
		
		// egyenl�s�g vizsg�latn�l 2 db ==
		// TOP1 hiba felt�telen bel�l vki egy 1 db = -et rak!
		if (egeszSzam%2==0) {
			//igaz �g
			//t�bb utas�t�s is szerepelhet itt
			System.out.println("P�ros...");
		} else {
			//hamis �g
			//t�bb utas�t�s is szerepelhet itt
			System.out.println("P�ratlan");
		}
		System.out.println();
		
		/***********************************************************/
		/**************** T�bbir�ny� el�gaz�s **********************/
		/*********************************************************/
		
		//Mikor van r� sz�ks�g? Ha 2-n�l t�bb ir�ny kell.
		//Feladat03: K�rj�nk be k�t eg�sz sz�mot, majd d�nts�k el,
		//melyik kisebb/nagyobb esetleg egyenl�!
		System.out.println("Feladat3: sz�mok vizsg�lata:");
		System.out.print("K�rem adja meg az els� sz�mot: ");
		int elsoSzam = Integer.parseInt(sc.nextLine());
		System.out.print("K�rem adja meg a m�sodik sz�mot: ");
		int masodikSzam = Integer.parseInt(sc.nextLine());
		
		//else-if blokk ak�rh�nyszor ism�tl�dhet
		//if az eleje �s else blokk a v�ge
		if (elsoSzam > masodikSzam) {
			System.out.println("Els� sz�m nagyobb...");
		}
		else if (masodikSzam > elsoSzam) {
			System.out.println("A m�sodik sz�m volt a nagyobb..");
		} else {
			System.out.println("Egyenl�...");
		} 
		System.out.println();
		System.out.println();
		/*
		if (condition1) {
			
		} else if (condition2) {
			
		} else if (condition3) {
			
		} else {
			
		}
		
		*/
		
		//pszeud� - mondatszer� le�r�s
		/*ha (felt�tel), akkor
		 * 		ut1
		 * k�l�nben ha(felt�tel2), akkor
		 * 		ut2
		 * egy�bk�nt ut3
		 */
			
		/***********************************************************/
		/**************** Switch-case *****************************/
		/*********************************************************/

		//T�bbir�ny� el�gaz�st val�s�t meg ez a szerkezet
		//k�t�tt a lehet�s�gek sz�ma
		//csak konkr�t �rt�ket tud vizsg�lni (intervallumot nem)
		
		//Feladat04: Bek�r�nk egy �rdemjegyet sz�mmal, majd ki�rjuk sz�vegesen.
		System.out.print("K�rem adja meg az �rdemjegyet, eg�sz sz�m(1-5): ");
		int erdemJegy = Integer.parseInt(sc.nextLine());
		switch (erdemJegy) {
			case 1: System.out.println("El�gtelen");
				break;
			case 2: System.out.println("El�gs�ges");
				break;
			case 3: System.out.println("K�zepes");
				break;
			case 4: System.out.println("J�");
				break;
			case 5: System.out.println("Jeles");
				break;
			default: System.out.println("Hib�s �rt�ket adott meg!!!");
				break;
		}
		System.out.println();
		//default: alap�rtelmezett: ha egyik �gba sem megy bele
		//break: a switch ut�ni r�szre ugrik- kil�p a switchb�l 
		
		//Feladat: Bek�rjuk a nap sorsz�m�t, majd ki�rjuk sz�vegesen, hogy h�tk�znap vagy 
		// h�tv�ge esetleg hib�s adat.
		System.out.println("Feladat05: h�tk�znap/h�tv�ge:");
		System.out.println("K�rem adja meg a nap sorsz�m�t, eg�sz sz�m(1-7): ");
		int napSorSzam = Integer.parseInt(sc.nextLine());
		switch (napSorSzam) {
			case 1:
			case 2:
			case 3: 
			case 4: 
			case 5: System.out.println("H�tk�znap");
				break;
			case 6: 
			case 7: System.out.println("H�tv�ge");
				break;
		default: System.out.println("Hib�s �rt�ket adt�l meg!!!");
				break;
		}
		System.out.println();
		//sout + ctrl + space
	
		sc.close();
	}

}
