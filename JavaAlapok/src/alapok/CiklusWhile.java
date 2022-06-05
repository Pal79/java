package alapok;

public class CiklusWhile {
	
	public static void main(String[] args) {
		// While ciklus
		// Mikor haszn�ljuk?
		// Nem tudjuk, hogy h�nyszor fut le
		// el�ltesztel�s ciklus:
		// el�sz�r megn�zi a ciklusfelt�telt, ha igaz, akkor lefuttatja azt, 
		// amit a ciklusmagban tal�l
		// lehet, hogy egyszer sem fut le
		// V�gtelen ciklus: nem �r v�get, nem �ll le
		// Mi okozza? Ha rosszul hat�rozzuk meg a kil�p�si felt�telt.
		// Feladatokn�l kulcssz�: am�g
		// tipikus feladat: f�jlkezel�s: am�g a f�jl v�g�ig nem �r�nk
		// NAGYON fontos a ciklusfelt�tel helyes megfogalmaz�sa, 
		// hogy ne legyen v�gtelen ciklus.
		
		//Feladat: Vegy�nk sz�mokat 0-t�l, addig amig a 7-tel oszthat� sz�mok
		//�sszege �t nem l�pi a 100-at!
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
		System.out.println("Sz�ml�l� �rt�ke: " + szamlalo);
		System.out.println("�sszeg �rt�ke: " + osszeg);
		
	}

}
