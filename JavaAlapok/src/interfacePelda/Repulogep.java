package interfacePelda;

public class Repulogep extends Gep implements Repul, Karbantartas {
	
	public Repulogep(String azonosito, double uzemAnyagMennyiseg) {
		super(azonosito, uzemAnyagMennyiseg);
	}

	@Override
	public void repul() {
		System.out.println("Fogy az �zemanyag...");
		this.setUzemAnyagMennyiseg(this.getUzemAnyagMennyiseg()-20);
	}

	@Override
	public void felszall() {
		System.out.println("Felsz�ll�p�lya kell!!!");
		if (this.getUzemAnyagMennyiseg()<20) {
			System.out.println("Nem lehet felsz�llni, mert nincs el�g �zemanyag!!!");
		}
	}

	@Override
	public void leszall() {
		System.out.println("Lesz�ll�p�lya kell!!!");
		
	}

	@Override
	public void karbanTartasDatumaBeallit() {
		System.out.println("Be�ll�tja a karbantart�s d�tum�t...");
		
	}

	@Override
	public void repultOrakSzamaBeallit() {
		System.out.println("Be�ll�tja a rep�lt �r�k sz�m�t...");
	}

}
