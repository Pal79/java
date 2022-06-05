package gyujtemenyek;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableLegacy {
	
	public static void main(String[] args) {
		//kulcs �rt�kp�rokban t�rt�nik az adatt�rol�s
		Hashtable<String, String> szotar = new Hashtable<>();
		szotar.put("apple", "alma");
		szotar.put("pear", "k�rte");
		szotar.put("banana", "ban�n");
		
		//szotar.clear(); //kit�rli a teljes tartalm�t
		
		szotar.remove("apple");
		
		System.out.println("Van-e apple kulcsunk: " + szotar.containsKey("apple"));
		System.out.println("Van-e pear kulcsunk: " + szotar.containsKey("pear"));
		
		//kulcsnak egyedinek kell lennie �s csak 1X szerepelhet
		szotar.put("pear", "korte");
		System.out.println(szotar);
		szotar.put("pear2", "korte");
		System.out.println(szotar);
		
		//Hashtable bej�r�sa
		// For ciklus �s foreach nem haszn�lhat� bej�r�sra, 
		//mert a Hashtable nem implement�lja az iterable interface-t
		
		//Enumeration interface-t implement�lja a Hashtable
		Enumeration<String> enumeration = szotar.keys();
		
		while (enumeration.hasMoreElements()) {
			String kulcs = enumeration.nextElement();
			System.out.println("Angol: " + kulcs + "\t Magyarul: " + szotar.get(kulcs));
		}

	}

}
