package balkezesek;

public class Balkezesek {
	
	private String nev;
	private String elso;
	private String utolso;
	private Integer suly;
	private Integer magassag;
	
	public Balkezesek(String nev, String elso, String utolso, Integer suly, Integer magassag) {
		super();
		this.nev = nev;
		this.elso = elso;
		this.utolso = utolso;
		this.suly = suly;
		this.magassag = magassag;
	}

	public String getNev() {
		return nev;
	}

	public String getElso() {
		return elso;
	}

	public String getUtolso() {
		return utolso;
	}

	public Integer getSuly() {
		return suly;
	}

	public Integer getMagassag() {
		return magassag;
	}

}
