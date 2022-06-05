package gyujtemenyek;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfacePelda {
	
	public static void main(String[] args) {
		//Halmazelm�leti fogalmak sz�ks�gesek 
		//Set interface: speci�lis collection: nem tartalmazhat azonos elemket
		//A duplik�ci� kisz�r�s�re equals �s hashcode met�dusokat haszn�l. 
		
		//H�rom implement�ci�ja van:
		// 		HashSet: az elemeket t�bl�kban t�rolja �s fontos az elemek bej�r�sa
		//		TreeSet: gyors a bej�r�s, az elemeket fa adatszerkezetben t�rolja, 
		//				neh�zkes a besz�r�s, rendezetten t�rolja az adatokat
		//		LinkedHashSet: l�ncolt lista �s a Hasht�bla tulajdons�gait �tv�zi
		
		int[] szamoktomb = {34,22,10,60,30,22};
		
		Set<Integer> setElemek = new HashSet<Integer>();
		for (int i = 0; i < szamoktomb.length; i++) {
			setElemek.add(szamoktomb[i]);
		}
		
		System.out.println(setElemek); //22-es csak 1X szerepel benne
		
		TreeSet<Integer> rendezettElemek = new TreeSet<Integer>(setElemek);
		System.out.println(rendezettElemek);
		
		System.out.println("Els� elem (legkisebb �rt�k): " + rendezettElemek.first());
		System.out.println("Utols� elem (legnagyobb �rt�k): " + rendezettElemek.last());
		
		/*    Halmazm�veletek - met�dusok  
		 * 		K�t halmaz s1 �s s2
		 *  			s1.containsAll(s2) - r�szhalmaza s2 az s1
		 *  			s1.addAll(s2) - az s1-be beleker�l a k�t halmaz uni�ja
		 *  			s1.retainAll(s2) - az s1-be beleker�l a k�t halmaz metszete
		 *  			s1.removeAll(s2) - az s1-be beleker�l a k�t halmaz k�l�nbs�ge
		 */		
	}

}
