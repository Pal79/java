package alapok;

public class CiklusWhile {
	
	public static void main(String[] args) {
		// While ciklus
		// Mikor használjuk?
		// Nem tudjuk, hogy hányszor fut le
		// elöltesztelõs ciklus:
		// elõször megnézi a ciklusfeltételt, ha igaz, akkor lefuttatja azt, 
		// amit a ciklusmagban talál
		// lehet, hogy egyszer sem fut le
		// Végtelen ciklus: nem ér véget, nem áll le
		// Mi okozza? Ha rosszul határozzuk meg a kilépési feltételt.
		// Feladatoknál kulcsszó: amíg
		// tipikus feladat: fájlkezelés: amíg a fájl végéig nem érünk
		// NAGYON fontos a ciklusfeltétel helyes megfogalmazása, 
		// hogy ne legyen végtelen ciklus.
		
		//Feladat: Vegyünk számokat 0-tól, addig amig a 7-tel osztható számok
		//összege át nem lépi a 100-at!
		int szamlalo = 0;
		int osszeg = 0;
		while (osszeg < 100) {
			//ciklusmag
			szamlalo++;
			if (szamlalo%7 == 0) {
				osszeg += szamlalo; //osszeg = osszeg + szamlalo;
				System.out.println(szamlalo);
			}
		}
		System.out.println("Számláló értéke: " + szamlalo);
		System.out.println("Összeg értéke: " + osszeg);
		
	}

}
