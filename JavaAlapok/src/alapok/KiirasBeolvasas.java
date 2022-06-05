package alapok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KiirasBeolvasas {
	
	public static void main(String[] args) throws IOException {
		//Scanner �s BufferedReader

		/****************************************************/
		/****************** Scanner ************************/
		/**************************************************/
		
		//System.in - standard bemenet - billenty�zet
		//scObj n�ven l�trej�n egy objektump�ld�ny, new kulcssz� mem�ria ter�let foglal�st jelent
		Scanner scObj = new Scanner(System.in);
		
		//sz�veg beolvas�sa Scanner oszt�llyal
		System.out.println("K�rem adja meg a nev�t(Scanner): ");
		String beolvasottNev = scObj.nextLine();
		System.out.println("A megadott n�v ez volt: " + beolvasottNev);
		
		//eg�sz sz�m beolvas�sa Scanner oszt�llyal: konvert�l�sra is sz�ks�g van
		//ami a billenty�zetr�l �rkezik az String, ha ett�l elt�r� t�pusba szeretn�m t�rolni
		//akkor konvert�lnom kell
		System.out.print("Adja meg az �letkor�t(eg�sz sz�m)(Scanner): ");
		int eletKor = Integer.parseInt(scObj.nextLine());
		System.out.println("Kor: " + eletKor);
		
		//t�rtsz�m beolvas�sa Scanner �s �talak�t�ssal 
		System.out.print("K�rem adja meg a s�ly�t(t�rtsz�m)(Scanner): ");
		double testSuly = Double.parseDouble(scObj.nextLine());
		System.out.println("Tests�ly: " + testSuly);
		
		/****************************************************/
		/****************** BufferedReader *****************/
		/**************************************************/
		
		BufferedReader brObj = new BufferedReader(new InputStreamReader(System.in));
		
		//sz�veg beolvas�sa BufferedReader oszt�llyal
		System.out.print("Adja meg a nev�t (BufferedReader): ");
		String beolvasottNev2 = brObj.readLine();
		System.out.println("A megadott n�v(Br): " + beolvasottNev2);
		
		//eg�sz sz�m beolvas�sa BufferedReader oszt�llyal �s konvert�l�ssal
		System.out.print("K�rem adja meg a magass�g�t(cm) - eg�sz sz�m (BufferedReader): ");
		int magassag = Integer.parseInt(brObj.readLine());
		System.out.println("A megadott magass�g(BR): " + magassag + "cm");
		
		//t�rtsz�m beolvas�sa BufferedReader oszt�llyal �s konvert�l�ssal
		System.out.print("Adja meg a cip�m�ret�t (t�rtsz�m): ");
		double cipoMeret = Double.parseDouble(brObj.readLine());
		System.out.println("A cip� m�rete: " + cipoMeret);		
				
		//Scanner a r�gebbi oszt�ly, BufferedReader az �jabb
		//BufferedReader - gyorsabb a feldolgoz�s, sz�lbiztos, szinkroniz�lt �s t�bbsz�l�
		
		//bez�rja a brObj-et
		brObj.close();
				
		//bez�rja a scObj-ektet- mem�ria ter�let felszabad�t�s
		scObj.close();
		
		//itt m�r a scObj-el val� beolvas�s nem fog m�k�dni
	}

}
