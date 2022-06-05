package interfacePelda;

public class Repulogep extends Gep implements Repul, Karbantartas {
	
	public Repulogep(String azonosito, double uzemAnyagMennyiseg) {
		super(azonosito, uzemAnyagMennyiseg);
	}

	@Override
	public void repul() {
		System.out.println("Fogy az üzemanyag...");
		this.setUzemAnyagMennyiseg(this.getUzemAnyagMennyiseg()-20);
	}

	@Override
	public void felszall() {
		System.out.println("Felszállópálya kell!!!");
		if (this.getUzemAnyagMennyiseg()<20) {
			System.out.println("Nem lehet felszállni, mert nincs elég üzemanyag!!!");
		}
	}

	@Override
	public void leszall() {
		System.out.println("Leszállópálya kell!!!");
		
	}

	@Override
	public void karbanTartasDatumaBeallit() {
		System.out.println("Beállítja a karbantartás dátumát...");
		
	}

	@Override
	public void repultOrakSzamaBeallit() {
		System.out.println("Beállítja a repült órák számát...");
	}

}
