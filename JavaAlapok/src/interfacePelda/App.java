package interfacePelda;

public class App {
	
public static void main(String[] args) {
		
		Madar madarObj = new Madar("G�lya");
		System.out.println("A "+madarObj.getNev() + " �hes: "+madarObj.isEhes()); //true
		if (madarObj.isEhes()) {
			madarObj.eszik();
		}
		System.out.println("A "+madarObj.getNev() + " ev�s ut�n, �hes: "+madarObj.isEhes()); //false
		madarObj.felszall();
		madarObj.repul();
		madarObj.leszall();
		System.out.println("A "+madarObj.getNev() + " rep�l�s ut�n, �hes: "+madarObj.isEhes());
		System.out.println();
		
		Repulogep repcsiObj = new Repulogep("TRGJ-79382", 10);
		System.out.println("Rep�l�g�p azonos�t�ja: "+repcsiObj.getAzonosito());
		System.out.println("�zemanyagmennyis�g: "+repcsiObj.getUzemAnyagMennyiseg());
		repcsiObj.tankol(50);
		repcsiObj.tankol(30);
		repcsiObj.felszall();
		repcsiObj.repul();
		repcsiObj.leszall();
		System.out.println("�zemanyagmennyis�g tankol�s �s rep�l�s ut�n: "
				+ ""+repcsiObj.getUzemAnyagMennyiseg()); //10+50+30-20 = 70
		
		repcsiObj.karbanTartasDatumaBeallit();
		repcsiObj.repultOrakSzamaBeallit();
		
		Repulogep repcsiObj2 = new Repulogep("TRGO-942432", 8);
		repcsiObj2.felszall();
	}

}
