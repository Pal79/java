package alapok;

public class MatematikaiSzamitasok {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//Math oszt�ly elemei
		
		//hatv�nyoz�s
		System.out.println(Math.pow(2, 3)); //8.0
		
		//gy�kvon�s
		System.out.println(Math.sqrt(25)); //5.0
		
		//Pi �rt�ke nem 3.14
		System.out.println(Math.PI);
		
		//abszol�t�rt�k
		int abszulutErtek = Math.abs(-44);
		System.out.println(abszulutErtek); //44
		
		//hiba
		//int eredmeny = Math.pow(2, 3);
		double eredmeny = Math.pow(2, 3);
		
		//Kerek�t�sek
		//Round - matematika szab�lyai szerint kerek�t
		System.out.println(Math.round(24.5)); //25
		
		//lefel� kerek�t�s
		System.out.println(Math.floor(24.9)); //24.0
		
		//felfel� kerek�t�s
		System.out.println(Math.ceil(24.1)); //25.0
	}

}
