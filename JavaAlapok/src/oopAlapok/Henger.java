package oopAlapok;

public class Henger {
	
	/********* I. rész: adattagok, mezõk (fields) ***********/
	private int magassag;
	private int sugar;

	/******** II. rész konstruktor(ok) deklaráció ***************/
	/* Konstruktor: az osztállyal azonos nevû, publikus metódus 
	 * Inicializálja (beállítja) az objektumpéldány alapértékeit
	 * Akkor kerül meghívásra, amikor létrejön az objektumpéldány (new)
	 * Fontos szabály: komoly üzleti logikát nem szabad beletenni (ciklus, elég)
	 * Mert probléma lehet, ha nem jön létre az objektumpéldány 
	 * Paraméterrel vagy paraméter nélkül is deklarálhatjuk. 
	 */
	public Henger(int magassag, int sugar) {
		//this - az objektumpéldányra utal
		this.magassag = magassag;
		this.sugar = sugar;
	}
	
	/******** III. rész: getters/setters: tulajdonságok (property) *****/
	//get - lekérdezések
	//set - beállítások
	
	public int getMagassag() {
		return magassag;
	}

	public void setMagassag(int magassag) {
		this.magassag = magassag;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	
	
	/******** IV. rész: saját metódusok ********************/
	public double getFelszin() {
		return 2*(Math.pow(this.sugar, 2)*Math.PI)+this.magassag*2*this.sugar*Math.PI;
	}
	
	public double getTerfogat() {
		return Math.pow(this.sugar, 2)*Math.PI*this.magassag;
	}
	
	public void terfogatKiir() {
		System.out.println("A henger térfogata: " + getTerfogat());
	}

}
