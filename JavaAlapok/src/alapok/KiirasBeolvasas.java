package alapok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KiirasBeolvasas {
	
	public static void main(String[] args) throws IOException {
		//Scanner és BufferedReader

		/****************************************************/
		/****************** Scanner ************************/
		/**************************************************/
		
		//System.in - standard bemenet - billentyûzet
		//scObj néven létrejön egy objektumpéldány, new kulcsszó memória terület foglalást jelent
		Scanner scObj = new Scanner(System.in);
		
		//szöveg beolvasása Scanner osztállyal
		System.out.println("Kérem adja meg a nevét(Scanner): ");
		String beolvasottNev = scObj.nextLine();
		System.out.println("A megadott név ez volt: " + beolvasottNev);
		
		//egész szám beolvasása Scanner osztállyal: konvertálásra is szükség van
		//ami a billentyûzetrõl érkezik az String, ha ettõl eltérõ típusba szeretném tárolni
		//akkor konvertálnom kell
		System.out.print("Adja meg az életkorát(egész szám)(Scanner): ");
		int eletKor = Integer.parseInt(scObj.nextLine());
		System.out.println("Kor: " + eletKor);
		
		//törtszám beolvasása Scanner és átalakítással 
		System.out.print("Kérem adja meg a súlyát(törtszám)(Scanner): ");
		double testSuly = Double.parseDouble(scObj.nextLine());
		System.out.println("Testsúly: " + testSuly);
		
		/****************************************************/
		/****************** BufferedReader *****************/
		/**************************************************/
		
		BufferedReader brObj = new BufferedReader(new InputStreamReader(System.in));
		
		//szöveg beolvasása BufferedReader osztállyal
		System.out.print("Adja meg a nevét (BufferedReader): ");
		String beolvasottNev2 = brObj.readLine();
		System.out.println("A megadott név(Br): " + beolvasottNev2);
		
		//egész szám beolvasása BufferedReader osztállyal és konvertálással
		System.out.print("Kérem adja meg a magasságát(cm) - egész szám (BufferedReader): ");
		int magassag = Integer.parseInt(brObj.readLine());
		System.out.println("A megadott magasság(BR): " + magassag + "cm");
		
		//törtszám beolvasása BufferedReader osztállyal és konvertálással
		System.out.print("Adja meg a cipõméretét (törtszám): ");
		double cipoMeret = Double.parseDouble(brObj.readLine());
		System.out.println("A cipõ mérete: " + cipoMeret);		
				
		//Scanner a régebbi osztály, BufferedReader az újabb
		//BufferedReader - gyorsabb a feldolgozás, szálbiztos, szinkronizált és többszálú
		
		//bezárja a brObj-et
		brObj.close();
				
		//bezárja a scObj-ektet- memória terület felszabadítás
		scObj.close();
		
		//itt már a scObj-el való beolvasás nem fog mûködni
	}

}
