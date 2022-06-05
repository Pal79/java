package alapok;

public class TipusokSzoveg {

	public static void main(String[] args) {
		
		//Szöveg és karakterek - String és char
		char betu = 'R'; //szimpla aposztrof
		//char betuHiba = "K"; //hiba
		
		System.out.println(betu);
		
		String szoveg; //deklaráció: szoveg nevû string tipusú változó
		szoveg = "teszt szöveg"; //definíció: érték
		
		//Kiírás és hozzáfûzés + operátorral
		System.out.println("A szöveg változó tartalma: " + szoveg + "...");
		
		//string literál felvétele: dek és def egy sorban
		String szoveg2 ="Teszt szöveg2";
		System.out.println(szoveg2);
		
		String szoveg3 = "Ez egy java \n String (új sorban...)";
		System.out.println(szoveg3);
		
		//speciális karakterek
		// \n - sortörés
		// \t - tabulátor
		// \b - backspace
		
		System.out.println(szoveg + "\"\t" + szoveg2);
		
		//Stringkezelõ metódusok - késõbb a feladatmegoldások során
		System.out.println(szoveg.contains("Teszt")); //false
		
		/******************************************************************/
		/************* Stringek összehasonlítása *************************/
		/****************************************************************/
		// == javaban nem mûködik (hashkódokat hasonlít össze)
		// equals - metódussal kell megoldani
		
		System.out.println(szoveg.equals("teszt szöveg")); //true
		System.out.println(szoveg.equals(szoveg2)); //false
		//if (szoveg==szoveg2) - EZ NEM JÓ
		// if (szoveg.equals(szoveg2)) - így kell megoldani
		
		//String immutable object - nem lehet megváltoztatni a karaktereket
		//elérni el tudom (lekérdezni le tudom), de megváltoztatni nem
		String nev = "Teszt Elek";
		System.out.println(nev.charAt(0));
		//nev.charAt(0) = 't';
				
		//felülírást - StringBuilder osztállyal lehet megoldani

	}

}
