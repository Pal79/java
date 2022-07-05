package solSys;

import java.util.List;

public class TaskManager {
	
	public void writingOutData(List<SolarSystemSizes> solSysList) {
		
		String sunDiameter = "1392700";
		System.out.println("N = nap átmérő -> 1 392 700km");
		System.out.println();
		
		for(SolarSystemSizes ssList : solSysList) {
			
			String diameterReplaceN = ssList.getDiameter().replace("N", sunDiameter);
			String diameterCommaReplaceDot = diameterReplaceN.replace(",", ".");
			String[] diameterSplit = diameterCommaReplaceDot.split("/");
			
			String distanceReplaceN = ssList.getDistance().replace("N", sunDiameter);
			String distanceCommaReplaceDot = distanceReplaceN.replace(",", ".");
			
			System.out.println("Bolygó neve: " + ssList.getName());
			System.out.print(ssList.getName() + " átmérője: " + ssList.getDiameter() + " = ");
			System.out.println(Double.parseDouble(diameterSplit[0]) / Double.parseDouble(diameterSplit[1]) + "km");
			
			if(ssList.getName().equals("Plutó")) {
				String plutoReplaceN = ssList.getDistance().replace("N", sunDiameter);
			}
			System.out.print("A(z) " + ssList.getName() + " naphoz viszonyított távolsága: " + ssList.getDistance() + " = ");
			
			System.out.println();
			
		}
		
	}

}
