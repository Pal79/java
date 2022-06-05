package alapok;

public class Operatorok {
	
	public static void main(String[] args) {
		//Oper�torok: m�veletv�gz� jelek
		//operandus: amiken a m�veleteket v�gezz�k
		//int osszeg = a + b; //a �s b operandus, + =

		//�rt�kad� oper�tor, egy darab =
		int szam1 = 5;
		int szam2 = 10;
		
		//Matematikai oper�torok
		// + -  * / (eg�sz oszt�s) % (MOD) modulo - marad�kk�pz�s
		System.out.println("�sszege: " + (szam1+szam2));
		int kulonbseg = szam2-szam1;
		System.out.println("K�l�nbs�g: " + kulonbseg);
		
		//marad�kk�pz�s - MOD: modulo
		System.out.println(5%7); //5
		System.out.println(4%2); //0
		System.out.println(6%2); //0
		System.out.println(2%1); //0
		System.out.println(12%5); //2
		
		//�rt�kn�vel� (inkrement�l�s) �s �rt�kcs�kkent�(dekrement�l�s)
		// ++ �s --
		//prefix �s postfix
		
		int szam3 = 7;
		System.out.println(++szam3); //8
		System.out.println(szam3++); //8
		System.out.println(szam3); //9
		
		//bal�rt�k - jobb�rt�k (right value, left value)
		int a = 10;
		int b = 12;
		a = b;
		System.out.println(a); //12
		//mindig a baloldalon �ll� kifejez�s veszi a jobboldalon �ll�t
		
		//Rel�ci�s oper�torok (�sszehasonl�t� oper�torok) - el�gaz�sokn�l 
		// < > <= >= !=(nem egyenl�)  == (egyenl�s�g)
		
		//Logikai oper�torok - Bool algebra m�veletei
		//�S (AND) && - altgr+c
		//VAGY (OR) || - altgr +w
		//Neg�l�s (Tagad�s) !
		//Kiz�r� vagy XOR
		
		boolean A = true;
		boolean B = false;
		
		System.out.println("A �s B �rt�ke: "+ (A && B)); //false
		System.out.println("A vagy B �rt�ke: "+ (A || B)); //true
		System.out.println("A �rt�k�nek tagad�sa: "+!A); //false
		
		System.out.println(A && B || A); //true
		System.out.println(A || (B&&A)); //true
		
		System.out.println(5==7); //false
		System.out.println(5<=5); //true
		
		//Oper�torok sorrendis�ge (precedenci�ja)
		//�ltal�ban a matematika szab�lyai �rv�nyesek
		//�rdemes z�r�jelezni
		//�rt�kad�sn�l jobbr�l balra t�rt�nik a v�grehajt�s
		//alap�rtelmezetten pedig balr�l jobbra
		
		// i++, i-- postix �rt�kn�vel�s, �rt�kcs�kkent�s
		// ++i, --i prefix �rt�kn�vel�s, �rt�kcs�kkent�s
		// * /
		// + -
		// biteltol�s
		// �sszehasonl�t� oper�torok <> <= stb.
		// egyenl�s�g vizsg�lat == !=
		// Bitm�veletek AND OR XOR
		// Logikai m�veletek �s && AND
		// Logikai m�veletek vagy || OR
		// ternary operator (short if) kifejez�s(logikai) ? igaz: hamis
		// �rt�kad�s
		
	}

}
