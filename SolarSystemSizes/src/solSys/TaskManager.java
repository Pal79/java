package solSys;

import java.util.List;

public class TaskManager {
	
	public void writingOutData(List<SolarSystemSizes> solSysList) {
		
		System.out.println("N = nap átmérője -> 1 392 700km");
		System.out.println();
		
		for(SolarSystemSizes ssList : solSysList) {
			
			System.out.println("Bolygó neve: " + ssList.getName());
			System.out.println(ssList.getName() + " átmérője: " + ssList.getDiameter());
			System.out.println("A(z)" + ssList.getName() + " naphoz viszonyított távolsága: " + ssList.getDistance());
			System.out.println();
			
		}
		
	}

}
