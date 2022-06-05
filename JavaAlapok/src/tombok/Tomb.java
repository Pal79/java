package tombok;

import java.util.Random;
import java.util.Scanner;

public class Tomb {
	
	public static void main(String[] args) {
		// T�mb: �sszetett adatt�pus,
		// t�bb azonos t�pus� �rt�k t�rol�s�ra alkalmas,
		// az elemeket a t�mb nev�vel �s index�vel �ratjuk ki
		// Fontos k�t�tts�g: meg kell adnunk, hogy milyen t�pusokat t�rol �s
		// l�trehoz�skor meg kell adni a m�ret�t is (vagy az egyes elemeket)
		// az indexel�s 0-t�l indul
		// Egy dimenzi�s t�mb - vektor

		int[] tomb = {3,6,77,22,98}; 
		System.out.println(tomb[2]);//77
		System.out.println(tomb[3]);//22
		tomb[2] = 43;
		System.out.println(tomb[2]); //43
		
		//t�mbm�ret lek�rdez�s
		System.out.println("A t�mb m�rete: " + tomb.length);
		
		//utols� elem ki�r�sa
		System.out.println("Az utols� elem: " + tomb[tomb.length-1]);
		//System.out.println("Az utols� elem m�sk�nt: " + tomb[5]);
		//ArrayIndexOutOfBoundsException
		//System.out.println("Az utols� elem m�sk�nt: " + tomb[4]);
		
		System.out.println();		
		//System.out.println(tomb); //[I@7852e922
		
		//t�mbbej�r�s - For ciklussal
		System.out.println("A t�mb elemei: ");
		for (int i = 0; i < tomb.length; i++) {
			System.out.print(tomb[i] + " ");
		}
		System.out.println();
		
		//t�mbbej�r�s - Foreach szerkezettel
		//ha nem fontos az indexel�s, akkor bej�rhatjuk ezzel is
		//Vegy�l minden egyes elemet egym�s ut�n a t�mb�n bel�l
		System.out.println("A t�mb bej�r�sa FOREACH szerkezettel: ");
		for (int item : tomb) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		//String t�mb deklar�ci�s �s definici�ja
		String[] nevek = {"Elek", "J�nos", "Tam�s"};
		System.out.println(nevek[2]); //Tam�s
		//System.out.println(nevek[3]); //ArrayIndexOutOfBoundsException
		
		char[] karakterek = {'g','r','w'};
		System.out.println(karakterek[1]); //r
		
		//Feladat01: T�lts�nk fel egy 20 elem� t�mb�t v�letlen sz�mokkal 1-100
		// k�z�tt, majd �rjuk ki a t�mb elemeit egym�s mell�!
		
		int[] tombVeletlen = new int[20]; //�res 20 elem� t�mb deklar�ci�:
		//20*4byte - new kulcsz� mem�ria foglal�s
		
		System.out.println(tombVeletlen[0]); //els� elem a t�mb�n bel�l: 0
		System.out.println("T�mb elemei 0-val:");
		for (int item : tombVeletlen) {
			System.out.print(item + " ");
		}
		System.out.println();
		System.out.println();
		
		Random r = new Random();
		for (int i = 0; i < tombVeletlen.length; i++) {
			tombVeletlen[i] = r.nextInt(100)+1;
		}
		
		//tombki�r�s - Foreach szerkezettel
		System.out.print("A v�letlen t�mb elemei: ");
		for (int item : tombVeletlen) {
			System.out.print(item + " ");
		}
		System.out.println();
		System.out.println();
				
		//Feladat02: 5 elem� t�mb felt�lt�se a felhaszn�l�t�l �rkez� eg�sz sz�mokkal
		Scanner sc = new Scanner(System.in);
		int[] tomb2 = new int[5];
		for (int i = 0; i < tomb2.length; i++) {
			System.out.print("Adja meg a " + (i+1) + "/5 elemet: ");
			tomb2[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.print("Tomb2 elemei: ");
		for (int item : tomb2) {
			System.out.print(item + " ");
		}
		
		sc.close();
	}

}
