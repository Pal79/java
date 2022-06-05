package gyujtemenyek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterfacePelda {
	
	public static void main(String[] args) {
		
		/*List interface:
		 * 		rendezett Collection, duplik�lt elemeket tartalmazhat
		 * 		Tov�bbi jellemz�i:
		 * 			Dinamikus elemhozz�ad�s, t�rol�s, besz�r�s
		 * 			T�mb h�tr�nyait k�sz�b�li ki
		 * 			Poz�ci� szerinti el�r�s (index)
		 * 			Keres
		 * 			Bej�r�s: for ciklussal, foreach- Interator alap� szolg�ltat�sok
		 * 			(Interable interface - innen sz�rmazik )
		 * 			R�szlista k�pz�s, r�szlista m�veletek
		 * List interface-n bel�li oszt�lyok:
		 * 			ArrayList
		 * 			LinkedList
		 * 			Vector (legacy)
		 * 			Stack (legacy)
		 */

		//�res, eg�sz sz�mokat tartalmaz� lista deklar�ci�ja
		List<Integer> szamokLista = new ArrayList<Integer>();
		szamokLista.add(44);
		szamokLista.add(74);
		szamokLista.add(9);
		szamokLista.add(72);
		szamokLista.add(4);
		szamokLista.add(9);
		szamokLista.add(2);
		
		//adott index� elem el�r�se: get(int index)
		System.out.println(szamokLista.get(0)); //44
		
		//addott index� elem t�rl�se
		szamokLista.remove(1); //1-es index� elem t�rl�se
		
		System.out.println(szamokLista.get(1)); //9

		System.out.println(szamokLista); //debugol�shoz j� lehet
		
		System.out.println("Sz�mok lista m�rete: " + szamokLista.size());
		
		//lista bej�r�sa for ciklussal: sz�ks�g van az indexre
		System.out.print("Lista elemeinek ki�r�sa for ciklussal: ");
		for (int i = 0; i < szamokLista.size(); i++) {
			System.out.print(szamokLista.get(i) + " ");
		}
		System.out.println();
		
		//lista bej�r�sa foreach szerkezettel: nem kell az index
		System.out.print("Lista elemeinek ki�r�sa foreach szerkezettel: ");
		for (Integer item : szamokLista) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		//Keress�k meg a 9-es �rt�k index�t, els� el�fordul�s: indexOf()
		System.out.println("A 9-es �rt�k els� el�fordul�s�nak indexe: " + szamokLista.indexOf(9));
		
		//Ha olyan elemet keres�nk, ami nincs benne
		System.out.println("A 99-es �rt�k els� el�fordul�s�nak indexe: " + szamokLista.indexOf(99));
		
		//adott �rt�k utols� el�fordul�sa
		int utolsoElofordulasIndex = szamokLista.lastIndexOf(9);
		System.out.println("9-es �rt�k utols� el�fordul�s�nak index: " + utolsoElofordulasIndex);
		
		System.out.println(szamokLista.contains(99)); //false
		
		if (szamokLista.contains(9)) {
			System.out.println("Benne van az �rt�k!!!");
		} else {
			System.out.println("Nincs benne az �rt�k!!!");
		}		
		
		//r�szlista k�pz�s: sublist()
		List<Integer> szamokReszLista = new ArrayList<Integer>();
		
		szamokReszLista = szamokLista.subList(2, 4);
		System.out.println("R�szlista");
		System.out.println(szamokReszLista);
		
		//Arraylist list deklar�ci� m�sk�pp - mi�rt ne ezt haszn�ljuk
		//a szamok list�b�l m�r nem lehet LinkedList-et csin�lni, 
		//nem lesz rugalmas a k�d
		ArrayList<Integer> szamok = new ArrayList<Integer>();
		szamok.add(55);
		System.out.println(szamok);
		
		List<String> gyumolcsokLista = new ArrayList<String>();
		gyumolcsokLista.add("alma");
	
		//deklar�ci� �s defin�ci� m�sk�pp
	    List<String> zoldsegek = new ArrayList<String>(
	    		Arrays.asList(
	    				"R�pa",
	    				"Retek",
	    				"Karal�b�"));
		
		System.out.println(gyumolcsokLista);
		System.out.println(zoldsegek);
	}

}
