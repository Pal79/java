package alapok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class CiklusDoWhile {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//Do-While ciklus
		// itt sem tudjuk, hogy h�nyszor kell ism�telni
		//h�tultesztel�s ciklus
		// egyszer biztosan lefut, ut�na ellen�rzi a felt�telt, 
		// ha igaz, akkor belemegy a ciklusba �s v�grehajta, amit a ciklusmagban tal�l

		//Feladat1: Addig k�rek be sz�mokat, am�g 0-at nem adok meg!
		System.out.println("Feladat01: Sz�mok, am�g nem 0:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//szamBekert v�ltoz�n�l a dek. �s def. sz�tszedjuk, az�rt, hogy a felt�teln�l 
		//l�ssa a ciklus
		int szamBekert;
		do {
			System.out.print("Adjon meg egy eg�sz sz�mot (0-ra kil�p): ");
			szamBekert = Integer.parseInt(br.readLine());
		} while (szamBekert !=0);
		System.out.println("Kil�ptem, mert 0-at adt�l meg...");
		
		//Feladat02: Addig dobok 6oldal� kock�val, am�g 6-os nem lesz
		System.out.println("Feladat02: kockadob�s 6-osig");
		Random r = new Random();
		int velSzam;
		do {
			velSzam = r.nextInt(6)+1;
			System.out.print(velSzam + " ");
		} while (velSzam !=6);
		System.out.println();
		System.out.println("6-ost dobt�l gratul�lok!!!");
		
		br.close();
	}

}
