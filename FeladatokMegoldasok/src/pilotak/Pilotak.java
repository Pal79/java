package pilotak;

public class Pilotak {
	
	private String nev;
	private String szuletesi_datum;
	private String nemzetiseg;
	private Integer rajtszam;
	
	public Pilotak(String nev, String szuletesi_datum, String nemzetiseg, Integer rajtszam) {
		super();
		this.nev = nev;
		this.szuletesi_datum = szuletesi_datum;
		this.nemzetiseg = nemzetiseg;
		this.rajtszam = rajtszam;
	}
	
	public String getNev() {
		return nev;
	}

	public String getSzuletesi_datum() {
		return szuletesi_datum;
	}

	public String getNemzetiseg() {
		return nemzetiseg;
	}

	public Integer getRajtszam() {
		return rajtszam;
	}
	
}
