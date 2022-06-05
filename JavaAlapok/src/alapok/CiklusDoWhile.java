package alapok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class CiklusDoWhile {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//Do-While ciklus
		// itt sem tudjuk, hogy hányszor kell ismételni
		//hátultesztelõs ciklus
		// egyszer biztosan lefut, utána ellenõrzi a feltételt, 
		// ha igaz, akkor belemegy a ciklusba és végrehajta, amit a ciklusmagban talál

		//Feladat1: Addig kérek be számokat, amíg 0-at nem adok meg!
		System.out.println("Feladat01: Számok, amíg nem 0:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//szamBekert változónál a dek. és def. szétszedjuk, azért, hogy a feltételnél 
		//lássa a ciklus
		int szamBekert;
		do {
			System.out.print("Adjon meg egy egész számot (0-ra kilép): ");
			szamBekert = Integer.parseInt(br.readLine());
		} while (szamBekert !=0);
		System.out.println("Kiléptem, mert 0-at adtál meg...");
		
		//Feladat02: Addig dobok 6oldalú kockával, amíg 6-os nem lesz
		System.out.println("Feladat02: kockadobás 6-osig");
		Random r = new Random();
		int velSzam;
		do {
			velSzam = r.nextInt(6)+1;
			System.out.print(velSzam + " ");
		} while (velSzam !=6);
		System.out.println();
		System.out.println("6-ost dobtál gratulálok!!!");
		
		br.close();
	}

}
