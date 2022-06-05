package progTetelek;

public class Kivalasztas {
	
	public static void main(String[] args) {
		// Kiválasztás: egy sorozatban keresünk egy elemet, 
		// de biztosan tudjuk, hogy valahol benne van.
		
		//Pszeudó kód - mondatszerű kód
		//Eljárás: Kiválsztás
		//i:=1
		//Ciklus am�g A[i] nem T tulajdonságú 
		//i:=i+1
		//Ciklus vége
		//Sorszám:i
		
		int[] tomb = {3,6,9,23,55,89,11,1,66,89};
		//kiírjuk a tömb elemeit
		System.out.println("A tömb elemei: ");
		tombKiir(tomb);
		System.out.println();
		System.out.println("Index: "+kivalaszt(tomb, 11));
	}
	
	public static int kivalaszt(int[] tomb, int keresett) {
		int i = 0;
		while (tomb[i] !=keresett) {
			i++;
		}
		return i;
	}
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}

}
