package solSys;

import java.util.List;

public class TaskManager {
	
	public void writingOutData(List<SolarSystemSizes> solSysList) {
		
		String sunDiameter = "1392700";
		System.out.println("N = nap átmérő -> 1 392 700km");
		System.out.println();
		
		for(SolarSystemSizes ssList : solSysList) {
			
			String diameterReplaceN = ssList.getDiameter().replace("N", sunDiameter);
			String diameterCommaReplaceToDot = diameterReplaceN.replace(",", ".");
			String[] diameterSplit = diameterCommaReplaceToDot.split("/");
			
			System.out.println("Bolygó neve: " + ssList.getName());
			System.out.print(ssList.getName() + " átmérője: " + ssList.getDiameter() + " = ");
			System.out.println(Double.parseDouble(diameterSplit[0]) / Double.parseDouble(diameterSplit[1]) + "km");
			
			if(ssList.getName().equals("Plutó")) {
				String plutoReplaceN = ssList.getDistance().replace("N", sunDiameter);
				String[] plutoSplit = plutoReplaceN.split("-");
				String[] firstMultiplicationSplit = plutoSplit[0].split("x");
				String[] secondMultiplicationSplit = plutoSplit[1].split("x");
				
				System.out.print("A(z) " + ssList.getName() + " naphoz viszonyított távolsága: " + ssList.getDistance() + " = ");
				System.out.println(
					Double.parseDouble(firstMultiplicationSplit[0]) * Double.parseDouble(firstMultiplicationSplit[1])
					-
					Double.parseDouble(secondMultiplicationSplit[0]) * Double.parseDouble(secondMultiplicationSplit[1]) + "km");
			} else {
				String distanceReplaceN = ssList.getDistance().replace("N", sunDiameter);
				String distanceCommaReplaceToDot = distanceReplaceN.replace(",", ".");
				String[] distanceSplit = distanceCommaReplaceToDot.split("x");
				
				System.out.print("A(z) " + ssList.getName() + " naphoz viszonyított távolsága: " + ssList.getDistance() + " = ");
				System.out.println(Double.parseDouble(distanceSplit[0]) * Double.parseDouble(distanceSplit[1]) + "km");
			}
			
			System.out.println();
			
		}
		
	}

}
