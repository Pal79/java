package metodusok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Udvozles {
	
	public static void main(String[] args) throws IOException {
		// Met�dus: mindig valamilyen m�veletet v�gez
		// egyszer deklar�ljuk, t�bbsz�r meg lehet h�vni
		// mindig viselked�st fejez�nk ki vele, (ige)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("K�rem adja meg a teljes nev�t: ");
		String nevBekert = br.readLine();
		//met�dus h�v�s
		udvozlesKiir(nevBekert); //aktu�lis param�ter csak sz�veg lehet nevBekert
		
		System.out.println("K�rem adja meg a vezet�knev�t: ");
		String vezNevBekert = br.readLine();
		System.out.println("K�rem adja meg a keresztnev�t: ");
		String kerNevBekert = br.readLine();
		udvozlesKiir(vezNevBekert, kerNevBekert);
		
	}
	
	//met�dus deklar�ci�
	//form�lis param�ter: nev: sz�veg
	public static void udvozlesKiir(String nev) {
		System.out.println("�dv�z�llek, " + nev + "!");
	}
	
	public static void udvozlesKiir(String vezNev, String kerNev) {
		System.out.println("�dv�z�llek, " + vezNev + " " + kerNev + "...");
	}

}
