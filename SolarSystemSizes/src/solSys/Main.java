package solSys;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		FileManager fmObj = new FileManager();
		List<SolarSystemSizes> solSysList = fmObj.solSysSize("solarSystemSizes.txt");
		
		TaskManager tmObj = new TaskManager();

	}

}
