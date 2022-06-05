package gyujtemenyek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterfacePelda {
	
	public static void main(String[] args) {
		
		/*List interface:
		 * 		rendezett Collection, duplikált elemeket tartalmazhat
		 * 		További jellemzõi:
		 * 			Dinamikus elemhozzáadás, tárolás, beszúrás
		 * 			Tömb hátrányait küszöböli ki
		 * 			Pozíció szerinti elérés (index)
		 * 			Keres
		 * 			Bejárás: for ciklussal, foreach- Interator alapú szolgáltatások
		 * 			(Interable interface - innen származik )
		 * 			Részlista képzés, részlista mûveletek
		 * List interface-n belüli osztályok:
		 * 			ArrayList
		 * 			LinkedList
		 * 			Vector (legacy)
		 * 			Stack (legacy)
		 */

		//Üres, egész számokat tartalmazó lista deklarációja
		List<Integer> szamokLista = new ArrayList<Integer>();
		szamokLista.add(44);
		szamokLista.add(74);
		szamokLista.add(9);
		szamokLista.add(72);
		szamokLista.add(4);
		szamokLista.add(9);
		szamokLista.add(2);
		
		//adott indexû elem elérése: get(int index)
		System.out.println(szamokLista.get(0)); //44
		
		//addott indexû elem törlése
		szamokLista.remove(1); //1-es indexû elem törlése
		
		System.out.println(szamokLista.get(1)); //9

		System.out.println(szamokLista); //debugoláshoz jó lehet
		
		System.out.println("Számok lista mérete: " + szamokLista.size());
		
		//lista bejárása for ciklussal: szükség van az indexre
		System.out.print("Lista elemeinek kiírása for ciklussal: ");
		for (int i = 0; i < szamokLista.size(); i++) {
			System.out.print(szamokLista.get(i) + " ");
		}
		System.out.println();
		
		//lista bejárása foreach szerkezettel: nem kell az index
		System.out.print("Lista elemeinek kiírása foreach szerkezettel: ");
		for (Integer item : szamokLista) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		//Keressük meg a 9-es érték indexét, elsõ elõfordulás: indexOf()
		System.out.println("A 9-es érték elsõ elõfordulásának indexe: " + szamokLista.indexOf(9));
		
		//Ha olyan elemet keresünk, ami nincs benne
		System.out.println("A 99-es érték elsõ elõfordulásának indexe: " + szamokLista.indexOf(99));
		
		//adott érték utolsó elõfordulása
		int utolsoElofordulasIndex = szamokLista.lastIndexOf(9);
		System.out.println("9-es érték utolsó elõfordulásának index: " + utolsoElofordulasIndex);
		
		System.out.println(szamokLista.contains(99)); //false
		
		if (szamokLista.contains(9)) {
			System.out.println("Benne van az érték!!!");
		} else {
			System.out.println("Nincs benne az érték!!!");
		}		
		
		//részlista képzés: sublist()
		List<Integer> szamokReszLista = new ArrayList<Integer>();
		
		szamokReszLista = szamokLista.subList(2, 4);
		System.out.println("Részlista");
		System.out.println(szamokReszLista);
		
		//Arraylist list deklaráció másképp - miért ne ezt használjuk
		//a szamok listából már nem lehet LinkedList-et csinálni, 
		//nem lesz rugalmas a kód
		ArrayList<Integer> szamok = new ArrayList<Integer>();
		szamok.add(55);
		System.out.println(szamok);
		
		List<String> gyumolcsokLista = new ArrayList<String>();
		gyumolcsokLista.add("alma");
	
		//deklaráció és definíció másképp
	    List<String> zoldsegek = new ArrayList<String>(
	    		Arrays.asList(
	    				"Répa",
	    				"Retek",
	    				"Karalábé"));
		
		System.out.println(gyumolcsokLista);
		System.out.println(zoldsegek);
	}

}
