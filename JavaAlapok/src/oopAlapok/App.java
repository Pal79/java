package oopAlapok;

public class App {
	
	public static void main(String[] args) {
		//Program belépési pontja - main
		
		//hengerObj néven létrejön az objektumpéldány
		//magasság 10-es érték, sugár 1-es értékkel
		//konstruktor hívás
		Henger hengerObj = new Henger(10, 1);
		//hengerObj.setMagassag(20);
		hengerObj.terfogatKiir();
		System.out.println("Henger felszín: " + hengerObj.getFelszin());
		System.out.println("Henger térfogat: " + hengerObj.getTerfogat());
		System.out.println("Henger magassága: " + hengerObj.getMagassag());
		
		TomorHenger tomorHengerObj = new TomorHenger(10, 2, 0.5);
		System.out.println("Tömörhenger felszín: " + tomorHengerObj.getFelszin());
		System.out.println("Tömörhenger térfogata: " + tomorHengerObj.getTerfogat());
		System.out.println("Tömörhenger tömeg: " + tomorHengerObj.getTomeg());
		tomorHengerObj.terfogatKiir();
		
		Cso csoObj = new Cso(10, 2, 0.5, 1);
		System.out.println("Csõ térfogata: " + csoObj.getTerfogat());
		System.out.println("Csõ felszín: " + csoObj.getFelszin());
		
	}

}
