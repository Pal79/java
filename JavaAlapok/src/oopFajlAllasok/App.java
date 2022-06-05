package oopFajlAllasok;

import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		//1. objektumpéldány létrehozása a FajlKezelo osztályból
		FajlKezelo fkObj = new FajlKezelo();
		List<AllasTarolo> allasokLista = fkObj.fajlBeolvas("allasok.csv");

		//ellenõrzés1: elsõ elemnek az id kiírás
		//System.out.println(allasokLista.get(0).getId());
		
		//ellenõrzés2: hány elemû a lista
		//System.out.println(allasokLista.size());
		
		Feladatok feladatObj = new Feladatok();
		
		///b. feladat
		System.out.println("b. feladat - adatok: ");
		feladatObj.adatokKiir(allasokLista);
		System.out.println();
		
		//c. feladat
		System.out.println("c. feladat - állások száma: ");
		feladatObj.allasokSzamaKiir(allasokLista);
		System.out.println();
		
		//d. feladat
		System.out.println("d. feladat - legmagasabb bér");
		feladatObj.maxFizetesKiir(allasokLista);
		System.out.println();
		
		//e. feladat
		System.out.print("e. feladat - rendszergazda hirdetések száma: ");
		System.out.println(feladatObj.rendszergazdaDbSzamol(allasokLista));
		System.out.println();
		
		//f. feladat
		System.out.println("f. feladat -távmunka állások: ");
		feladatObj.tavmunkaAllasokKiir(allasokLista);
		System.out.println();
		
		//g. feladat
		System.out.println("g. feladat - távmunka átlag bér:");
		System.out.println(feladatObj.tavmunkaAtlagSzamol(allasokLista));
		System.out.println();
		
		//h. feladat
		System.out.println("h. feladat - állások tapasztalat nélkül:");
		feladatObj.allasokTapasztalatNelkulKiir(allasokLista);
		System.out.println();
		
		//i. feladat
		System.out.println("i. feladat - állások 4 évnél több tapasztalat:");
		feladatObj.allasokNegyEvnelTobbKiir(allasokLista);
		System.out.println();
		
		//j. feladat
		System.out.println("j. feladat - 3 hétnél régebbi állások:");
		feladatObj.haromHetnelRegebbiAllasokKiir(allasokLista);
		System.out.println();
		
		//k. feladat
		System.out.println("k. feladat - legfrissebb állás: ");
		feladatObj.legfrissebbAllasIdKiir(allasokLista);
		System.out.println();
	
		//l. feladat
		System.out.println("l. feladat - max átlag pozíció szerint: ");
		System.out.println(feladatObj.atlagMaxPozicioSzerintMeghataroz(allasokLista));
		System.out.println();
	}

}
