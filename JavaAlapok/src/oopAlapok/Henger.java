package oopAlapok;

public class Henger {
	
	/********* I. r�sz: adattagok, mez�k (fields) ***********/
	private int magassag;
	private int sugar;

	/******** II. r�sz konstruktor(ok) deklar�ci� ***************/
	/* Konstruktor: az oszt�llyal azonos nev�, publikus met�dus 
	 * Inicializ�lja (be�ll�tja) az objektump�ld�ny alap�rt�keit
	 * Akkor ker�l megh�v�sra, amikor l�trej�n az objektump�ld�ny (new)
	 * Fontos szab�ly: komoly �zleti logik�t nem szabad beletenni (ciklus, el�g)
	 * Mert probl�ma lehet, ha nem j�n l�tre az objektump�ld�ny 
	 * Param�terrel vagy param�ter n�lk�l is deklar�lhatjuk. 
	 */
	public Henger(int magassag, int sugar) {
		//this - az objektump�ld�nyra utal
		this.magassag = magassag;
		this.sugar = sugar;
	}
	
	/******** III. r�sz: getters/setters: tulajdons�gok (property) *****/
	//get - lek�rdez�sek
	//set - be�ll�t�sok
	
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
	
	
	/******** IV. r�sz: saj�t met�dusok ********************/
	public double getFelszin() {
		return 2*(Math.pow(this.sugar, 2)*Math.PI)+this.magassag*2*this.sugar*Math.PI;
	}
	
	public double getTerfogat() {
		return Math.pow(this.sugar, 2)*Math.PI*this.magassag;
	}
	
	public void terfogatKiir() {
		System.out.println("A henger t�rfogata: " + getTerfogat());
	}

}
