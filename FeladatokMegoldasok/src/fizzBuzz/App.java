package fizzBuzz;

import java.util.Scanner;

public class App {
	
	public static Scanner sc;
	
	public static void main(String[] args) {
		
		FizzBuzz fb = new FizzBuzz();
		sc = new Scanner(System.in);
		
		System.out.print("K�rem adjon meg egy eg�sz sz�mot: ");
		Integer number = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		System.out.println(fb.process(number));
		
	}

}
