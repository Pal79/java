package rendezesek;

public class MinKivalasztasosRendezes {
	
	public static void main(String[] args) {
		// Minimum kiválasztásos rendezés
		// Meghatározzuk a legkisebb értékû elemet és kicseréljük az elsõ elemmel
		// a maradék tömbön ugyanezt az elvet követjük, amíg a tömb végéig nem érünk
		
		int[] tomb = {44,78,3,91,1,87};

		System.out.print("Eredeti tömb elemei: ");
		tombKiir(tomb);
		System.out.println();
		
		int csere;
		int minIndex;
		for (int i = 0; i < tomb.length; i++) {
			minIndex = i;
			for (int j = i+1; j < tomb.length; j++) {
				if (tomb[j]<tomb[minIndex]) {
					minIndex = j;
				}
			}
			
			//csere
			if (i!=minIndex) {
				csere = tomb[i];
				tomb[i] = tomb[minIndex];
				tomb[minIndex] = csere;
			}
			System.out.println((i+1) + ".futás: ");
			tombKiir(tomb);
			System.out.println();
		}
		

	}
	
	private static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}

}
