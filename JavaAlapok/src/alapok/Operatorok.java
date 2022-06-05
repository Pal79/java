package alapok;

public class Operatorok {
	
	public static void main(String[] args) {
		//Operátorok: mûveletvégzõ jelek
		//operandus: amiken a mûveleteket végezzük
		//int osszeg = a + b; //a és b operandus, + =

		//értékadó operátor, egy darab =
		int szam1 = 5;
		int szam2 = 10;
		
		//Matematikai operátorok
		// + -  * / (egész osztás) % (MOD) modulo - maradékképzés
		System.out.println("Összege: " + (szam1+szam2));
		int kulonbseg = szam2-szam1;
		System.out.println("Különbség: " + kulonbseg);
		
		//maradékképzés - MOD: modulo
		System.out.println(5%7); //5
		System.out.println(4%2); //0
		System.out.println(6%2); //0
		System.out.println(2%1); //0
		System.out.println(12%5); //2
		
		//Értéknövelõ (inkrementálás) és értékcsökkentõ(dekrementálás)
		// ++ és --
		//prefix és postfix
		
		int szam3 = 7;
		System.out.println(++szam3); //8
		System.out.println(szam3++); //8
		System.out.println(szam3); //9
		
		//balérték - jobbérték (right value, left value)
		int a = 10;
		int b = 12;
		a = b;
		System.out.println(a); //12
		//mindig a baloldalon álló kifejezés veszi a jobboldalon állót
		
		//Relációs operátorok (összehasonlító operátorok) - elágazásoknál 
		// < > <= >= !=(nem egyenlõ)  == (egyenlõség)
		
		//Logikai operátorok - Bool algebra mûveletei
		//ÉS (AND) && - altgr+c
		//VAGY (OR) || - altgr +w
		//Negálás (Tagadás) !
		//Kizáró vagy XOR
		
		boolean A = true;
		boolean B = false;
		
		System.out.println("A és B értéke: "+ (A && B)); //false
		System.out.println("A vagy B értéke: "+ (A || B)); //true
		System.out.println("A értékének tagadása: "+!A); //false
		
		System.out.println(A && B || A); //true
		System.out.println(A || (B&&A)); //true
		
		System.out.println(5==7); //false
		System.out.println(5<=5); //true
		
		//Operátorok sorrendisége (precedenciája)
		//Általában a matematika szabályai érvényesek
		//érdemes zárójelezni
		//Értékadásnál jobbról balra történik a végrehajtás
		//alapértelmezetten pedig balról jobbra
		
		// i++, i-- postix értéknövelés, értékcsökkentés
		// ++i, --i prefix értéknövelés, értékcsökkentés
		// * /
		// + -
		// biteltolás
		// Összehasonlító operátorok <> <= stb.
		// egyenlõség vizsgálat == !=
		// Bitmûveletek AND OR XOR
		// Logikai mûveletek és && AND
		// Logikai mûveletek vagy || OR
		// ternary operator (short if) kifejezés(logikai) ? igaz: hamis
		// értékadás
		
	}

}
