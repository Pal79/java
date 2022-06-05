package balkezesek;

import java.util.List;

public class App {
	
	public static void main(String[] args) {
		FajlKezelo fkObj = new FajlKezelo();
		List<Balkezesek> balkezesekLista = fkObj.fajlOlvas("balkezesek.csv");
		Feladatok feladatokObj = new Feladatok();
		
		System.out.print("3.feladat: ");
		System.out.println(feladatokObj.hanyAdatsor(balkezesekLista));
		
		System.out.println("4.feladat: ");
		feladatokObj.testmagCentimeter(balkezesekLista);
		
		System.out.println("5.feladat: ");
		feladatokObj.evszamEllenoriz();
		
		System.out.print("6.feladat: ");
		feladatokObj.atlagsuly(balkezesekLista);
	}

}
