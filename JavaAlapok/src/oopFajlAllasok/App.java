package oopFajlAllasok;

import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		//1. objektump�ld�ny l�trehoz�sa a FajlKezelo oszt�lyb�l
		FajlKezelo fkObj = new FajlKezelo();
		List<AllasTarolo> allasokLista = fkObj.fajlBeolvas("allasok.csv");

		//ellen�rz�s1: els� elemnek az id ki�r�s
		//System.out.println(allasokLista.get(0).getId());
		
		//ellen�rz�s2: h�ny elem� a lista
		//System.out.println(allasokLista.size());
		
		Feladatok feladatObj = new Feladatok();
		
		///b. feladat
		System.out.println("b. feladat - adatok: ");
		feladatObj.adatokKiir(allasokLista);
		System.out.println();
		
		//c. feladat
		System.out.println("c. feladat - �ll�sok sz�ma: ");
		feladatObj.allasokSzamaKiir(allasokLista);
		System.out.println();
		
		//d. feladat
		System.out.println("d. feladat - legmagasabb b�r");
		feladatObj.maxFizetesKiir(allasokLista);
		System.out.println();
		
		//e. feladat
		System.out.print("e. feladat - rendszergazda hirdet�sek sz�ma: ");
		System.out.println(feladatObj.rendszergazdaDbSzamol(allasokLista));
		System.out.println();
		
		//f. feladat
		System.out.println("f. feladat -t�vmunka �ll�sok: ");
		feladatObj.tavmunkaAllasokKiir(allasokLista);
		System.out.println();
		
		//g. feladat
		System.out.println("g. feladat - t�vmunka �tlag b�r:");
		System.out.println(feladatObj.tavmunkaAtlagSzamol(allasokLista));
		System.out.println();
		
		//h. feladat
		System.out.println("h. feladat - �ll�sok tapasztalat n�lk�l:");
		feladatObj.allasokTapasztalatNelkulKiir(allasokLista);
		System.out.println();
		
		//i. feladat
		System.out.println("i. feladat - �ll�sok 4 �vn�l t�bb tapasztalat:");
		feladatObj.allasokNegyEvnelTobbKiir(allasokLista);
		System.out.println();
		
		//j. feladat
		System.out.println("j. feladat - 3 h�tn�l r�gebbi �ll�sok:");
		feladatObj.haromHetnelRegebbiAllasokKiir(allasokLista);
		System.out.println();
		
		//k. feladat
		System.out.println("k. feladat - legfrissebb �ll�s: ");
		feladatObj.legfrissebbAllasIdKiir(allasokLista);
		System.out.println();
	
		//l. feladat
		System.out.println("l. feladat - max �tlag poz�ci� szerint: ");
		System.out.println(feladatObj.atlagMaxPozicioSzerintMeghataroz(allasokLista));
		System.out.println();
	}

}
