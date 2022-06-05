package oopAlapok;

public class TomorHenger extends Henger {
	
	//származtatás: extends kulcsszóval történik
	// A TomorHenger (gyermek osztály) megörökli az õsosztálytól (Henger)
	//annak tulajdonságait és viselkedésformáit
		
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
		
	//kiegészítjuk az õsosztály viselkedését
	public double getTomeg() {
		return this.suruseg*this.getTerfogat();
	}
		
	//felülírás: az õsosztályban lévõ ugyanilyen nevû metódust írjuk felül
	public void terfogatKiir() {
		System.out.println("A tömörhenger térfogata: " + this.getTerfogat());
	}

}
