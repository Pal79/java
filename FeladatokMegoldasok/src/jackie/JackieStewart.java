package jackie;

public class JackieStewart {
	
	private Integer year;
	private Integer races;
	private Integer wins;
	private Integer podiums;
	private Integer poles;
	private Integer fastests;
	
	public JackieStewart(Integer year, Integer races, Integer wins, Integer podiums, Integer poles, Integer fastests) {
		super();
		this.year = year;
		this.races = races;
		this.wins = wins;
		this.podiums = podiums;
		this.poles = poles;
		this.fastests = fastests;
	}

	public Integer getYear() {
		return year;
	}

	public Integer getRaces() {
		return races;
	}

	public Integer getWins() {
		return wins;
	}

	public Integer getPodiums() {
		return podiums;
	}

	public Integer getPoles() {
		return poles;
	}

	public Integer getFastests() {
		return fastests;
	}

}
