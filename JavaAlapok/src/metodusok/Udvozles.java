package metodusok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Udvozles {
	
	public static void main(String[] args) throws IOException {
		// Metódus: mindig valamilyen mûveletet végez
		// egyszer deklaráljuk, többször meg lehet hívni
		// mindig viselkedést fejezünk ki vele, (ige)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Kérem adja meg a teljes nevét: ");
		String nevBekert = br.readLine();
		//metódus hívás
		udvozlesKiir(nevBekert); //aktuális paraméter csak szöveg lehet nevBekert
		
		System.out.println("Kérem adja meg a vezetéknevét: ");
		String vezNevBekert = br.readLine();
		System.out.println("Kérem adja meg a keresztnevét: ");
		String kerNevBekert = br.readLine();
		udvozlesKiir(vezNevBekert, kerNevBekert);
		
	}
	
	//metódus deklaráció
	//formális paraméter: nev: szöveg
	public static void udvozlesKiir(String nev) {
		System.out.println("Üdvözöllek, " + nev + "!");
	}
	
	public static void udvozlesKiir(String vezNev, String kerNev) {
		System.out.println("Üdvözöllek, " + vezNev + " " + kerNev + "...");
	}

}
