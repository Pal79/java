package rendezesek;

public class EgyszeruCseresRendezes {
	
	public static void main(String[] args) {
		int[] tomb = {44,78,3,91,1,87};

		System.out.print("Eredeti tömb elemei: ");
		tombKiir(tomb);
		System.out.println();

		for (int i = 0; i < tomb.length-1; i++) {
			for (int j = i+1; j < tomb.length; j++) {
				if (tomb[i]>tomb[j]) {
					//csere alg.
					int temp = tomb[j];
					tomb[j] = tomb[i];
					tomb[i] = temp;
				}
			}
		}
		System.out.print("Rendezett tömb elemei: ");
		tombKiir(tomb);

	}
	
	private static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}

}
