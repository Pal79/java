package alapok;

public class TipusokSzoveg {

	public static void main(String[] args) {
		
		//Sz�veg �s karakterek - String �s char
		char betu = 'R'; //szimpla aposztrof
		//char betuHiba = "K"; //hiba
		
		System.out.println(betu);
		
		String szoveg; //deklar�ci�: szoveg nev� string tipus� v�ltoz�
		szoveg = "teszt sz�veg"; //defin�ci�: �rt�k
		
		//Ki�r�s �s hozz�f�z�s + oper�torral
		System.out.println("A sz�veg v�ltoz� tartalma: " + szoveg + "...");
		
		//string liter�l felv�tele: dek �s def egy sorban
		String szoveg2 ="Teszt sz�veg2";
		System.out.println(szoveg2);
		
		String szoveg3 = "Ez egy java \n String (�j sorban...)";
		System.out.println(szoveg3);
		
		//speci�lis karakterek
		// \n - sort�r�s
		// \t - tabul�tor
		// \b - backspace
		
		System.out.println(szoveg + "\"\t" + szoveg2);
		
		//Stringkezel� met�dusok - k�s�bb a feladatmegold�sok sor�n
		System.out.println(szoveg.contains("Teszt")); //false
		
		/******************************************************************/
		/************* Stringek �sszehasonl�t�sa *************************/
		/****************************************************************/
		// == javaban nem m�k�dik (hashk�dokat hasonl�t �ssze)
		// equals - met�dussal kell megoldani
		
		System.out.println(szoveg.equals("teszt sz�veg")); //true
		System.out.println(szoveg.equals(szoveg2)); //false
		//if (szoveg==szoveg2) - EZ NEM J�
		// if (szoveg.equals(szoveg2)) - �gy kell megoldani
		
		//String immutable object - nem lehet megv�ltoztatni a karaktereket
		//el�rni el tudom (lek�rdezni le tudom), de megv�ltoztatni nem
		String nev = "Teszt Elek";
		System.out.println(nev.charAt(0));
		//nev.charAt(0) = 't';
				
		//fel�l�r�st - StringBuilder oszt�llyal lehet megoldani

	}

}
