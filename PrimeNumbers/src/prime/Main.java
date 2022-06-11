package prime;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Prime prime = new Prime();
		
		System.out.print("Kérem adjon meg egy számot, hogy megtudja, prímszám e: ");
		Integer num = sc.nextInt();
		prime.isPrime(num);
		
		System.out.println("---------------------");
		
		System.out.print("Kérem írjon be egy számot, hogy megtudja, 1 és az adott szám között mely prímszámok vannak: ");
		num = sc.nextInt();
		prime.primesWriteOut(num);
		
		System.out.println("---------------------");
		
		System.out.print("Kérem írjon be egy számot, hogy megtudja, 1 és az adott szám között hány prímszám található: ");
		num = sc.nextInt();
		prime.primesCount(num);
		
		sc.close();
	}

}
