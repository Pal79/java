package solSys;

import java.util.List;

public class TaskManager {
	
	public void writingOutData(List<SolarSystemSizes> solSysList) {
		
		String sunDiameter = "1392700";
		System.out.println("N = nap átmérője -> " + sunDiameter + "km");
		System.out.println();
		
		for(SolarSystemSizes ssList : solSysList) {
			
			String diameterReplaceN = ssList.getDiameter().replace("N", sunDiameter);
			String diameterCommaReplaceDot = diameterReplaceN.replace(",", ".");
			String[] diameterSplit = diameterCommaReplaceDot.split("/");
			
			System.out.println("Bolygó neve: " + ssList.getName());
			System.out.print(ssList.getName() + " átmérője: " + ssList.getDiameter() + " = ");
			System.out.println(Double.parseDouble(diameterSplit[0]) / Double.parseDouble(diameterSplit[1]) + "km");
			System.out.println("A(z)" + ssList.getName() + " naphoz viszonyított távolsága: " + ssList.getDistance());
			System.out.println();
			
		}
		
	}

}
