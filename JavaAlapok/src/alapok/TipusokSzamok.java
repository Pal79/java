package alapok;

public class TipusokSzamok {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Egész számok - primitív típus
		int szam; //deklaráció: szám nevű változó, amelynek a típusa egész szám
		szam = 100; //definició: értéket kap
		
		int szam2 = 200; //deklaráció és definició
		System.out.println("Két szám összege: " + szam + szam2);
		// + operátor összefűzés (konkannetáció)
		
		System.out.println("Két szám összege: " + (szam + szam2));

		//adattípusok - számok esetében
		/*
		 * byte - 8bit: -128 és +127
		 * short 16bit: -32768 és +32767 között
		 * int 4byte: +- kb. 2milliárd
		 * long 8 byte
		 * 
		 * float - egyszeres pontosságú lebegőpontos (törtszám)
		 * double - kétszeres pontosságú lebegőpontos (törtszám)
		 * 
		 */
		
		System.out.println("int max értéke: " + Integer.MAX_VALUE);
		System.out.println("int min értéke: " + Integer.MIN_VALUE);
		
		int tesztSzam = Integer.MAX_VALUE + 5;
		System.out.println(tesztSzam); //-2147483644
		
		System.out.println("short max értéke: " + Short.MAX_VALUE); //32767
		System.out.println("long max értéke: " + Long.MAX_VALUE);
		
		double tortSzam = 10/3;
		System.out.println(tortSzam); //3.0 ADATVESZT�S (egész számot egész számmal osztottam)
		
		//Hogyan lehet megoldani?
		
		//1. Megoldás
		double tortSzam1 = 10.0/3;
		System.out.println(tortSzam1);
		
		//2. Megoldás
		double tortSzam2 = 10/3f;
		System.out.println(tortSzam2);
		
		//3. Megoldás
		double tortSzam3 = 10/3d;
		System.out.println(tortSzam3);
		
		//4. Megoldás: típuskényszerítés: kasztolás 
		double tortSzam4 = (double)10/3;
		System.out.println(tortSzam4);
		
		//int vs Integer
		//int primitív tipus
		//Integer - object
		
		//érték tipus (mem. tárolás)
		@SuppressWarnings("unused")
		int szamPrimitiv = 44;
		
		//referencia tipus (mem. tárolás)
		@SuppressWarnings("unused")
		Integer szamObj = 55;
		
		//int szamPrimitívTeszt = null; //hibára fut
		@SuppressWarnings("unused")
		Integer szamObjTeszt = null;
		int szamPrimitivTeszt2 = 0;
		
		//Byte és byte stb.
		
	}

}
