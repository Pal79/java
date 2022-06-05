package nobelDijak;

public class Nobel {
	
	private Integer ev;
	private String tipus;
	private String keresztnev;
	private String vezeteknev;
	
	public Nobel(Integer ev, String tipus, String keresztnev, String vezeteknev) {
		super();
		this.ev = ev;
		this.tipus = tipus;
		this.keresztnev = keresztnev;
		this.vezeteknev = vezeteknev;
	}
	
	public Integer getEv() {
		return ev;
	}
	public String getTipus() {
		return tipus;
	}
	public String getKeresztnev() {
		return keresztnev;
	}
	public String getVezeteknev() {
		return vezeteknev;
	}
	
	@Override
	public String toString() {
		return "Nobel{" + "ev;" + "tipus" + "keresztnev" + "vezeteknev" + "}";
	}

}
