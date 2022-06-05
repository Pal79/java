package metodusok;

public class Szamolas {
	
	public static void main(String[] args) {
		//metódus hívás
		//5 és 3 aktuális paraméter
		System.out.println("Kerület: " + teglalapKeruletSzamol(5, 3));
		System.out.println(negyzetOsszegSzamol(4.5, 6.8));
		System.out.println(negyzetOsszegSzamol(4, 6)); //4.0 �s 6.0
		hatvanySzamolEsKiir(2, 8); //256.0
		System.out.println(gyokSzamol(25)); //5.0
	}
	
	//void - nincs visszatérése - nem kell a return általános kiírásnál alkalmazzuk
	//a és b formális paraméter, visszatérés típusa int KÖTELEZŐ a return
	public static int teglalapKeruletSzamol(int a, int b) {
		//int ker = (a+b)*2;
		return (a+b)*2;
	}

	public static double negyzetOsszegSzamol(double a, double b) {
		double eredmeny = Math.pow(a, 2) + Math.pow(b, 2);
		return eredmeny;
	}
	
	public static void hatvanySzamolEsKiir(double alap, double kitevo) {
		System.out.println(Math.pow(alap, kitevo));
	}
	
	public static double gyokSzamol(double szam) {
		return Math.sqrt(szam);
	}

}
