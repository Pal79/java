package rendezesek;

public class MinKivalasztasosRendezes {
	
	public static void main(String[] args) {
		// Minimum kiv�laszt�sos rendez�s
		// Meghat�rozzuk a legkisebb �rt�k� elemet �s kicser�lj�k az els� elemmel
		// a marad�k t�mb�n ugyanezt az elvet k�vetj�k, am�g a t�mb v�g�ig nem �r�nk
		
		int[] tomb = {44,78,3,91,1,87};

		System.out.print("Eredeti t�mb elemei: ");
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
			System.out.println((i+1) + ".fut�s: ");
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
