package solSys;

public class SolarSystemSizes {
	
	private String name;
	private String diameter;
	private String distance;
	
	public SolarSystemSizes() {
		
	}
	
	public SolarSystemSizes(String name, String diameter, String distance) {
		super();
		this.name = name;
		this.diameter = diameter;
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

}
