package pilotak;

import java.util.List;

public class App {
	
	public static void main(String[] args) {
		FileOperations fmObj = new FileOperations();
		List<Pilotak> pList = fmObj.fajlOlvas("pilotak.csv");
		Tasks tasksObj = new Tasks();
		
		System.out.print("3.feladat: ");
		System.out.println(tasksObj.howManyDataLine(pList));
		
		System.out.print("4.feladat: ");
		System.out.println(tasksObj.lastLinePilotName(pList));
		
		System.out.println("5.feladat: ");
		tasksObj.bornBeforeNineteenthCentury(pList);
		
		System.out.print("6.feladat: ");
		System.out.println(tasksObj.lowerStartNumberPilotNation(pList));
		
		System.out.print("7.feladat: ");
		tasksObj.whichStartNumbersEgal(pList);
	}

}
