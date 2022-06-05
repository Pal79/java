package kivetelKezelesek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KivetelKezelesek {
	
	public static void main(String[] args) {
		//Kivételkezelés: átvesszük a hiba kezelését a fordítótól, 
		// hogy egy általunk meghatározott módon oldjunk meg egy hibát
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int szamBekert=0;
		try {
			System.out.println("Kérem adjon meg egy egész számot: ");

			//Ebbe a blokkba helyezzük azokat a kódokat, amelyek hibát dobhatnak
			// Az itt deklarált változó lokális lesz, a blokkon kivûl nem elérhetõ
			//br.close(); //null lesz a br értékeke
			//ez a sor definíció: a szamBekert változó értéket kap			
			szamBekert = Integer.parseInt(br.readLine());
			System.out.println("A megadott szám ez volt: " + szamBekert);
			
		} catch (NumberFormatException e) {
			// ha nem egész számot adok meg, hanem pld. törtszámot vagy karaktereket
			//e.printStackTrace();
			System.out.println("Egész számot kértem!!!");
		} catch (IOException e) {
			// Ha korábban zárjuk be az olvasó adatfolyamot. 
			// e.printStackTrace();
			System.out.println("IO hiba");
		} catch (Exception e) {
			// Bármilyen más hiba
			System.out.println("Bármilyen hiba");
		} finally {
			//nem kötelezõ része a try-catch blokknak
			//mindenképpen lefut
			//tisztogatásra, memória terület felszabadítására
			System.out.println("Kivételkezeléssel megoldott adatbekérés!");
		}
		System.out.println(szamBekert);
		//Speciálistól megyünk az általánosabbig
		
		//További kivételkezelõ osztályok: 
		//ArrayIndexOutOfBoundsException: - olyan elemre hivatkozok a tömbön belül, ami nincs
		//IOException: IO hiba, fájlkezelés és olvasó/író adatfolyamok
		//FileNotFoundException: - nem találja a fájlt a megadott elérési úton és névvel
		//ArithmeticException - Nullával való osztás és matematikai kivételek
		
		//Feladat: kérjünk be két egész számot hibakezeléssel, majd osszuk el az elsõt a másodikkal!
		// 0-val való osztásra figyeljünk!
		System.out.println();
		System.out.println("2. feladat:");
		try {
			System.out.println("Kérem adja meg az osztandót(egész szám): ");
			int osztando = Integer.parseInt(br.readLine());
			System.out.println("Kérem adja meg az osztót(egész szám): ");
			int oszto = Integer.parseInt(br.readLine());
			double eredmeny = (double)osztando/oszto;
			System.out.println(eredmeny);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Nem egész számot adtál meg!!!");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("0-val való osztás tiltott!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Valamilyen hiba történt...");
		}
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//A kivételeknek két csoportja: 
		// - checked: pld. IO mûveletek - fordítási idõben dobnak hibát
		// - unchecked: futási idõben dob hibát pld NumberFormatException
	}

}
