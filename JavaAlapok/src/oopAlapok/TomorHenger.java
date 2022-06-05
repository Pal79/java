package oopAlapok;

public class TomorHenger extends Henger {
	
	//sz�rmaztat�s: extends kulcssz�val t�rt�nik
	// A TomorHenger (gyermek oszt�ly) meg�r�kli az �soszt�lyt�l (Henger)
	//annak tulajdons�gait �s viselked�sform�it
		
	private double suruseg;
	
	public TomorHenger(int magassag, int sugar, double suruseg) {
		super(magassag, sugar);
		this.suruseg = suruseg;
	}

	public double getSuruseg() {
		return suruseg;
	}

	public void setSuruseg(double suruseg) {
		this.suruseg = suruseg;
	}
		
	//kieg�sz�tjuk az �soszt�ly viselked�s�t
	public double getTomeg() {
		return this.suruseg*this.getTerfogat();
	}
		
	//fel�l�r�s: az �soszt�lyban l�v� ugyanilyen nev� met�dust �rjuk fel�l
	public void terfogatKiir() {
		System.out.println("A t�m�rhenger t�rfogata: " + this.getTerfogat());
	}

}
