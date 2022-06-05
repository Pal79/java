package kivetelKezelesek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KivetelKezelesek {
	
	public static void main(String[] args) {
		//Kiv�telkezel�s: �tvessz�k a hiba kezel�s�t a ford�t�t�l, 
		// hogy egy �ltalunk meghat�rozott m�don oldjunk meg egy hib�t
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int szamBekert=0;
		try {
			System.out.println("K�rem adjon meg egy eg�sz sz�mot: ");

			//Ebbe a blokkba helyezz�k azokat a k�dokat, amelyek hib�t dobhatnak
			// Az itt deklar�lt v�ltoz� lok�lis lesz, a blokkon kiv�l nem el�rhet�
			//br.close(); //null lesz a br �rt�keke
			//ez a sor defin�ci�: a szamBekert v�ltoz� �rt�ket kap			
			szamBekert = Integer.parseInt(br.readLine());
			System.out.println("A megadott sz�m ez volt: " + szamBekert);
			
		} catch (NumberFormatException e) {
			// ha nem eg�sz sz�mot adok meg, hanem pld. t�rtsz�mot vagy karaktereket
			//e.printStackTrace();
			System.out.println("Eg�sz sz�mot k�rtem!!!");
		} catch (IOException e) {
			// Ha kor�bban z�rjuk be az olvas� adatfolyamot. 
			// e.printStackTrace();
			System.out.println("IO hiba");
		} catch (Exception e) {
			// B�rmilyen m�s hiba
			System.out.println("B�rmilyen hiba");
		} finally {
			//nem k�telez� r�sze a try-catch blokknak
			//mindenk�ppen lefut
			//tisztogat�sra, mem�ria ter�let felszabad�t�s�ra
			System.out.println("Kiv�telkezel�ssel megoldott adatbek�r�s!");
		}
		System.out.println(szamBekert);
		//Speci�list�l megy�nk az �ltal�nosabbig
		
		//Tov�bbi kiv�telkezel� oszt�lyok: 
		//ArrayIndexOutOfBoundsException: - olyan elemre hivatkozok a t�mb�n bel�l, ami nincs
		//IOException: IO hiba, f�jlkezel�s �s olvas�/�r� adatfolyamok
		//FileNotFoundException: - nem tal�lja a f�jlt a megadott el�r�si �ton �s n�vvel
		//ArithmeticException - Null�val val� oszt�s �s matematikai kiv�telek
		
		//Feladat: k�rj�nk be k�t eg�sz sz�mot hibakezel�ssel, majd osszuk el az els�t a m�sodikkal!
		// 0-val val� oszt�sra figyelj�nk!
		System.out.println();
		System.out.println("2. feladat:");
		try {
			System.out.println("K�rem adja meg az osztand�t(eg�sz sz�m): ");
			int osztando = Integer.parseInt(br.readLine());
			System.out.println("K�rem adja meg az oszt�t(eg�sz sz�m): ");
			int oszto = Integer.parseInt(br.readLine());
			double eredmeny = (double)osztando/oszto;
			System.out.println(eredmeny);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Nem eg�sz sz�mot adt�l meg!!!");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("0-val val� oszt�s tiltott!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Valamilyen hiba t�rt�nt...");
		}
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//A kiv�teleknek k�t csoportja: 
		// - checked: pld. IO m�veletek - ford�t�si id�ben dobnak hib�t
		// - unchecked: fut�si id�ben dob hib�t pld NumberFormatException
	}

}
