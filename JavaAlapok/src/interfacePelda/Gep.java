package interfacePelda;

public class Gep {
	
	private String azonosito;
	private double uzemAnyagMennyiseg;
	
	public Gep(String azonosito, double uzemAnyagMennyiseg) {
		this.azonosito = azonosito;
		this.uzemAnyagMennyiseg = uzemAnyagMennyiseg;
	}

	public String getAzonosito() {
		return azonosito;
	}

	public void setAzonosito(String azonosito) {
		this.azonosito = azonosito;
	}

	public double getUzemAnyagMennyiseg() {
		return uzemAnyagMennyiseg;
	}

	public void setUzemAnyagMennyiseg(double uzemAnyagMennyiseg) {
		this.uzemAnyagMennyiseg = uzemAnyagMennyiseg;
	}
	
	public void tankol(double mennyiseg) {
		this.uzemAnyagMennyiseg+=mennyiseg;
	}

}
