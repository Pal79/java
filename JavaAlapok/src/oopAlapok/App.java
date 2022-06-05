package oopAlapok;

public class App {
	
	public static void main(String[] args) {
		//Program bel�p�si pontja - main
		
		//hengerObj n�ven l�trej�n az objektump�ld�ny
		//magass�g 10-es �rt�k, sug�r 1-es �rt�kkel
		//konstruktor h�v�s
		Henger hengerObj = new Henger(10, 1);
		//hengerObj.setMagassag(20);
		hengerObj.terfogatKiir();
		System.out.println("Henger felsz�n: " + hengerObj.getFelszin());
		System.out.println("Henger t�rfogat: " + hengerObj.getTerfogat());
		System.out.println("Henger magass�ga: " + hengerObj.getMagassag());
		
		TomorHenger tomorHengerObj = new TomorHenger(10, 2, 0.5);
		System.out.println("T�m�rhenger felsz�n: " + tomorHengerObj.getFelszin());
		System.out.println("T�m�rhenger t�rfogata: " + tomorHengerObj.getTerfogat());
		System.out.println("T�m�rhenger t�meg: " + tomorHengerObj.getTomeg());
		tomorHengerObj.terfogatKiir();
		
		Cso csoObj = new Cso(10, 2, 0.5, 1);
		System.out.println("Cs� t�rfogata: " + csoObj.getTerfogat());
		System.out.println("Cs� felsz�n: " + csoObj.getFelszin());
		
	}

}
