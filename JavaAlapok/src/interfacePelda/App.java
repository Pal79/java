package interfacePelda;

public class App {
	
public static void main(String[] args) {
		
		Madar madarObj = new Madar("Gólya");
		System.out.println("A "+madarObj.getNev() + " éhes: "+madarObj.isEhes()); //true
		if (madarObj.isEhes()) {
			madarObj.eszik();
		}
		System.out.println("A "+madarObj.getNev() + " evés után, éhes: "+madarObj.isEhes()); //false
		madarObj.felszall();
		madarObj.repul();
		madarObj.leszall();
		System.out.println("A "+madarObj.getNev() + " repülés után, éhes: "+madarObj.isEhes());
		System.out.println();
		
		Repulogep repcsiObj = new Repulogep("TRGJ-79382", 10);
		System.out.println("Repülõgép azonosítója: "+repcsiObj.getAzonosito());
		System.out.println("Üzemanyagmennyiség: "+repcsiObj.getUzemAnyagMennyiseg());
		repcsiObj.tankol(50);
		repcsiObj.tankol(30);
		repcsiObj.felszall();
		repcsiObj.repul();
		repcsiObj.leszall();
		System.out.println("Üzemanyagmennyiség tankolás és repülés után: "
				+ ""+repcsiObj.getUzemAnyagMennyiseg()); //10+50+30-20 = 70
		
		repcsiObj.karbanTartasDatumaBeallit();
		repcsiObj.repultOrakSzamaBeallit();
		
		Repulogep repcsiObj2 = new Repulogep("TRGO-942432", 8);
		repcsiObj2.felszall();
	}

}
